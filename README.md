# CpmToast

implementation
build.gradle 
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
```
 implementation 'com.github.emrekotun:CpmToast:v1.0.1'
```

![github_cover](https://user-images.githubusercontent.com/22660204/139278582-9a00616f-bb18-4732-a0ba-75b27220d668.png)

```
// Success
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
