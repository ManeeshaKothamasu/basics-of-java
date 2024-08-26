package assignments;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	public static void main(String[] args) {
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("sri", 23);
		m1.put("lid", 27);
		m1.put("wri", 23);
		for(String s1:m1.keySet()) {
			System.out.println(s1);
		}
		for(Integer l1:m1.values()) {
			System.out.println(l1);
		}

	}

}
