package may08;

import java.util.Scanner;

public class BubbleDEMO {
	public static void main(String[] args) {
		int[] array = new int[7];
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入 7个整数");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		array=bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	private static int[] bubbleSort(int[] array) {
		//相邻的元素比较的次数（7个数只需要比6次 就可获得最大值或者最小值 ）
		for(int x=0;x<array.length-1;x++) {
			for (int y=0;y<array.length-x-1;y++) {
				//-x:让每次参与比较的元素
				//-1：避免下标越界
				if(array[y]>array[y+1]) {
					int temp=array[y];
					array[y]=array[y+1];
					array[y+1]=temp;
				}
			}
			
		}
		return array;
	}
}
