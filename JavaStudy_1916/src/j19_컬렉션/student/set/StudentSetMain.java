package j19_컬렉션.student.set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import j19_컬렉션.student.Student;

public class StudentSetMain {

	public static void main(String[] args) {
		//김준일(1)[축구], 김준이(2)[농구, 골프], 김준삼(3)[테니스, 음악감상, 독서]
		HashSet<Student> studentSet = new HashSet<Student>();
		
		Student student1 = new Student();
		student1.setName("김준일");
		student1.setStudentYear(1);
		ArrayList<String> hobby = new ArrayList<String>();
		hobby.add("축구");
		student1.setHobby(hobby);
		
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
		hobby3.add("음악감상");
		hobby3.add("독서");
		student3.setHobby(hobby3);
		
		studentSet.add(student1);
		studentSet.add(student2);
		studentSet.add(student3);
		
		String name = "김준일";
		
		Iterator<Student> iterator = studentSet.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getName().equals(name)) {
				studentSet.remove(student);
				break;
			}
		}
		
		System.out.println(studentSet);
		
	}

}








