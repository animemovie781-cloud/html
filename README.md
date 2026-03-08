# Android Native Video Player

एक professional Android video player application जो native VideoView के साथ बनाया गया है।

## Features ✨

✅ **Native VideoView** - Built-in Android video player component  
✅ **MediaController** - Play, pause, seek, volume controls  
✅ **File Selection** - Device storage से videos select करें  
✅ **Permission Handling** - External storage permissions  
✅ **Simple UI** - Clean और intuitive interface  
✅ **Kotlin & Java** - Modern Android development

## Project Structure

```
android-video-player/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/videoplayer/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   └── VideoPlayerActivity.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   └── activity_video_player.xml
│   │   │   │   └── values/
│   │   │   │       └── strings.xml
│   │   │   └── AndroidManifest.xml
│   │   └── build.gradle
```

## Requirements

- Android Studio 4.0+
- Android SDK 21+ (Android 5.0)
- Kotlin 1.5+

## Installation

1. इस repository को clone करें
2. Android Studio में खोलें
3. Gradle files sync करें
4. Project build करें
5. Android device/emulator पर run करें

## Permissions

```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
```

## Usage

1. App को launch करें
2. "Select Video" button पर click करें
3. अपना video चुनें
4. Player में play होगा MediaController के साथ

## Technologies Used

- **Language**: Kotlin & Java
- **UI Framework**: Android AppCompat
- **Video Component**: Native VideoView
- **Build System**: Gradle

## Developer

Created by: animemovie781-cloud

## License

MIT License - यह project freely available है।