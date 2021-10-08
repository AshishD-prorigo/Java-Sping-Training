package javaTest;

public class SwitchStatement {

	public static void main(String[] args) {
		int num1=60;
		int num2=50;
		double result=0d;
		char opCode='d';
		switch(opCode) 
		{
		case 'a':
			result=num1+num2;
			break;
		
		case 's':
			result=num1-num2;
			break;
		
		case 'm':
			result=num1*num2;
			break;
		
		case 'd':
			result=num2!=0?num1/num2:0.0d;
			break;
			
		default:
			System.out.println("enter valid opcode:"+opCode);
			break;
		}
		System.out.println(result);

	}

}
