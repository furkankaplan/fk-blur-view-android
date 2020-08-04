# FKBlurView

If you are familiar with iOS app development, you have used UIVisualEffectView at least one time. iOS SDK has this view for years but unfortunately Android SDK doesn't provide a native solution. This library provides you FKBlurView which is alternative of UIVisualEffectView in iOS. 
You can use it in everywhere as a background of a dialog view or part of a profile page etc.

## How to install?

You can add the library to your project using **jitpack.io**. Add the code below to your **app's gradle** file.

```
   allprojects {
        repositories {
            jcenter()
            maven { url "https://jitpack.io" }
        }
   }
   dependencies {
        implementation 'com.github.furkankaplan:fk-blur-view-android:1.0.0'
   }
```   

<img src="fk-blur-view-android/screenshot/example-project-screenshot.png" width="30%" height="30%"/>

## How to use?

In this example, you can blur banner_image_view with the FKBlurView.

activity_main.xml
```
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    
     <ImageView
        android:id="@+id/banner_image_view"
        android:layout_width="match_parent"
        android:layout_height="300dp"
        android:scaleType="center"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:src="@drawable/profile_picture"/>

    <com.github.furkankaplan.fkblurview.FKBlurView
        android:id="@+id/fkBlurView"
        android:layout_width="0dp"
        android:layout_height="0dp"
        app:layout_constraintTop_toTopOf="@id/banner_image_view"
        app:layout_constraintStart_toStartOf="@id/banner_image_view"
        app:layout_constraintEnd_toEndOf="@id/banner_image_view"
        app:layout_constraintBottom_toBottomOf="@id/banner_image_view"/>
        
</androidx.constraintlayout.widget.ConstraintLayout>
```
MainActivity.java
```
 FKBlurView blurView = findViewById(R.id.fkBlurView);
 // Blur level starts from 1. It's minimum level.
 // Default blurLevel 50 if you don't pass any value. or use blurView.getBlur(this, blurView, 20);
 blurView.getBlur(this, blurView);
```
You can check it out in **example project**.

## Author

Furkan Kaplan https://github.com/furkankaplan <br>
Twitter  : [@furkaplan](https://twitter.com/furkaplan) <br>
LinkedIn : [@furkankaplan07](https://www.linkedin.com/in/furkankaplan07/) <br>
Email    : **furkankaplan@outlook.com**
