Java Spring Boot Certification Project
May 2024

Spring Boot is a framework that gives you everything that you need to build applications -- There are many available features including security modules, logging, connection to databases, metrics, microservices, dependency injection,  etc.


What is the purpose of this project?
The purpose of this project is to create a rest API with Spring Boot so that customers can use Postman to make various requests (such as post, get, and delete) to and from our customer database. These requests travel to our customer database API, flowing through our business layer, DAO layer, and then to a real database (Postgres running on Docker) to receive appropriate responses, all while using N-tier architecture (where each layer is responsible for only one single thing). 

We can input customer data in the database via terminal, but we wanted to expose an API endpoint that clients can use to achieve the same thing in a more user-friendly manner.


What does your system need in order to create Java Spring Boot projects?

Maven: https://www.youtube.com/watch?v=YTvlb6eny_0

Tomcat: Tomcat is often pre-installed on development environments and servers, but the exact method of checking depends on your operating system and how Tomcat was installed (manually, via package manager, etc.).

Docker: https://www.youtube.com/watch?v=ZyBBv1JmnWQ
Note: Docker needs WSL (Windows Subsystem for Linux) to run properly. To see if it is already installed, go to terminal and type 
wsl --version
If nothing pops up or if there is an error, to install WSL on a Windows computer, go to terminal and type 
wsl --install
if you are still receiving an error, type 
wsl --status
and then it will likely have you update your current version of WSL via
wsl --update
Then, you should be good to go for WSL.
	

Postman: https://www.postman.com/

Optional: JSON viewer for chrome, so when we type the url in google, if there are many statements , it will look neater.






Guidelines to create the same project:


Once you have downloaded the items as mentioned above, download the files from GitHub and add them to your file structure. 

Then, the project must be built with Maven, which is a build automation tool for Java projects. First, navigate to terminal and run the following commands:

mvn clean install

mvn package


mvn clean install cleans any previously compiled files and resources from the target directory, and mvn package packages the project and its dependencies into a distributable format (like a JAR or WAR file) and installs it in the local Maven repository.

These two commands essentially handle compilation, dependency management, and packaging of the project. They ensure that all necessary dependencies are downloaded and included in the build.

Then, after successfully building the project with Maven, run the main.java file, navigate to the PowerShell.txt file from GitHub to see an example session where I successfully added a customer to the database and retrieved their information from the database, all using terminal.

If you would like to see the retrieval of the customer database information via Postman (via "get" request) navigate to the Postman.png file.






Normally, if one were starting from scratch, they would have to create the "skeleton" of the project by navigating to  
https://start.spring.io/

and then enter in the following:

Language- Java
Project- Maven
Spring Boot- 3.0.0 or later.

Metadata:
Group = com.amigoscode (You could also do com.jack)
Artifact: spring-boot-example
(leave name and description as they are, they should say spring-boot-example and Demo project for Spring Boot)
Package name: com.amigoscode
Packaging- Jar
Version of Java - Java 17 and above.
Then at top right of screen click dependencies, such as Spring Web if we want to do restful applications, etc… But for this example do Spring Web.
Then click explore at bottom middle and you will see the maven project with everything you just specified in the UI.
Close it, then click GENERATE and save it to your desktop, and then open it on your desktop with intelliJ or VS Code

And then CONFUSION- RUN THE MAIN FILE, OR DO THE MAVEN THING?












