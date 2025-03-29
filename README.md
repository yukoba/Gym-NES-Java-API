# Gym NES Java API

The source code was generated using [JExtract](https://jdk.java.net/jextract/) and has been confirmed to work on Ubuntu 24.04.

## Ubuntu 24.04

Please compile [the Gym NES C API](https://github.com/yukoba/Gym-NES-C-API) and copy `build/libGymNes.so` to the top folder.

```sh
sudo apt install maven openjdk-21-jdk

MAVEN_OPTS="--enable-preview" mvn package -DskipTests
MAVEN_OPTS="--enable-preview --enable-native-access=ALL-UNNAMED -Djava.library.path=." mvn exec:java -Dexec.mainClass=jp.yukoba.gymnes.Test -Dexec.args=SuperMarioBros.nes -Dexec.classpathScope=test
```
