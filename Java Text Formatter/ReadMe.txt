# Java Text Formatter Project

I built a Java text formatter program with Lance Smith that will read words from an input file and write them to an output file -- It will remove extra whitespace and fill each line with as many words as will fit up to user-specified maximum column width (similar to a column of text in a newspaper). The input text file name, output text file name, and maximum column width are entered interactively when the program starts.

To use this program, open the TextFormatter.Java file in your favorite IDE for Java (I use Eclipse), and run it. Once you do so, it will prompt you to enter the path of the input text file, then it will prompt for the path of the output file, and then finally for the maximum width from 30 to 100 characters. An example of a path for the input file might look something like this: 

C:\Users\(your username)\OneDrive\Desktop\Doc1.txt

Note: To test this program, you may use Doc1.txt and Doc2.txt for input files, and then you may use Doc1Output.txt with Doc2Output.txt for output files.
.
.
.
.
.
I learned many things throughout this Text Formatter project. 

First, for input and output, we need important boiler plate import code at the top. Then, within our TextFormatter class, We need to make a scanner object to read the user input in the console, and we need to declare variables to store the input and output file paths, the files themselves, and the maxWidth variable which is the maximum desired number of characters that will go to each line in the output file.

Next, we have to prompt the user for the input file, and to achieve this we have to do a few things. First, we use a do-while loop just in case the user doesn't enter in a proper input file path -- the file must exist and be readable in order to proceed. It seems like do-while loops are effective when trying to validate user input. We then use scanner functionality to scan the user's input into our inputfilePath variable, which then stores that file into the other variable we defined known as inputFile. 

The next step is to prompt the user for the output file, which we accomplish in a similar fashion, except for the output file, we check if the output file exists and if the want to overwrite it, and if they enter in "yes", this exits the loop and continues the process. 

Afterwards, we need to open the input file for reading and open the output file for writing, which can be seen here:

Scanner fileScanner = new Scanner(inputFile)

which creates a Scanner object called fileScanner to read the input file (inputFile) passed as a parameter, and also 

PrintWriter fileWriter = new PrintWriter(outputFile)

Which creates a PrintWriter object called fileWriter to write to the output file, with (outputFile) passed as a parameter.

The next step is to collect the maxWidth from the user and ensure it is between 30 and 100.  Now, to satisfy the requirement to add a line of asterisks followed by a line of spaces, we do two simple for-loops, but must be careful to reset the currentLine variable back to empty afterwards so it can be ready to receive input for the next steps.

Then, we make a while loop -- while the fileScanner (linked to input) "hasNext" or has another value, we put that value into the "word" string variable:

while (fileScanner.hasNext()) {
                String word = fileScanner.next();

Afterwards, the condition if ((currentLine + " " + word).length() <= maxWidth) checks whether adding the next word (our word variable) to the current line (currentLine) while including a space separator (" ") would exceed the specified maximum width (maxWidth) that the user inputted -- if the condition is true (i.e., adding the word would not exceed the maximum width), we just add the word to the current line with a space as a separator. But, if the condition is false (i.e., adding the word and a space WOULD exceed the maximum width), it actually Writes the finished current line (currentLine) to the output file using fileWriter.println(currentLine) and then resets currentLine to the current word (currentLine = word) to start a new line. This process keeps occuring while the "fileScanner.hasNext()" parameter inside the while loop is true. Once the condition is finally false, it breaks the loop, and progresses to the following code:

" if (!currentLine.isEmpty()) {
                fileWriter.println(currentLine);
            }
            System.out.println("Transfer completed!");
"
By doing this, we are able to write the last line to the output file because lines are only added once they exceed maxWidth. Since the last line won't exceed maxWidth, it won't be added unless we include this code. Overall, this assignment is an excellent for acquainting someone to input and output files.