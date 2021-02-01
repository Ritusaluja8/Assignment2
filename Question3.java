package arrayAssignment;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {84,67,54,34,90,42,70,51,61,12};
		
		// sorting in ASC order using bubble sort
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
			if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));


	}

}
