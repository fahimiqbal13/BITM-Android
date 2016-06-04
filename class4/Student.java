
public class Student {
	private float gradePointMath;
	private float gradePointEnglish;
	private float gradePointBangla;
	
	public Student(float gradePointA) {
		super();
		this.gradePointMath = gradePointA;
	}
	
	public Student(float gradePointA, float gradePointB) {
		super();
		this.gradePointMath = gradePointA;
		this.gradePointEnglish = gradePointB;
	}
	
	public Student(float gradePointA, float gradePointB, float gradePointC) {
		super();
		this.gradePointMath = gradePointA;
		this.gradePointEnglish = gradePointB;
		this.gradePointBangla = gradePointC;
	}
	
	public float getGradePointMath() {
		return gradePointMath;
	}
	public void setGradePointMath(float gradePointMath) {
		this.gradePointMath = gradePointMath;
	}
	public float getGradePointEnglish() {
		return gradePointEnglish;
	}
	public void setGradePointEnglish(float gradePointEnglish) {
		this.gradePointEnglish = gradePointEnglish;
	}
	public float getGradePointBangla() {
		return gradePointBangla;
	}
	public void setGradePointBangla(float gradePointBangla) {
		this.gradePointBangla = gradePointBangla;
	}
	
	public String get_gpa(){
		float gpa;
		String gpaString="";
		
		if(gradePointMath>0 && gradePointEnglish>0 && gradePointBangla>0){
			gpa = (gradePointMath+gradePointEnglish+gradePointBangla)/3;
			gpaString = "You have participated all exams. Your GPA is: "+gpa;
		}
		else if(gradePointMath>0 && gradePointEnglish>0 && gradePointBangla<=0){
			gpa = (gradePointMath+gradePointEnglish)/2;
			gpaString = "You are absent in Bangla. 2 subjects GPA is: "+gpa;
		}
		else if(gradePointMath>0 && gradePointEnglish<=0 && gradePointBangla<=0){
			gpa = gradePointMath;
			gpaString = "You are absent in English and Bangla. 1 subject GPA is: "+gpa;
		}
		else{
			gpaString = "Something went wrong. No GPA result is avaialable";
		}
		
		
		return gpaString;
	}
}
