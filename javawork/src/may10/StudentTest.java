package may10;

public class StudentTest {
public static void main(String[] args) {
	Student student = new Student();
	student.name = "ava";
	student.age = 18;
	student.course = "数学";
	student.interest = "听音乐";
	student.show();

	student.name = "mya";
	student.age = 20;
	student.course = "语文";
	student.interest = "唱歌";
	student.show();

}
}
