package b_encapsulation;

public class CalculatorExpr {

	private int num1;
	private int num2;
	
	public int getAddtion() {
		int addition = num1+num2;
		return addition;
	}
	
	public int getSubtraction() {
		int subtraction = num1-num2;
		return subtraction;
	}
	
	public int getMultplication() {
		int multplication = num1*num2;
		return multplication;
		
	}
	public double getDivision() {
		double division = 0;
		division = (double)num1/num2;
		return division;
	}

	//모든 멤버변수에 대한 setter/getter
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}
