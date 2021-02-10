package com.xworkz.celebration;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesterChaitli5 {

	public static void main(String[] args) {

		Map<String, Integer> map=new HashMap<String, Integer>();
		
		String name="Kalam";
		int age=83;
		
		map.put("Sonu", 29);
		map.put("Apoorva", 26);
		map.put("Shwetha", 26);
		map.put("Aishwarya", 23);
		map.put("Ananya", 22);
		map.put("Aneesh", 19);
		map.put("Suchit", 16);
		map.put("Shivani", 10);
		map.put("Utpal", 9);
		map.put("Sanchit", 4);
		map.put("Nihal", 3);
		
		System.out.println("size is:"+map.size());
		
		Integer value=map.get("Aishwarya");
		System.out.println(value);
		
		Set<String> keys=map.keySet();
		
		keys.forEach(anything->{
			Integer v=map.get(anything);
			System.out.println(anything+" -age is:"+v);
		});
		
		Collection<Integer> values=map.values();
		values.forEach(a->System.out.println(a));
		
		Set<Entry<String, Integer>> entrySet=map.entrySet();
		System.out.println("size is:"+entrySet.size());
		entrySet.forEach(z->{
			System.out.println(z.getKey());
			System.out.println(z.getValue());
		});
		
	}

}
