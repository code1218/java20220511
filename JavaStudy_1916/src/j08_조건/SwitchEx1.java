package j08_조건;

public class SwitchEx1 {

	public static void main(String[] args) {
		char select = '4';
		
		switch(select) {
			case '1': 
				System.out.println("1번 컴퓨터 연결");
				break;
			case '2': 
				System.out.println("2번 컴퓨터 연결");
				break;
			case '3':
				System.out.println("3번 컴퓨터 연결");
				break;
			case '4':
				System.out.println("4번 컴퓨터 연결");
				break;
			default :
				System.out.println("해당 스위치 버튼은 누를 수 없습니다.");
		}
	}

}
