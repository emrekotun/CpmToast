# CpmToast
Perfect Toast Messages

Add this in your root build.gradle :
```
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```
Add this to your module's build.gradle
```
dependencies {
    implementation 'com.github.GrenderG:Toasty:1.5.2'
}
```
![normal_tos](https://user-images.githubusercontent.com/22660204/139630691-63be6d16-091f-481d-a873-3f9c936cafd4.png)

<b>Usage</b> <br/><br/>
Success Toast
```
CpmToast.createColorToast(
            this,
            "Success !",
            CpmToast.TOAST_SUCCESS,
            CpmToast.GRAVITY_TOP,
            CpmToast.LONG_DURATION
        )
 ```  
Error Toast
 ```
 CpmToast.createColorToast(
            this,
            "Error !",
            CpmToast.TOAST_ERROR,
            CpmToast.GRAVITY_TOP,
            CpmToast.LONG_DURATION
        )
 ```
Warning Toast
 ```
 CpmToast.createColorToast(
            this,
            "Warning !",
            CpmToast.TOAST_WARNING,
            CpmToast.GRAVITY_TOP,
            CpmToast.LONG_DURATION
        )
 ```
Info Toast
```
 CpmToast.createColorToast(
            this,
            "Info !",
            CpmToast.TOAST_INFO,
            CpmToast.GRAVITY_TOP,
            CpmToast.LONG_DURATION
        )
```
