package j19_컬렉션.student.list;

import java.util.ArrayList;
import java.util.Scanner;

import j19_컬렉션.student.Student;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> studentData = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		
		StudentService studentService = new StudentServiceImpl(scanner, studentData);
		
		studentService.addStudent();
		studentService.addStudent();
		Student student1 = studentService.getStudentByStudentCode(20220001);
		Student student2 = studentService.getStudentByStudentCode(20220002);
		System.out.println("학생1: " + student1);
		System.out.println("학생2: " + student2);
		
		System.out.println("[전체 학생 리스트]");
		System.out.println(studentService.getStudents());
		
		studentService.updateStudent(20220001);
		System.out.println(studentService.getStudentByStudentCode(202220001));
		
		studentService.removeStudent(20220002);
		
		System.out.println("[전체 학생 리스트]");
		System.out.println(studentService.getStudents());
		
		

	}

}
