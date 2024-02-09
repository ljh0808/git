package ch02ch03;

/*타입 변환
-데이터 타입을 다른 타입으로 변환하는 것
-byte ↔ int,    int ↔ double

*종류
-p73 자동(묵시적)타입변환: Promotion
-p74 강제(명시적)타입변환: Casting
*/
public class Ex04_p76 {

	public static void main(String[] args) {
		//연산에서의 자동타입변환(p81)
//byte(1)<short(2)<int(4.기본)<long(8)<float(4)<double(8.기본)
	   /*서로 다른 타입의 피연산자는 같은 타입으로 변환
		 두 피연산자 중 크기가 큰 타입으로 자동 변환*/
		int x = 100;
		double y = 3.14;
		double r20 = x + y;
		System.out.println(r20); //??  103.14
		
		System.out.println("-------------------");
		//정수연산에서의 자동타입변환(p76)
		
		byte  v1 = 101;
		short v2 = 2;
		double r11 = v1/v2;   //   /연산자의 결과는 몫구하기
		System.out.println(r11);// 50.0
		int r12 = v1%v2;        // %연산자는 나머지 구하기 
		System.out.println(r12);// 0 1
		
		System.out.println("----------------");
		
		byte n1 = 10;  //-128~127
		byte n2 = 20;
//		long r1 = n1 + n2;
//		int r1 = n1 + n2;
		
//		short r1 = n1 + n2; //에러발생.
		//+연산전에 int로 변환하여 int+int하였으므로 int타입의 값인데
		//int보다 작은 short에 저장하려니 에러발생
//		Type mismatch: cannot convert from int to short

		short r1 = (short)(n1 + n2);  
		//(short로강제형변환)(int값)
		System.out.println(r1);//30
		
		System.out.println("----------------");
		
		int a = 10;
		int b = 20;
		int result = a+b;
		long result0 = a+b;  //자동형변환
		System.out.println(result);//30
		double result1 = a+b;//자동형변환
		System.out.println(result1);//30.0
	}

}





