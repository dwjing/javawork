package may04;

public class Hi {
	public static void main(String[] args) {
		int i = 0;
		int b = 0;// 保存两个相邻偶数的和
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
				b += i;
			}
			i++;
		}
		System.out.println("偶数和" + b);

	}
}
