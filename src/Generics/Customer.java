package Generics;

import java.util.ArrayList;

public class Customer<E> {
	E id;
	
E name;
	 public Customer() {
			
		}
	public Customer(E id,	E name) {

		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	public void testGen(ArrayList <? super Number> list)
	{
		
	}
	 

}
