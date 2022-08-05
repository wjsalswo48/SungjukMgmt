
public class Calc {
	private Student[] array;

	public Calc(Student[] array) {
		this.array = array;
	}

	public void calc(int count) {
		for(int i = 0; i<count; i++) {
			Student student = this.array[i];
			int total = this.calcTotalal(student.getKor(), student.getEng(), student.getMat(), student.getEdp());
			double avg = this.calcAvg(total, 4);
			char grade = this.calcGrade(avg);
			student.setTot(total);
			student.setAvg(avg);
			student.setGrade(grade);
		}
	}

	private int calcTotalal(int kor, int eng, int mat, int dep) {
		return kor + eng + mat + dep;
	}
	
	private double calcAvg(int total, int su) {
		return total/(double)su;
	}
	
	private char calcGrade(double avg) {
		return (avg>=90&&avg<=100)?'A':
				(avg>=80)?'B':
					(avg>=70)?'C':
						(avg>=60)?'D':'f';
	}
}
