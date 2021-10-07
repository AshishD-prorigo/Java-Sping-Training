package javaTest;
//if else conditional Statement with logical operator
public class ConditionalStatement {

	public static void main(String[] args) {
	
		int a=20;
		int b=30;
		int c=66;		   // || operator only become true when one condition is true and one condition is false
		if(a>b && a>c) {  //&& operator is only become true when both the condition is true
			System.out.println("a is greatest:"+a);
		}
		else if(b>c && b>a) {
			System.out.println("b is greatest:"+b);//nestest if else
		}
		else {
			System.out.println("c is greatest:"+c);
		}

	}

}
