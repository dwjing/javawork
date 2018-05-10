package may07;

public class ArrayDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;
		int e = 10;
		int f = 10;
		int[] array = new int[6];
		// int arr[]=new int[6];
		array[0] = 10;
		array[1] = 10;
		array[2] = 10;
		array[3] = 10;
		array[4] = 10;
		array[5] = 10;
		System.out.println(array[0] + "" + array[5]);
		System.out.println("数组的长度" + array.length);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		int[] arry = { 70, 80, 190, 100, 110 };
		System.out.println("数组的长度：" + arry.length);
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
		int max = arry[0];
		for (int o = 0; o < arry.length; o++) {
			if (arry[o] > max) {
				max = arry[o];

			}
		}
		System.out.println("数组中最大值：" + max);

	}
}
