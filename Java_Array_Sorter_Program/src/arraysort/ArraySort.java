package arraysort;
import java.util.Scanner;

//ArraySort is a class that asks the user for 3 to 10 numbers and then sorts the numbers from low to high in the form of an array.
public class ArraySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean continueSorting = true;
		while (continueSorting) {
			
			System.out.println("Enter the size of the array (3 to 10): ");
			int arraySize = sc.nextInt();
			if (arraySize < 3 || arraySize > 10) {
				System.out.println("Invalid array size. Exiting...");
				break;
			}
			
			int[] newArray = new int [arraySize];
			
			for (int i = 0; i < arraySize; i++) {
			    System.out.println("Enter value for element " + i + ": ");
			    newArray[i] = sc.nextInt();
			}
			
			 int[] unsortedArray = newArray.clone(); // Create a copy of newArray
	         int[] sortedArray = newArray.clone();   // Create a copy of newArray	

            
            sortArray(sortedArray);

            System.out.println("The unsorted values...");
            printArray(unsortedArray);

            System.out.println("The sorted values...");
            printArray(sortedArray);
            
            System.out.println("Done. Type yes to start a new session. ");
            String userInput = sc.next();
            continueSorting = userInput.equalsIgnoreCase("yes");
        }

        sc.close();
    }
				
			public static void fillArray(int[] array) {
				  Scanner sc = new Scanner(System.in);

			        for (int i = 0; i < array.length; i++) {
			            array[i] = sc.nextInt();
			        }
			    }

			public static void sortArray(int[] array) {
				//bubble sort algorithm
				boolean swapped;
				do{
					swapped = false;
					for (int n = 0; n < array.length - 1; ++n) {
				
					if (array[n] > array[n + 1]) {
						int temp = array[n];
						array[n] = array[n+1];
						array[n +1 ] = temp;
						swapped = true;
					}
				}
			} while(swapped);
		}				
			public static void printArray(int[] array) {
		        for (int i = 0; i < array.length; i++) {
		            System.out.println(array[i]);
		        }
		    }
		}
