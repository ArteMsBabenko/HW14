package lesson14;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Set<try1> tr = new HashSet<try1>();
		tr.add(new try1("String1", 14));
		tr.add(new try1("String5", 54));
		tr.add(new try1("String3", 34));
		tr.add(new try1("String2", 24));
		tr.add(new try1("String4", 44));
		
		System.out.println("Random elements");
		for(try1 try1 : tr) {
			System.out.println(try1);
		}
		
		Set<try1> tr1 = new LinkedHashSet<try1>();
		tr.add(new try1("String1", 14));
		tr.add(new try1("String5", 54));
		tr.add(new try1("String3", 34));
		tr.add(new try1("String2", 24));
		tr.add(new try1("String4", 44));
		
		System.out.println("Elements in the order they were added");
		for(try1 try1 : tr1) {
			System.out.println(try1);
		}
		
		
		Set<try1> tr2 = new TreeSet<try1>();
		tr.add(new try1("String1", 14));
		tr.add(new try1("String5", 54));
		tr.add(new try1("String3", 34));
		tr.add(new try1("String2", 24));
		tr.add(new try1("String4", 44));
		
		System.out.println("Elements in the order overridden in Comparable");
		for(try1 try1 : tr2) {
			System.out.println(try1);
		}
		
		Set<try1> tr3 = new TreeSet<try1>(new try2());
		tr.add(new try1("String1", 14));
		tr.add(new try1("String5", 54));
		tr.add(new try1("String3", 34));
		tr.add(new try1("String2", 24));
		tr.add(new try1("String4", 44));
		
		System.out.println("Elements in the order redefined in Comparato");
		for(try1 try1 : tr3) {
			System.out.println(try1);
		}
		
		
	}
	
}
