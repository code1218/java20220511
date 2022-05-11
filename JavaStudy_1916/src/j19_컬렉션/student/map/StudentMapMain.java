package j19_컬렉션.student.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import j19_컬렉션.student.Student;

public class StudentMapMain {

	public static void main(String[] args) {
		HashMap<Integer, Student> studentMap = new HashMap<Integer, Student>();
		
		
		//추가 Create
		Student student1 = new Student();
		student1.setName("김준일");
		student1.setStudentYear(1);
		ArrayList<String> hobby1 = new ArrayList<String>();
		hobby1.add("축구");
		student1.setHobby(hobby1);
		
		Student student2 = new Student();
		student2.setName("김준이");
		student2.setStudentYear(2);
		ArrayList<String> hobby2 = new ArrayList<String>();
		hobby2.add("농구");
		hobby2.add("골프");
		student2.setHobby(hobby2);
		
		Student student3 = new Student();
		student3.setName("김준삼");
		student3.setStudentYear(3);
		ArrayList<String> hobby3 = new ArrayList<String>();
		hobby3.add("테니스");
		hobby3.add("독서");
		hobby3.add("음악감상");
		student3.setHobby(hobby3);
		
		studentMap.put(student1.getStudentCode(), student1);
		studentMap.put(student2.getStudentCode(), student2);
		studentMap.put(student3.getStudentCode(), student3);
		
		//조회 Read
		String studentName = "김준일";
		
		Iterator<Integer> iterator = studentMap.keySet().iterator();
		while(iterator.hasNext()) {
			Student s = studentMap.get(iterator.next());
			if(s.getName().equals(studentName)) {
				System.out.println(s);
				break;
			}
		}
		
		//수정 Update
		Iterator<Integer> iterator2 = studentMap.keySet().iterator();
		while(iterator2.hasNext()) {
			Student s = studentMap.get(iterator2.next());
			s.setStudentYear(s.getStudentYear() + 1);
		}
		System.out.println(studentMap);
		
		
		//삭제 Delete
		Iterator<Integer> iterator3 = studentMap.keySet().iterator();
		while(iterator3.hasNext()) {
			Student s = studentMap.get(iterator3.next());
			if(s.getName().equals(studentName)) {
				studentMap.remove(s.getStudentCode());
				break;
			}
		}
		System.out.println(studentMap);
	}

}
