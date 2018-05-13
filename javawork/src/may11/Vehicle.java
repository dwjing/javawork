package may11;

public class Vehicle {
	// 属性
	private int speed;
	private String size;
	private String name;



	public Vehicle(int speed, String size, String name) {
		super();
		this.speed = speed;
		this.size = size;
		this.name = name;
	}

	public void move() {
		System.out.println(name + "以"+size+"的重量启动");
	}

	public void setSpeed(int speed) {
		System.out.println(name + " 速度为"+speed);
	}

	public void speedUp(int speed) {
		System.out.println(name + " 加速度为"+speed);
	}

	public void speedDown(int speed) {
		System.out.println(name + " 减速度为"+speed);
	}

	public void show() {
		System.out.println(name + " " + speed + " " + size);
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

}
