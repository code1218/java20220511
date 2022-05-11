package j19_컬렉션.student.list;

import java.util.ArrayList;

import j19_컬렉션.student.Student;

public interface StudentService {
	public boolean addStudent();
	public Student getStudentByStudentCode(int studentCode);
	public ArrayList<Student> getStudents();
	public boolean updateStudent(int studentCode);
	public boolean removeStudent(int studentCode);
}
