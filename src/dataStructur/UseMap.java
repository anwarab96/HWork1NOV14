package dataStructur;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UseMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("USA", "New York");
		map.put("UK", "London");
		map.put("Bangladesh", "Dhaka");
		map.put("Japan", "Tokyo");
		for(Entry<String, String> st:map.entrySet()){
			System.out.println(st.getKey()+"--------"+ st.getValue());
		}
	}

}
