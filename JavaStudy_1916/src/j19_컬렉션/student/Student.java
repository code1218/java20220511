package j19_컬렉션.student;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Student {
	private static int studentCodeAutoIncrement = 20220000;
	private int studentCode;
	private String name;
	private int studentYear;
	private ArrayList<String> hobby;
	
	public Student() {
		studentCode = ++studentCodeAutoIncrement;
	}
	
}







