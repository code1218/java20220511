package j19_컬렉션.student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		String input = "안녕";
		
		if(input.equals("안녕")) {
			System.out.println("hi");
		}else if(input.equals("문자열")) {
			System.out.println("string");
		}else if(input.equals("정수")) {
			System.out.println("integer");
		}else if(input.equals("실수")) {
			System.out.println("double");
		}
		
		hashMap.put("안녕", "hi");
		hashMap.put("문자열", "string");
		hashMap.put("정수", "integer");
		hashMap.put("실수", "double");
		hashMap.put("실수2", "double");
		
		System.out.println(hashMap.get(input));
		
		Iterator<String> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(hashMap.get(iterator.next()));
		}
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.addAll(hashMap.values());
		System.out.println(hashMap.values());
		System.out.println(hashSet);
		
		hashMap.forEach((k, v) -> {System.out.println(k + " " + v);});
		
		System.out.println(hashMap.containsKey("안녕"));
		System.out.println(hashMap.remove("안녕"));
		System.out.println(hashMap);
		

	}

}






