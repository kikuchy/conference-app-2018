# ![](app/src/main/res/mipmap-mdpi/ic_launcher.png) DroidKaigi 2018 unofficial iOS app

# Features
TBD

# Contributing
We are always welcome your contribution!

# Development Environment

## requirement

- machine running macOS installed Xcode 9.2
- Apple developer program account
- iOS devices for running binary (iOS Simulator is unavailable for Kotlin/Native)
- CLion (optional)

## Kotlin/Native

To compile Kotlin/Native use following steps:

```
git clone https://github.com/JetBrains/kotlin-native.git
cd kotlin-native.git
./gradlew dependencies:update
# this may take around a hour
./gradlew dist distPlatformLibs
export PATH=./dist/bin:$PATH
```

## Credit
This project uses some modern Android libraries and source codes.

* [Kotlin](http://kotlinlang.org/) - JetBrains
* [Kotlin/Native](https://github.com/JetBrains/kotlin-native/) - JetBrains

## License

TBD
