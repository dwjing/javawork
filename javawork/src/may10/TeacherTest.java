package may10;

public class TeacherTest {
	public static void main(String[] args) {
		 Teacher teacher = new Teacher();
		 teacher.name = "song";
		 teacher.professional = "编程";
		 teacher.course = "数学";
		 teacher.age = 12;
		 teacher.show();

		 teacher.name = "mya";
		 teacher.professional = "体育";
		 teacher.course = "网球";
		 teacher.age = 10;
		 teacher.show();

}
}