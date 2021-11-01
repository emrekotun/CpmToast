# CpmToast

implementation
build.gradle 
```
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}

```
```
dependencies {
    implementation 'com.github.GrenderG:Toasty:1.5.2'
}

```
![normal_tos](https://user-images.githubusercontent.com/22660204/139630691-63be6d16-091f-481d-a873-3f9c936cafd4.png)
```
// Success Toast
 CpmToast.createColorToast(
            this,
            "Success !",
            CpmToast.TOAST_SUCCESS,
            CpmToast.GRAVITY_TOP,
            CpmToast.LONG_DURATION
        )
        
// Error
 CpmToast.createColorToast(
            this,
            "Error !",
            CpmToast.TOAST_ERROR,
            CpmToast.GRAVITY_TOP,
            CpmToast.LONG_DURATION
        )
// Warning
 CpmToast.createColorToast(
            this,
            "Warning !",
            CpmToast.TOAST_WARNING,
            CpmToast.GRAVITY_TOP,
            CpmToast.LONG_DURATION
        )
 // Info
 CpmToast.createColorToast(
            this,
            "Info !",
            CpmToast.TOAST_INFO,
            CpmToast.GRAVITY_TOP,
            CpmToast.LONG_DURATION
        )
```
