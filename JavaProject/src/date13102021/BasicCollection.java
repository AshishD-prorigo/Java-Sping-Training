package date13102021;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class BasicCollection {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
	//Collection
	List<String> fruit=new LinkedList<String>();
	fruit.add("Banana");
	fruit.add("apple");
	fruit.add("Orange");
	fruit.add("pineaple");
	
	System.out.println(fruit);
	
	for(String f:fruit) {
		System.out.println(f);
		
		
	}
	System.out.println("new Line--------------");
	Iterator<String> itr=fruit.iterator();
	while(itr.hasNext()) {
		if(itr.next()=="Banana") {
			itr.remove();
		}
		
	}
	System.out.println(fruit);
	System.out.println(fruit.contains("apple"));
	List<String> car=new LinkedList<String>();
	car.add("TATA");
	car.add("Mahindra");
	car.add("Tesla");
	car.add("Ford");
	
	fruit.addAll(car);
	System.out.println(fruit);
		
	}

}
