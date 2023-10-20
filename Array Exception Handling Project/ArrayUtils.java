package exceptionhandlingpackage;

public class ArrayUtils {

	public static int minValue(int[] list) throws BadArrayException {
		//searches parameter array to locate the min value and returns it 
		if (null == list) {
		    throw new BadArrayException("Array is null");
		} else if (list.length == 0) {
		    throw new BadArrayException("Array is empty");
		}

	 int min = list[0]; // Initialize min with the first element of the array.

     // Iterate through the array to find the minimum value.
     for (int i = 1; i < list.length; i++) {
         if (list[i] < min) {
             min = list[i]; // Update min if a smaller value is found.
         }
     }
     return min;
 }
	
public static int[] copyRange(int[] list, int startIndex) throws BadArrayException {
	//copies the specified range of elements from list array into 
	//a new array (newList) and returns it.

	if (list == null) {
		throw new BadArrayException("Array is null");
	} else if (startIndex < 0 || startIndex > list.length) {
		throw new ArrayIndexOutOfBoundsException(startIndex);
		//startIndex needs to be the exception object parameter
	}
	
	int[] newList = new int[list.length - startIndex];
	int endIndex = list.length;
	
	for (int i = startIndex; i < endIndex; i++) {
		newList[i - startIndex] = list[i];

		}
	return newList;
	}	
	
public static int indexOf(int[] list, int searchValue) throws BadArrayException {
	
	if (list == null) {
		throw new BadArrayException("Array is null");
		
	} else if (list.length == 0) {
		return -1;
	}
	
	for (int i=0; i < list.length; i++) {
		if (list[i] == searchValue) {
			return i;
		}
	}
	return -1;
}

public static int lastIndexOf(int[] list, int searchValue) throws BadArrayException {
	//searches the parameter array to locate the last occurrence of the parameter 
	//searchValue, and returns its index position if found, or -1 if not found.
	if (list == null) {
		throw new BadArrayException("Array is null");
		
	} else if (list.length == 0) {
		return -1;
	}
	
	int lastIndex = -1;
	for (int i=0; i < list.length; i++) {
		if (list[i] == searchValue) {
			lastIndex = i;
		}
	}
	return lastIndex;
}
}
