package DemoModule;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NUmberTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator<Integer> iterator = list.iterator();
		Integer n = iterator.next();
		System.out.println(n);
		if(n==5);
		iterator.remove();
		System.out.println("-------------------------");
		System.out.println(list);
		
		

	}

}
