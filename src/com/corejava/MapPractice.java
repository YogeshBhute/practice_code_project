package com.corejava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		hm.put("Tiger", 101);
		hm.put("Fox", 103);
		hm.put("Puma", 105);
		hm.put("Elephant", 107);

		System.out.println(hm);

		Set s1 = hm.keySet();
		System.out.println("KeySet : " + s1);

		Collection<Object> collection = hm.values();
		System.out.println("Values : " + collection);

		Set s2 = hm.entrySet();
		System.out.println("Entries : " + s2);
		
		Iterator itr = s2.iterator();
		while (itr.hasNext()) {
			Map.Entry m = (Map.Entry) itr.next();
			System.out.println(m.getKey() + "..." + m.getValue());

			if (m.getKey().equals("Tiger")) {
				m.setValue(100);
			}
		}
		System.out.println(hm);
		System.out.println("Entries : " + s2);

	}

}
