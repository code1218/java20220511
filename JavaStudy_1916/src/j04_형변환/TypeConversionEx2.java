package j04_형변환;

public class TypeConversionEx2 {

	public static void main(String[] args) {
		// 최저 9160원
		// 4주 근무
		// 1,3 주는 3일
		// 2,4 주는 5일
		// 3,4 주는 시급의 5%를 더 추가한다.
		// 하루 8시간
		
		//월급을 구하시오.
		final int HOURLY_WAGE = 9160;
		
		int monthlyPay = 0;
		double bonus = HOURLY_WAGE * 0.05;
		//시급 * 시간 * 일수
		
		double week1 = HOURLY_WAGE * 8 * 3;
		double week2 = HOURLY_WAGE * 8 * 5;
		double week3 = (HOURLY_WAGE + bonus) * 8 * 3;
		double week4 = (HOURLY_WAGE + bonus) * 8 * 5;
		
		monthlyPay = ((int)((week1 + week2 + week3 + week4)/10))*10;
		//1201792 / 10
		//120179.2
		//int형변환 후 120179 * 10 = 1201790
		//
		//김준일 직원의 월급은 1201790원입니다.
		System.out.println("김준일 직원의 월급은 " + monthlyPay + "원입니다.");
		
	}

}
