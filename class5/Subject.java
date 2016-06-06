
public class Subject {
	private String subjectName;
	private String subjectCode;
	private boolean mandatory;
	private SubjectPreRequisite preSub;
	
	public Subject(){
//		setPreSub(preSub);
//		preSub = getPreSub();
	}
	
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public boolean isMandatory() {
		return mandatory;
	}
	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	
//	public SubjectPreRequisite getPreSub() {
//		preSub.preSubCode = preSub.getPreSubCode();
//		preSub.preSubName = preSub.getPreSubName();
//		preSub.preSubMandatory = preSub.preSubMandatory;
//		return preSub;
//	}
//	public static void setPreSub(SubjectPreRequisite preSub) {
//		preSub.setPreSubCode("pre-111");
//		preSub.setPreSubName("Pre-CSE");
//		preSub.setPreSubMandatory(false);
//	}




	class SubjectPreRequisite{
		private String preSubName;
		private String preSubCode;
		private boolean preSubMandatory;
		public String getPreSubName() {
			return preSubName;
		}
		public void setPreSubName(String preSubName) {
			this.preSubName = preSubName;
		}
		public String getPreSubCode() {
			return preSubCode;
		}
		public void setPreSubCode(String preSubCode) {
			this.preSubCode = preSubCode;
		}
		public boolean getPreSubMandatory() {
			return preSubMandatory;
		}
		public void setPreSubMandatory(boolean preSubMandatory) {
			this.preSubMandatory = preSubMandatory;
		}
		
		
	}
}
