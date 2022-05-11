package j19_컬렉션.student.list;

import java.util.ArrayList;
import java.util.Scanner;

import j19_컬렉션.student.Student;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
	
	private final Scanner scanner;
	private final ArrayList<Student> studentData;

	@Override
	public boolean addStudent() {
		System.out.println("[학생 정보 추가]");
		Student student = new Student();
		System.out.print("이름: ");
		student.setName(scanner.nextLine());
		System.out.print("학년: ");
		student.setStudentYear(scanner.nextInt());
		scanner.nextLine();
		System.out.print("취미: ");
		ArrayList<String> hobbys = new ArrayList<String>();
		for(int i = 1; true; i++) {
			System.out.print(i + ": ");
			String hobby = scanner.nextLine();
			if(hobby.equals("")) {
				break;
			}
			hobbys.add(hobby);
		}
		student.setHobby(hobbys);
		studentData.add(student);
		
		return true;
	}

	@Override
	public Student getStudentByStudentCode(int studentCode) {
		for(Student student : studentData) {
			if(student.getStudentCode() == studentCode) {
				return student;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Student> getStudents() {
		return studentData;
	}

	@Override
	public boolean updateStudent(int studentCode) {
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		System.out.println("[학생 정보 수정]");
		for(Student student : studentData) {
			if(student.getStudentCode() == studentCode) {
				System.out.println("1. 이름: " + student.getName());
				System.out.println("2. 학년: " + student.getStudentYear());
				System.out.println("3. 취미: " + student.getHobby());
				System.out.print("수정하고 싶은 정보의 번호를 모두 입력해주세요.(띄어쓰기로 구분)");
				do {
					indexList.add(scanner.nextInt());
				}
				while(scanner.hasNext());
				
				for(int i : indexList) {
					if(i == 1) {
						System.out.print("수정 할 이름: ");
						student.setName(scanner.nextLine());
					}else if(i == 2) {						
						System.out.print("수정 할 학년: ");
						student.setStudentYear(scanner.nextInt());
						scanner.nextLine();
					}else if(i == 3) {
						System.out.print("수정 할 취미: ");
						//student.setHobby(null);
					}else {
						
					}
				}
				
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean removeStudent(int studentCode) {
		for(int i = 0; i < studentData.size(); i++) {
			if(studentData.get(i).getStudentCode() == studentCode) {
				studentData.remove(i);
				return true;
			}
		}
		return false;
	}
	
}
