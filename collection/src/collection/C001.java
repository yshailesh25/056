package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class C001 {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put("k1", "hello");
		hm.put(11, "hi");
		System.out.println(hm.get("k1"));
		System.out.println(hm.get(11));
		 
		
		//Object arr[]= {10,"shailesh",30};
		 //System.out.println(arr[2]);
		
		
		//LinkedHashSet<Object> lhs=new LinkedHashSet<Object>();

		//System.out.println(lhs);
		
		/*HashSet<Object> hs=new HashSet<Object>();
		hs.add("hello");
		hs.add("hi");
		hs.add("hello");
		hs.add("shailesh");
		System.out.println(hs);*/
		
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("hello");
		arr.add("hi");
		arr.add("hello");
		System.out.println(arr);
		
		/*LinkedList ll=new LinkedList();
		ll.add(2);
		ll.add(11);
		ll.add(2);
		System.out.println(ll);
		
		Vector vl=new Vector();
		vl.add("hi");
		vl.add(3);
		vl.add("hi");
		System.out.println(vl);
		vl.remove(2);
		System.out.println(vl);*/

	}

}
