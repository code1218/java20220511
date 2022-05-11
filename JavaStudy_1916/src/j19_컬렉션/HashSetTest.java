package j19_컬렉션;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> address = new HashSet<String>();
		//추가
		address.add("서울특별시");
		address.add("서울특별시");
		address.add("서울특별시");
		address.add("서울특별시");
		address.add("서울특별시");
		address.add("부산광역시");
		address.add("부산광역시");
		address.add("경상남도");
		address.add("경상북도");
		address.add("대구광역시");
		address.add("경기도");		
		
		System.out.println(address);
		
		//삭제
		address.remove("대구광역시");
		System.out.println(address);
		
		HashSet<String> c = new HashSet<String>();
		
		c.add("서울특별시");
		c.add("경상남도");
		
		address.removeAll(c);
		System.out.println(address);
		
		String inputData = "부산광역시";
		
		//조회
		System.out.println(address.contains(inputData)?inputData:"해당 데이터가 없습니다.");
		
		Iterator<String> iterator = address.iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		
		iterator = address.iterator();
		while(iterator.hasNext()) {
			String addr = iterator.next();
			if(addr.equals(inputData)) {
				System.out.println(addr);
			};
		}
		
		//수정
		if(address.remove("경상북도")) {
			address.add("울산광역시");
		};
		System.out.println(address);
	}

}







