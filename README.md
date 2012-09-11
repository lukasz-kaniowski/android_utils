# Android Utils 
Utils for android development. 

## Installation
### Maven
Add to your pom:

	 <repositories>
        <repository>
            <id>Lukasz Kaniowski on Github</id>
            <url>https://github.com/lukasz-kaniowski/maven-repository/raw/master</url>
        </repository>
    </repositories>
### Eclipse/Idea
Simple copy jar from this [maven-repo][1] into your project dependencies.

## Modules
### Ads
Utils for displaying ads in your application. 
It supports [admob mediation][2] with providers:

* [TapForTap][3]
* [AppBrain AppLift][4]

Methods:

* `AdsUtils.showAds` => display ads 
* `AdsUtils.initTapForTap` => initialize TapForTap
* `AdsUtils.initAppLift` => initialize AppBrain
* `AdsUtils.showInterstitial` => shows full page ads

#### Instalation
        <dependency>
            <groupId>com.lukaszkaniowski.android_utils</groupId>
            <artifactId>ads</artifactId>
            <version>0.3</version>
        </dependency>


### WebView
Utils for working with webviews. 

* `WebViewUtils.startUrlIntent` => Starts intent for url (supports: `mailto://`, `market://`) 

#### Instalation
        <dependency>
            <groupId>com.lukaszkaniowski.android_utils</groupId>
            <artifactId>web_view</artifactId>
            <version>0.1</version>
        </dependency>

## Release

    mvn release:prepare
    mvn release:perform -Pdeploy-github

    cd /path/to/local/github/repo
    git add .
    git commit -m "new jar release"
    git push origin master


        
        
[1]: https://github.com/lukasz-kaniowski/maven-repository/tree/master/com/lukaszkaniowski/android_utils
[2]: https://support.google.com/admob/bin/answer.py?hl=en&answer=2413211
[3]: http://r.tapfortap.com/8zyN9
[4]: https://developers.appbrain.com/info/sdk