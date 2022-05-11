package j19_컬렉션.student.set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

import j19_컬렉션.student.Student;

public class StudentSetMain2 {

	public static void main(String[] args) {
		//김준일(1)[축구], 김준이(2)[농구, 골프], 김준삼(3)[테니스, 음악감상, 독서]
		HashSet<Student> studentSet = new HashSet<Student>();
		
		Student student1 = new Student();
		student1.setName("김준일");
		student1.setStudentYear(1);
		student1.setHobby(new ArrayList<String>());
		student1.getHobby().add("축구");
		studentSet.add(student1);
		
		Student student2 = new Student();
		student2.setName("김준이");
		student2.setStudentYear(2);
		student2.setHobby(new ArrayList<String>());
		student2.getHobby().add("농구");
		student2.getHobby().add("골프");
		studentSet.add(student2);
		
		System.out.println(studentSet);
		
		
	}

}
