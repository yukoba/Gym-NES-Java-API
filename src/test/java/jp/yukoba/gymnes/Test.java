package jp.yukoba.gymnes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static jp.yukoba.gymnes.emulator_c_h.*;

@SuppressWarnings("preview")
public class Test {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: mvn exec:java -Dexec.mainClass=jp.yukoba.gymnes.Test -Dexec.args=<rom_file> -Dexec.classpathScope=test");
            return;
        }

        System.loadLibrary("GymNes");

        try (Arena arena = Arena.ofConfined()) {
            MemorySegment emulator = emulator_create(arena.allocateUtf8String(args[0]));
            emulator_reset(emulator);

            MemorySegment screen = emulator_get_screen_buffer(emulator);
            MemorySegment controller = emulator_get_controller(emulator, 0);

            int width = emulator_get_width();
            int height = emulator_get_height();

            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            int[] bufferedImageAry = ((DataBufferInt) bufferedImage.getRaster().getDataBuffer()).getData();

            JFrame frame = new JFrame("NES");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().setPreferredSize(new Dimension(width * 2, height * 2));
            frame.getContentPane().setFocusable(true);
            frame.getContentPane().addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    int keyNo = toKeyNo(e);
                    if (keyNo != -1) {
                        controller.set(JAVA_BYTE, 0, (byte) (controller.get(JAVA_BYTE, 0) | (1 << keyNo)));
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    int keyNo = toKeyNo(e);
                    if (keyNo != -1) {
                        controller.set(JAVA_BYTE, 0, (byte) (controller.get(JAVA_BYTE, 0) & ~(1 << keyNo)));
                    }
                }

                private int toKeyNo(KeyEvent e) {
                    return switch (e.getKeyCode()) {
                        case 10 -> 3; // ENTER = START
                        case 37 -> 6; // LEFT
                        case 38 -> 4; // UP
                        case 39 -> 7; // RIGHT
                        case 40 -> 5; // DOWN
                        case 65 -> 0; // A
                        case 66 -> 1; // B
                        case 83 -> 2; // S = SELECT
                        default -> -1;
                    };
                }
            });
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    emulator_destroy(emulator);
                }
            });
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            Timer timer = new Timer(16, _ -> {
                emulator_step(emulator);
                MemorySegment.copy(screen, JAVA_INT, 0, bufferedImageAry, 0, bufferedImageAry.length);

                Graphics graphics = frame.getContentPane().getGraphics();
                graphics.drawImage(bufferedImage, 0, 0, width * 2, height * 2, null);
            });
            timer.start();
        }
    }
}
