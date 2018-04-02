

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet1 {

	public static void main(String[] args) {
		NavigableSet n1=new TreeSet();
		n1.add(456);
		n1.add(43);
		n1.add(234);
		n1.add(76);
		n1.add(23);
		n1.add(213);
		n1.add(21);
		System.out.println(n1);
		Object ob=n1.ceiling(250);
		System.out.println(ob);
		Object ob1=n1.floor(22);
				System.out.println(ob1);
		/*Object ob2=n1.pollFirst();
		System.out.println(ob2);*/
		Object ob3=n1.pollLast();
		System.out.println(ob3);
		Object ob4=n1.headSet(234);
		System.out.println(ob4);
		Object ob5=n1.higher(70);
		System.out.println(ob5);
		Object ob6=n1.lower(213);
		System.out.println(ob6);
		Object ob7=n1.tailSet(43);
		System.out.println(ob7);
		

	}

}
