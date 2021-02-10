package com.xworkz.celebration;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class TesterSupriya6 {

	public static void main(String[] args) {

		Map<String, String> map=new TreeMap();
		map.put("POV", "Ariana Grande");
		map.put("BTS", "Life Goes On");
		map.put("Raaz Aankhein" , "Arjit SIngh");
		map.put("Yad Lagla", "Ajay Gogavale");
		
		Set<Entry<String, String>> entrySet=map.entrySet();
		entrySet.forEach(t->System.out.println("song is:"+t.getKey()+"--singer is:"+t.getValue()));
		
		map.forEach((k,v)->System.out.println(k+" "+v));
		
		Properties properties=new Properties();
		properties.setProperty("name", "email");
		System.out.println("name");
	}
}
