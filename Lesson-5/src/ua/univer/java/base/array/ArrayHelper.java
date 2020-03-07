package ua.univer.java.base.array;

public class ArrayHelper {

	// Function to remove the element
	public static int[] removeTheElement(int[] arr, int index) {

		// If the array is empty
		// or the index is not in array range
		// return the original array
		if (arr == null || index < 0 || index >= arr.length) {

			return arr;
		}

		// Create another array of size one less
		int[] anotherArray = new int[arr.length - 1];

		// Copy the elements except the index
		// from original array to the other array
		for (int i = 0, k = 0; i < arr.length; i++) {

			// if the index is
			// the removal element index
			if (i == index) {
				continue;
			}

			// if the index is not
			// the removal element index
			anotherArray[k++] = arr[i];
		}

		// return the resultant array
		return anotherArray;
	}
}
