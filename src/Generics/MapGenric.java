package Generics;

import java.util.HashMap;
import java.util.Map;

public class MapGenric {

	public static void main(String[] args) {
	Map<Integer,Customer<Integer>> map=new HashMap<Integer,Customer<Integer>>();
	map.put(1, new Customer(123,"dddidwid"));
	map.put(2, new Customer<Integer>(123,2456));
	map.put(3, new Customer<Integer>(123,2655));
	for(Map.Entry<Integer, Customer<Integer>> m:map.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}

	}

}
