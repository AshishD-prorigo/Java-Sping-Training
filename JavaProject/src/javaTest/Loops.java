package javaTest;
// Loops Assignment
public class Loops {

	public static void main(String[] args) {
		int a=3;
	//for loop approch 1
	for(int i=1;i<=10;i++) {
		System.out.print("3"+"*"+i+"="+a*i+" ");
	}
	System.out.println();
	//while loop approch 2
	int b=1;
	while(b<=10) {
		System.out.print("3"+"*"+b+"="+a*b+" ");
		b++;
	}
	
	//do while loop approch 3
	int c=1;
	do {
		System.out.print("3"+"*"+c+"="+a*c+" ");
		c++;
	}while(c<=10);
	

	}

}
