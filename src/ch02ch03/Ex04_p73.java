package ch02ch03;

/*타입 변환
-데이터 타입을 다른 타입으로 변환하는 것
-byte ↔ int,    int ↔ double

*종류
-p73 자동(묵시적)타입변환: Promotion
-p74 강제(명시적)타입변환: Casting
*/
public class Ex04_p73 {

	public static void main(String[] args) {
		//자동타입변환
//byte(1)<short(2)<int(4.기본)<long(8)<float(4)<double(8.기본)
		byte v1 = 100;
		int  v2 = v1;
		long v3 = v2;
		
		float v11 = 3.14F;
		double v12= v11;
		
		float v21 = v2;  //float<-int
		double v22= v2;  //double<-int
		
		//long v23 = v11; //에러발생. 실수타입변수를 정수타입으로 자동형변환x long<-float
//Type mismatch: cannot convert from float to long		
		
		
		//-강제형변환(p74)---------------------------------
		//byte(1)<short(2)<int(4.기본)<long(8)<float(4)<double(8.기본)		
		double n3 = 3.14;
		int    n5 = (int)n3;
		float  n4 = (float)n3;
		System.out.println("double n3="+n3);//3.14
		System.out.println("int    n5="+n5);//3
		System.out.println("float  n4="+n4);//3.14
		
	
		int n1 = 123456;
		short n2 = (short)n1;
		System.out.println("int n1="+n1);  //123456
		System.out.println("short n2="+n2);//-7616
	}

}





