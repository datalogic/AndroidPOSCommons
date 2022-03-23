
[![](https://jitpack.io/v/datalogic/androidpos-commons.svg)](https://jitpack.io/#datalogic/androidpos-commons)

# Description
This project contains the commons module (library) for the AndroidPOS library. It contains all commons interfaces and constants.

# How to use the library
Add in your root build.gradle at the end of repositories:
~~~gradle
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
~~~
Add the following dependency to your gradle file:
~~~gradle
    dependencies {
	        implementation 'com.github.datalogic:androidpos-commons:0.1-alpha'
	}
~~~