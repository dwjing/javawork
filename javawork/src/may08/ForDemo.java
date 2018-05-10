package may08;

public class ForDemo {
	public static void main(String[] args) {
		double money=10000;
		for(int i=0;i<5;i++) {
		double principal = money*0.003;
		money+=principal;
	}
		System.out.print("5年后的本金："+money);
	}
}
