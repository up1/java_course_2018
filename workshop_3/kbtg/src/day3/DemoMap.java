package day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		Map<Integer, String> datas =
				new HashMap<>();
		datas.put(1, "One");
		datas.put(2, "Two");
		datas.put(3, "Three");
		if(datas.containsKey(2)) {
			String value = datas.get(2);
			datas.put(2, value+ "Four");
		} else {
			datas.put(2, "Four");
		}
		
		Set<Integer> keys = datas.keySet();
		for (Integer key : keys) {
			System.out.println(datas.get(key));
		}
	}

}
