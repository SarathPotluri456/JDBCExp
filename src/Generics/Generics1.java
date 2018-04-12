package Generics;

import java.util.ArrayList;

public class Generics1 {

	public static void main(String[] args) {
	ArrayList<Customer<Integer>>al=new ArrayList<Customer<Integer>>();
	al.add(new Customer<Integer>(123,2345));
	al.add(new Customer<Integer>(12343,7654));
	
	System.out.println(al);
	Customer c=new Customer();
	
	c.testGen(al);

	}

}
