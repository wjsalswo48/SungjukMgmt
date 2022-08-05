
public class Main {
	public static void main(String[] args) {
		Student[]array=new Student[100];
		Input input = new Input(array);
		int count = input.input();
		
		Calc calc = new Calc(array);
		Sort sort = new Sort(array, count);
		
		Output output = new Output();
		output.output(array, count);
		System.out.println("성적관리프로그램 끝");
	}
}
