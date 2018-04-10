package Generics;

import java.util.ArrayList;

public class Generics1 {

	public static void main(String[] args) {
	ArrayList<Customer<Integer>>al=new ArrayList<Customer<Integer>>();
	al.add(new Customer<Integer>(123,"dsdsd"));
	al.add(new Customer<Integer>(1234,"dfokdffo"));
	System.out.println(al);

	}

}
