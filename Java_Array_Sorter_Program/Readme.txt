Array Sorter

I built an Array Sorter program that can ask the user for 3 to 10 numbers and then sort the numbers from low to high in the form of an array.

If you would like a tutorial on how to upload/download Java Eclipse projects to/from GitHub, check out my YouTube video: https://www.youtube.com/watch?v=qCrTzBX3OOg&t=2s

To use this program, open the .Java file in your favorite IDE for Java (I use Eclipse). Please ensure that the name of the package at the top of the file corresponds to the name of the project's package that the file is in. Then, run the arraySort file and it will prompt you to enter the amount of numbers you wish to sort between 3 and 10, and then it will ask for the corresponding numbers. 

There is another file in this folder called Sample Output.txt that has input and output examples.
.
.
.
.
.
During this project, I learned more about scanner functionality, how to make a program without the use of a helper class, boolean "while-loops", how to create new integer arrays, how to pass and accept arrays as parameters, for-loops for array parameter assignment, scanner closing functionality, how one cannot perform .length operations on a primitive data type such as an integer, using .clone, using printArray(//array of your choosing), overall Java syntax, and the bubble sort algorithm with do-while loop functionality. Also, in particular, I enjoyed learning about this for loop: 

for (int i = 0; i < arraySize; i++) {
			    System.out.println("Enter value for element " + i + ": ");
			    newArray[i] = sc.nextInt();

Which efficiently prompts the user for each value of the array and stores each response in that array's respective position.
