package may04;

import java.util.Scanner;

public class zuoye01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个年份: ");
		int year = scanner.nextInt();
		if (year % 400 == 0) {
			System.out.println("闰年");
		} else if (year % 100 != 0 && year % 4 == 0) {
			System.out.println("闰年");
		} else {
			System.out.println("不是闰年");
		}
	}
}
