package j19_컬렉션;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		String[] strArray = new String[] {"가", "나", "다", "라", "마", "바", "사", "아"};
		
		String s = "바";
		
		System.out.print("[");
		for(int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
			if(i != (strArray.length - 1)) {
				System.out.print(", ");				
			}
		}
		System.out.println("]");
		
		for(int i = 0; i < strArray.length; i++) {
			if(strArray[i].equals(s)) {
				for(int j = i; j < strArray.length; j++) {
					if(j != (strArray.length -1)) {
						strArray[j] = strArray[j + 1];					
					}else {
						strArray[j] = null;
					}
				}
				break;
			}
			
		}
		
		System.out.print("[");
		for(int i = 0; i < strArray.length; i++) {
			if(strArray[i] == null) {
				continue;
			}
			if(i != 0) {
				System.out.print(", ");				
			}
			System.out.print(strArray[i]);
		}
		System.out.println("]");
		
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("가");
		strList.add("나");
		strList.add("다");
		strList.add("라");
		strList.add("마");
		strList.add("바");
		strList.add("사");
		strList.add("아");
		
		System.out.println("size: " + strList.size());
		System.out.println(strList);
		int index = strList.indexOf("라");
		System.out.println(index);
		strList.remove(index);
		System.out.println(strList);
		
		String str2 = "안녕하세요. 김준일입니다.";
		String str3 = str2.substring(0, str2.indexOf(" "));
		System.out.println(str3);
		
		if(strList.contains("아")) {
			System.out.println("아 문자가 존재합니다.");
		}
		
		strList.add(1, "바");
		System.out.println(strList);
		strList.set(0, "하");
		System.out.println(strList);
		System.out.println(strList.get(0));
	}
}




