package ch02ch03;

/*데이터타입(p59)
 *데이터타입 변수명;
-기본타입(primitive type):값, 참조타입(reference type):주소
 정수 : byte(1byte)<short(2)<int(4.기본)<long(8)
 실수 : float(4)<double(8.기본)
 논리형: true, false
 */
public class Ex03 {

	public static void main(String[] args) {
		//데이터타입 변수 = 초기값;
		byte v1 = -128;
		byte v2 = -127;
		byte v3 = 0;
		byte v4 = 100;
		byte v5 = 127;
		//byte v6 = 128;//에러발생
		/*Type mismatch: 
		  cannot convert from int to byte*/
		short v7 = 128;
		int  v8 = 128;
		long v9 = 128;
		
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
		System.out.println("v5="+v5);
		
		System.out.println("-------------");
		//리터럴형변환 : f,F, l,L
//		정수 : byte(1byte)<short(2)<int(4.기본)<long(8)
		int  n4 = 1234567892;
		long n5 = 1234567892;
//		int  n6 = 12345678929;//에러발생
//The literal 12345678929 of type int is out of range
		long n7 = 12345678929l;
		long n8 = 12345678929L;
		
//		실수 : float(4)<double(8.기본)
		double n1 = 3.14;
		float  n2 = 3.14f;
		float  n3 = 3.14F;
//Type mismatch: cannot convert from double to float		
		
	}

}






