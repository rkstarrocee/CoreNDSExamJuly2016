package math;
public class LowestNumber {
	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 */
		int  array[] = new int[]{110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
		int lowest = array[0];

		for (int i = 0; i <array.length ; i++) {
			if (lowest>array[i]) {              //Check lowest = array[0]; with array numbers
				lowest = array[i];              // If lowest>array[i] than save array[i] in lowest
			}
		}
		System.out.println("The Lowest number is: "+ lowest);
	}
}
