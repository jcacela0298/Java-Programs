This project was completed by Jack Cacela and Lance Smith. This Java String Validator project is designed to assess whether or not a string input is a valid integer (true) or not (false). 

When we run the ValidateTest.java file, it calls the isValidInt method (with a parameter of your choosing) from the JavaStringValidate class, and it returns either true or false. In order to run this file, download both the JavaStringValidate.java file and the ValidateTest.java file into your favorite IDE, and then run the ValidateTest.java file. Make sure you put the parameter you wish at line 10 in the ValidateTest.java file -- The default parameter is the string "42", which is a valid integer and should return true.

Here is the prompt for the project: 
"Write a static method that checks if a String represents a valid
    integer value and returns true if valid, or false if not.  For
    example, "123", "-45", and "0" are valid integers, but "x7" and
    "3.14" are not. Use java.lang.Integer.parseInt() to perform the
    actual validity checking inside your method. Your method should
    also return false if the parameter String is null or empty.
    It should NOT throw any exceptions back to the caller (but may
    use exceptions internally).

    Use the following prototype for your method:

      public static boolean isValidInt(String testIntval)

    Show example output for the following values entered:
    "42"
    "-123"
    "12-34"
    "10.5"
    "x7"
    ""  (length 0 string)
    null (pass a Java null reference in a hardcoded call to isValidInt)"

I learned many things throughout this project. Because the IsValidInt() method in the JavaStringValidate Class is static, that means in order to call it in our ValidateTest class, we need to use that method's class name since the method belongs to that class, so the syntax is as follows: 

JavaStringValidate.isValidInt("42");

I reinforced to myself that if a class is declared as public, it can in fact be used outside of the package it is in. As long as another class elsewhere has the correct import statement, the class can be used. However, if we want it to only be used within the same package, removing the "public" keyword declaration makes it so it defaults to package-private, and the syntax would be as follows:

class JavaStringValidate {}

I also learned that just because public is declared does not mean someone from another computer can directly access this code. That person would need to have access to the same "Java codebase", where they would need access to the source code or compiled class files of these classes, so they would need to download the file into their own system first. Apparently, in typical development / distribution scenarios, I would contribute my class as part of a Java Archive file (JAR) so that others can include it in their projects.

I learned that the shortcut to running a file in Eclipse is Ctrl + F11 on Windows.


