package j09_반복;

public class WhileEx4 {

	public static void main(String[] args) {
		int dan = 0; //단을 0으로 초기화
		
		while(dan < 8) { //단이 8미만이면 계속 반복문 실행한다.
			dan += 2; //단은 2단부터기 때문에 dan변수에 2를 더해준다.
			System.out.println(dan + "단"); //해당 단을 출력한다.
			int num = 0; //num 변수가 매번 반복때마다 0으로 초기화되어야한다.
			while(num < 9) { //num이 9미만이면 계속 반복문 실행한다.
				int result = dan * (++num); //위에서 dan에 2를 더한 값과 num을 곱한 결과를 대입한다.
				System.out.println(dan + " X " + num + " = " + result); //구구단 형식에 맞춰 출력한다.
			}
			System.out.println(); //하나의 단이 끝날때마다 줄바꿈해준다.
			dan -= 1; // 2씩 증가되는 단을 -1해줌으로 dan의 반복 횟수를 조정해준다.
		}
		
	}

}
