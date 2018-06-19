# NUS Orbital 2018 - Software Testing


### Things to Bring:
1.  Writing Materials and Papers (Very important)
2.  Charged laptop + Laptop Charger

### Pre-requisites:

1.  **Java JDK 8 and above.** 
Not sure? Just download [JDK 10](http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html).

2.  [**IntelliJ IDE (Community / Ultimate)**](https://www.jetbrains.com/idea/download).

3.  **Maven** - Download the binary archive [Non-Windows](http://www-us.apache.org/dist/maven/maven-3/3.5.3/binaries/apache-maven-3.5.3-bin.tar.gz) / [Windows](http://www-us.apache.org/dist/maven/maven-3/3.5.3/binaries/apache-maven-3.5.3-bin.zip) and follow instructions [here](https://maven.apache.org/install.html).

### Importing Project into IntelliJ:

1. Download the source code [here](https://github.com/robinloh/NUS_Orbital_2018_Demo/releases/tag/V1.0).
2. Unzip the folder.
3. Open IntelliJ and select `Import Project`.
4. In the folder, there is a file named `pom.xml`. Select this file to import, not the folder!
5. Click `Next` > `Next`.
6. Select the Java JDK you have downloaded earlier. 
7. Click `Next` > `Next` > `Finish`
8. If `Tip of the Day` popup appears, close it.
9. This is when the Build Automation comes into play - IntelliJ downloads the necessary plugins and dependencies defined in `pom.xml`, without you downloading them manually.


### Final Checks:
Click on `Build` > `Rebuild Project`. The project should compile successfully.
