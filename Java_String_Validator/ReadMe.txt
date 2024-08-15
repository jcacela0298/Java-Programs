This Java String Validator project is designed to assess whether or not a string input is a valid integer (true) or not (false). 

If you would like a tutorial on how to upload/download Java Eclipse projects to/from GitHub, check out my YouTube video: https://www.youtube.com/watch?v=qCrTzBX3OOg&t=2s

When we run the ValidationTest.java file, it calls the isValidInt method (with a parameter of your choosing) from the StringValidation class, and it returns either true or false. In order to run this file, download both the StringValidation.java file and the ValidationTest.java file into your favorite IDE, and then run the ValidationTest.java file. Make sure you put the parameter you wish at line 10 in the ValidationTest.java file -- The default parameter is the string "42", which is a valid integer and should return true.
.
.
.
.
.
I learned many things throughout this project. Because the IsValidInt() method in the StringValidation Class is static, that means in order to call it in our ValidationTest class, we need to use that method's class name since the method belongs to that class, so the syntax is as follows: 

StringValidation.isValidInt("42");

I reinforced to myself that if a class is declared as public, it can in fact be used outside of the package it is in. As long as another class elsewhere has the correct import statement, the class can be used. However, if we want it to only be used within the same package, removing the "public" keyword declaration makes it so it defaults to package-private. I also learned that just because public is declared does not mean someone from another computer can directly access this code. That person would need to have access to the same "Java codebase", where they would need access to the source code or compiled class files of these classes, so they would need to download the file into their own system first. In typical development/distribution scenarios, I would contribute my class as part of a Java Archive file (JAR) so that others can include it in their projects. I also learned that the shortcut to running a file in Eclipse is Ctrl + F11 on Windows.
