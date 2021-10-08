package javaTest;
//switch statement int method and return type
public class SwitchWithMethod {

	public static void main(String[] args) {
		double a=cal('m',10,20);
		System.out.println(a);
	
	}
	static double cal(char opCode,int num1,int num2) {
		double result=0;
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
		return result;
		}

	}


