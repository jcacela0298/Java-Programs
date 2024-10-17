Java Spring Boot Certification Project
May 2024


**Note: This Project Uses VS Code as the IDE for Java**

Spring Boot is a framework that gives you everything that you need to build applications -- There are many available features including security modules, logging, connection to databases, metrics, microservices, dependency injection,  etc.


What is the purpose of this project?

The purpose of this project is to create a rest API with Spring Boot so that customers can use Postman to make various requests (such as post, get, and delete) to and from our customer database. These requests travel to our customer database API, flowing through our business layer, DAO layer, and then to a real database (Postgres running on Docker) to receive appropriate responses, all while using N-tier architecture (where each layer is responsible for only one single thing). 
We can input customer data in the database via terminal, but we wanted to expose an API endpoint that clients can use to achieve the same thing in a more user-friendly manner using Postman.


What does your system need in order to create Java Spring Boot projects?

Java with VS Code: https://www.youtube.com/watch?v=BB0gZFpukJU
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
Postman: 
Make an account here: https://www.postman.com/
Download the desktop app here: https://www.postman.com/downloads/

Optional: JSON viewer for chrome, so if you ever want to type the url in google instead of via Postman, it will look neater.






Guidelines to create the same project:


Once you have followed the instructions above and downloaded the necessary items, clone the Java repository from GitHub. Then, I recommend moving the Java_SpringBoot_Program file elsewhere, such as your desktop, to keep it separate from the cloned repository.
 
In order to run the main.java file, open the Docker application, and then in VS Code, open the Java_SpringBoot_Program folder from your desktop (separate from the repository) as a new project, so that all of those files automatically show up in VS Code, and make sure to download 2 extensions for VS Code: Java, and Extension Pack for Java, so that Java and Maven are supported in order for the building of the project to work. Then, navigate to the explorer tab, and in your project folder, navigate to the Main.java file which is under src > main > java > com > jack > Main.java. 

Next, you may be able to just run the main.java file. If that doesn't work, press control shift-d and click "Launch Main" at the top left if it is there. If that doesn't work, Click the main.java file, press control shift-d , then at the top, click run, then run configuration, and then it should show a launch.json file which needs to contain the following code: 

{
    // Use IntelliSense to learn about possible attributes.
    // Hover to view descriptions of existing attributes.
    // For more information, visit: https://go.microsoft.com/fwlink/?linkid=830387
    "version": "0.2.0",
    "configurations": [

        {
            "type": "java",
            "name": "Launch Current File",
            "request": "launch",
            "mainClass": "${file}"
        },
        {
            "type": "java",
            "name": "Launch Main",
            "request": "launch",
            "mainClass": "com.jack.Main",
            "projectName": "spring-boot-example"
        }
    ]
}


Then at the top left, click the green arrow for "Launch Main" and this should successfully run the Spring Boot application.

Next, navigate to the PowerShell.txt file (Easily viewable at the root of the repository folder) from GitHub to see an example session where I successfully added a customer to the database and retrieved their information from the database, all using terminal. Make sure that you are in the directory that contains the docker-compose.yml file.

If you would like to see a "get request" example of interacting with the database via Postman, navigate to the Postman.png file, which is also easily viewable at the root of the repository folders.

.
.
.
.
.
.
.

P.S. Normally, if one were making a Java SpringBoot project starting from scratch, they would have to create the "skeleton" of the project by navigating to  
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

At this point, you would then just add the other required files as needed.
