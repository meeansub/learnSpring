package springPractice1;

public class Calculator {
	public void addition(int f, int s) {
		System.out.println("덧셈 : addtion()");
		int result = f + s;
		System.out.println(f + "+" + s+ "="+ result);
	}
	public void subtraction(int f, int s) {
		System.out.println("뺄셈 : subtraction()");
		int result = f - s;
		System.out.println(f + "-" + s+ "="+ result);
	}
	public void multiplication(int f, int s) {
		System.out.println("곱셈 : multiplication()");
		int result = f * s;
		System.out.println(f + "*" + s+ "="+ result);
	}
	public void division(int f, int s) {
		System.out.println("나눗셈 : division()");
		int result = f / s;
		System.out.println(f + "/" + s+ "="+ result);
	}
}
