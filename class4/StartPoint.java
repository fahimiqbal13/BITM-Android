
public class StartPoint {

	public static void main(String[] args) {
		//Employee employee = new Employee("Iqbal", "Hossain", "Fahim");
		//System.out.println(employee.showFullName());
		
		Student student = new Student(3.0f, 4.0f, 3.5f);
		Student student2 = new Student(3.0f, 4.0f);
		Student student3 = new Student(3.0f);
		
//		student.setGradePointMath(4.0f);
//		student.setGradePointEnglish(3.0f);
//		student.setGradePointBangla(3.0f);
		
		System.out.println(student.get_gpa());
		System.out.println(student2.get_gpa());
		System.out.println(student3.get_gpa());
	}

}
