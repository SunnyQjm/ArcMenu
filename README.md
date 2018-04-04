## 第一步： 
  * Add it in your root build.gradle at the end of repositories:
	```gradle
    allprojects {
            repositories {
                maven { url 'https://jitpack.io' }
            }
        }
    ```
## 第二步
  * Add the dependency
    ```
    dependencies {
    	        compile 'com.github.SunnyQjm:ArcMenu:v1.0.0'
    	}
    ```