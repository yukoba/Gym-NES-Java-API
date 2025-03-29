# Gym NES Java API

The source code was generated using [JExtract](https://jdk.java.net/jextract/) and confirmed to work on Ubuntu 24.04 and MSYS2.

## Ubuntu 24.04

Please compile the [Gym NES C API](https://github.com/yukoba/Gym-NES-C-API) and copy `build/libGymNes.so` to the top folder.

```sh
sudo apt install maven openjdk-21-jdk

MAVEN_OPTS="--enable-preview" mvn package -DskipTests
MAVEN_OPTS="--enable-preview --enable-native-access=ALL-UNNAMED -Djava.library.path=." mvn exec:java -Dexec.mainClass=jp.yukoba.gymnes.Test -Dexec.args=SuperMarioBros.nes -Dexec.classpathScope=test
```

## MSYS2 MINGW64 (Windows)

Please compile the [Gym NES C API](https://github.com/yukoba/Gym-NES-C-API) and copy `build/libGymNes.dll` to the top folder.

Install Apache Maven and Java Development Kit 21.

```bat
set "JAVA_HOME=C:\Program Files\Java\Jdk-21"
set "PATH=C:\msys64\mingw64\bin;C:\Program Files\Java\apache-maven-3.9.9\bin;%PATH%"
set "MAVEN_OPTS=--enable-preview --enable-native-access=ALL-UNNAMED -Djava.library.path=."

rename libGymNes.dll GymNes.dll

mvn package -DskipTests
mvn exec:java -Dexec.mainClass=jp.yukoba.gymnes.Test -Dexec.args=SuperMarioBros.nes -Dexec.classpathScope=test
```


# Related project

- [Arcade Learning Environment Java API](https://github.com/yukoba/Arcade-Learning-Environment-Java-API) - Arcade Learning Environment version of this.
