package ro.ase.acs.example1;

public class EmployeeStudent {
	int salaryPerHour;
	int hours;

	public void addHours(int addedHours) {
		hours+=addedHours;
		//salary=salaryPerHour*hours;
	}
	
	public int getFullSalary() {
		return hours*salaryPerHour;
	}
	
	
	public String getExam(int examNumber) throws Exception {
		String[] exams = {ConstantVariables.EXAM_OOP, ConstantVariables.EXAM_CS, ConstantVariables.EXAM_DS,
				ConstantVariables.EXAM_JAVA, ConstantVariables.EXAM_STAT};
		if(examNumber <= exams.length && examNumber > 0) {
			return exams[examNumber-1];
		}
		else
			throw new Exception("exam must be in range 1 to 5");
	    /*switch (examNumber) {
	        case 1:
	            return ConstantVariables.EXAM_OOP;
	        case 2:
	            return ConstantVariables.EXAM_JAVA;
	        case 3:
	            return ConstantVariables.EXAM_DS;
	        case 4:
	            return ConstantVariables.EXAM_CS;
	        case 5:
	            return ConstantVariables.EXAM_STAT;
	        
	        default:
	            throw new Exception("exam must be in range 1 to 5");
	    }*/
	}
}
