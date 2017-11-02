import java.util.Arrays;

public class Sandbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][][] arr = { { { 1, 2, 3, 4 }, { 1, 2 }, {3, 4, 5} } };

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));

		
		
		//multiplyBy5(arr);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
	}

	public static void multiplyBy5(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] *= 5;

			}
		}
	}
}