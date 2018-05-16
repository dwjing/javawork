package may16;

public class CoustomerTest {
	public static void main(String[] args) {
		Coustomer cou = new Coustomer();
		cou.setName("张三先生/女士");
		cou.service();
		
		VipCoustomer vip = new VipCoustomer();
		vip.setName("张三先生/女士");
		vip.setLevel(3);
		vip.touSu();
	}

}
