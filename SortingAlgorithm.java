public class SortingAlgorithm {
	public static void main (String [] args) {
		int [] array = {3, 5, 1, 2};
		int [] array2 = {25, 31, 12, 41};
		int [] array3 = null;
		int [] array4 = {-35, 12, 100, -1};
		int [] array5 = {2, 2, 2, 2, 2};
		int[] temp = SortingAlgorithm.sort(array);
		SortingAlgorithm.print(temp);
		temp = SortingAlgorithm.sort(array2);
		SortingAlgorithm.print(temp);
		temp = SortingAlgorithm.sort(array3);
		SortingAlgorithm.print(temp);
		temp = SortingAlgorithm.sort(array4);
		SortingAlgorithm.print(temp);
		temp = SortingAlgorithm.sort(array5);
		SortingAlgorithm.print(temp);

		
		
		
		
		
	}
	public static int[] sort(int[] input) {
		if (input == null) {
			throw new IllegalArgumentException("Your array is null");
		}
		int temp = 0;
		int[] ret = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			ret[i] = input[i];
		}
		for (int i = 1; i < ret.length; i++) {
			if (ret[i] > ret[i - 1]) {
				temp = ret[i];
				ret[i] = ret[i - 1];
				ret[i - 1] = temp;
			}
		}
		return ret;

	}
	public static void print(int[] input) {
		for (int i = 0; i<input.length; i++) {
			System.out.print(input[i]+ " ");
			
		}
		System.out.println();
	}
}
