package Generics;

public class Customer<E > {
	 E id;
	
 String name;
	 public Customer() {
			
		}
	public Customer(E id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	 

}
