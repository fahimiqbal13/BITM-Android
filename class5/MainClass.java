


public class MainClass {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.setStudentName("Fahim");
		student.setStudentId(137038);
		student.setDepartment("CSE");
		//System.out.println(student);
		
		Address address = new Address();
		address.setArea("Jatrabari");
		address.setRoadNo("Main Road");
		address.setHouseNo("322");
		
		Subject subject = new Subject();
		subject.setSubjectName("Algorithm");
		subject.setSubjectCode("1100");
		subject.setMandatory(true);
		

		student.setAddress(address);
		student.setSubject(subject);
		
		System.out.println(student.getAddress().getArea());
	}

}
