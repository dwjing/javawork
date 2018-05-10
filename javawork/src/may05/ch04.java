package may05;

public class ch04 {
	public static void main(String[] args) {
		int i =1;
		while(i<=9) {
			int j=1;
			while(j<=i) {
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
