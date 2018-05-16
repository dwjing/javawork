package may16;

public class VipCoustomer extends Coustomer {
	private int level;

	public void touSu() {

		System.out.println("投诉信息：" + "\n" + "vip" + level + "级别" + super.getName() + "正在投诉中...");
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
