package dataStructur;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UseMapInteger {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"USA");
		map.put(2,"GERMANY");
		map.put(3,"RASSOA");
		map.put(4,"AUSTRALIA");
		map.put(5,"CANADA");
	for(Entry<Integer,String> entry:map.entrySet()){
		System.out.println(entry.getKey()+ "------"+ entry.getValue());
	}

	}

}
