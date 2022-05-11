package j08_조건;

import java.util.Scanner;

public class IfEx3 {
	/**
	 * 	score(점수) = 정수형 숫자
	 * 	grade(평점) = A ~ F (String)
	 * 	result = null; (String)
	 * 
	 * 
	 *  점수를 입력 받는다.
	 * 	
	 * 	성적을 입력해 주세요: 
	 * 	성적은 0 ~ 100 사이만 입력 가능해야하고
	 * 	result = "해당 학생의 성적은 00점이며 평점으로 변환시 A학점입니다.";
	 *  만약 아니라면 "해당 점수는 계산할 수 없습니다."를 result에 대입 후 출력.
	 *  
	 *  평점
	 *  90 ~ 100 A
	 *  80 ~ 89 B
	 *  70 ~ 79 C
	 *  60 ~ 69 D
	 *  0 ~ 59 F
	 * 	
	 */
	public static void main(String[] args) {
		int score = 0;
		String grade = null;
		String result = null;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("성적을 입력해 주세요: ");
		score = scanner.nextInt();
		
		if(score < 0 || score > 100) {
			result = "해당 점수는 계산할 수 없습니다.";
		}else {
			if(score > 89) {
				grade = "A";
			}else if(score > 79) {
				grade = "B";
			}else if(score > 69) {
				grade = "C";
			}else if(score > 59) {
				grade = "D";
			}else {
				grade = "F";
			}
			result = "해당 학생의 성적은 " + score + "점이며 평점으로 변환시 " + grade + "학점입니다.";
		}
		
		System.out.println(result);
		
	}

}
