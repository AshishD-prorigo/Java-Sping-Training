package javaTest;

public class SwitchStatement {

	public static void main(String[] args) {
		int num1[]= {40,50,60,70};
		int num2[]= {10,20,30,40};
		
		double result[]=new double[num1.length];
		
		char opCode[]= {'a','s','m','d'};
		
		for(int i=0;i<num2.length;i++) 
		{
			
		switch(opCode[i]) 
		{
		case 'a':
			result[i]=num1[i]+num2[i];
			break;
		
		case 's':
			result[i]=num1[i]-num2[i];
			break;
		
		case 'm':
			result[i]=num1[i]*num2[i];
			break;
		
		case 'd':
			result[i]=num2[i]!=0?num1[i]/num2[i]:0.0d;
			break;
			
		default:
			System.out.println("enter valid opcode:"+opCode[i]);
			break;
		}
		
		}
		for(double r:result)
		{
			System.out.println(r);
		}
		

	}

}
