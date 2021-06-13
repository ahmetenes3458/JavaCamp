
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.id=1;
		student.firstName="Ali";
		student.lastName="Candan";
		student.email="alicandan@gmail.com";
		student.password="123ali";
		
		StudentManager studentManager = new StudentManager();
		studentManager.Add();
		
		Instructor instructor = new Instructor();
		instructor.id=1;
		instructor.firstName="Engin";
		instructor.lastName="Demiroğ";
		instructor.email="engindemiroğ@gmail.com";
		 instructor.password="123engin";
		 
		 InstructorManager instructorManager = new InstructorManager();
		 instructorManager.Add();
		
	}

}
