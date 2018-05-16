package may16;

public class Coustomer {
	private String name;

	public void service() {
		System.out.println("服务信息" + "\n" + name + "正在服务中...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
