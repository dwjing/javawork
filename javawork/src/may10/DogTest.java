package may10;

public class DogTest {
	public static void main(String[] args) {
		//类名 实例（对象）=new 类名（）;
		//实例化对象（制造一个对象）:Dog 是类；dog 是类的实例（对象）
		//new 关键字：分配内存
		Dog dog = new Dog();
		
		// . 是类的成员运算符（可以访问类的属性或方法）
		dog.name = "旺财";
		dog.variety ="拉布拉多";
		dog.color = "白色";
		dog.age = 1;
		
		//输出对象的属性
		System.out.println(dog.name+" "+dog.color+" "+dog.variety+" "+dog.age);
		
		//调用对象的方法
		dog.run();
		dog.eat();
		
		//--------------------------------------
		
	}

}
