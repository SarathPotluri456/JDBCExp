package Generics;

public class Test {
	public static <E> void printArray(E[] elements)
	{
		for(E elment:elements)
		{
			System.out.println(elment);
		}
	}

	public static void main(String[] args) {
	Integer []arr= {1,2,3,4,5,6,7,8};
	Character[] arr1= {'l','a','h','a','r','i'};
	String []arr2= {"sarath","potluri","babu","aiasii"};
	System.out.println("Printing Numbers");
	printArray(arr);
	System.out.println("Printing Characters");
	printArray(arr1);
	System.out.println("Printing String");
	printArray(arr2);
	
	

	}

}
