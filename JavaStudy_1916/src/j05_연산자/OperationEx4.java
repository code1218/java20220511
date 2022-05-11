package j05_연산자;

/**
 * 
 * 논리 연산자
 * 
 * 0이 아니면 무조건 true(1)
 * 0이면 false
 * 
 * AND(&&)	-> 곱
 * true && true => true:	1 X 1
 * true && false => false:	1 X 0
 * false && false => false:	0 X 1
 * false && false => false
 * AND연산의 특징
 * 모든 값이 true여야지만 결과가 true이다.
 * 하나라도 false이면 결과가 false이다.
 * 
 * 
 * OR(||)	-> 합
 * true || true => true
 * true || false => true
 * false || true => true
 * false || false => false
 * OR연산의 특징
 * 하나라도 true이면 결과는 true이다.
 * 모든 결과가 false여야지만 결과가 false이다.
 * 
 * NOT(!)	-> 부정(반전)
 * !(true || true) => false
 * true && !false => true
 */

public class OperationEx4 {

	public static void main(String[] args) {
		System.out.println(true || false);
		System.out.println(true && false);
		System.out.println(true && !false);
		
	}

}
