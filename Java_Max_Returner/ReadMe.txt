This project was completed by Jack Cacela and Lance Smith. This Java MaxValueReturn project is designed to accept three integer parameters and return the highest value.

If you would like a tutorial on how to correctly upload/download Java Eclipse projects to/from GitHub, check out my YouTube video: https://www.youtube.com/watch?v=qCrTzBX3OOg&t=2s

When we run the MaxValueReturn.java file, it calls the max method (with 3 integer parameter of your choosing) which compares each integer parameter value, assesses which is the highest, and returns that integer. In order to run this file, download the MaxValueReturn.java file into your favorite IDE, and then run the MaxValueReturn.java file. Make sure you put the parameters you wish at line 6 -- The default parameters are 100, 500, and 500, which are three valid integers, and this should return 500.

Here is the prompt for the project:
 
"Write a Java method that returns the largest value passed to it.
    Use the following prototype:

    public static int max(int val1, int val2, int val3) {
      // return the largest of the three values...
    }

    For example, the following call of your method sets 'n' to 30:

    int n = max(20, 30, 10);

    Note that any three values can be passed to this method.
    The following would also set 'n' to 30:

    int n = max(30, 30, 10);

    Write a main() method to test your max method.  It should input
    three values, call your max method, and then print the three
    values and returned max value as output, eg:

    Input values: 30 20 10  - max value is 30
    
    The max() method cannot read any input values, nor print any
    output values.  All input and printing is done by the main()
    method that calls max().

    Paste in both your source code for your max() method, and
    the runtime output showing the parameter values and returned
    maximum value for the following sample input values:

    a) 30, 30, 30
    b) 10, -10, 20
    c) 40, 60, 50
    d) 90, 70, 80
    e) 50, 50, 25
    f) 50, 50, 75
    g) 200, 100, 200
    h) 200, 400, 200
    i) 300, 500, 500
    j) 700, 500, 500

"
.
.
.
.
.
I learned many things throughout this project. While the max() method in the MaxValueReturn class is static, that means in order to call it in a different class, we need to use that method's class name. However, since we are using it within the same class, we do not need to use the format MaxValueReturn.max() - We can just use max().

I also learned that we don't necessarily need a helper class to handle logic if the code is not complex. Since we only have some logic, it makes sense to just keep it all organized in one file.
