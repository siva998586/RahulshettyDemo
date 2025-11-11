package Basic;

import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String , String>  map = new HashMap < String , String>();
		
		map.put("Name", "Siva");
		map.put("Age", "38");
		map.put("Color", "Pink");
		map.put("EmployeeType", "Private");
		map.put("Sex", "male");
		System.out.println("Hash Key values are:..->");
		System.out.println(map);
		
		HashMap<Integer , String > map2 = new HashMap<Integer , String>();
		
		
		map2.put(1, "Siva");
		map2.put(2, "38");
		map2.put(3, "Pink");
		map2.put(4, "Private");
		map2.put(5, "male");
		
		System.out.println("Hash Key 2nd pair values are:..->");
		System.out.println(map2);
		map2.remove(5);
		System.out.println("Hash Key after remove  pair values are:..->");
		System.out.println(map2.keySet());
		System.out.println(map2.values());
		System.out.println(map2.isEmpty());
		//map2.keySet();
	}

}
