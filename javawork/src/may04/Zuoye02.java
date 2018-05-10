package may04;

public class Zuoye02 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int x = 1; x <= i; x++) {
				System.out.print(x+ "*" + i+ "=" + x * i+ "\t");
			}
			System.out.println();
		}
	}
}
