package may09;

import java.util.Scanner;

public class ConvertDemo {
public static void main(String[] args) {
	//输入一个正整数，将该数的各位左右反转输出，即输入123，输出321
	//输入：4567输出7654
	Scanner scanner = new Scanner (System.in);
	System.out.println("输入一个正整数：");
	int num = scanner.nextInt();
	
	int s =0;
	while(num>0) {
		s=s*10+num%10;
		num/=10;
	}
	System.out.println(s);
}
}
