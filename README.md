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
   implementation 'com.github.emrekotun:CpmToast:1.0.2'
}
```
![normal_tos](https://user-images.githubusercontent.com/22660204/139630691-63be6d16-091f-481d-a873-3f9c936cafd4.png)

<b>Usage</b> <br/><br/>
Success Toast
```
toastSuccess("Message !") // Default Short Duration
 ``` 
 ```
 toastSuccess("Message !",CpmToast.LONG_DURATION)
 ```
Error Toast
 ```
toastError("Message !")
 ```
Warning Toast
 ```
toastWarning("Message !")
 ```
Info Toast
```
toastInfo("Message !")
```
