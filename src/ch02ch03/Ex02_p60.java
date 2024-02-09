package ch02ch03;

//char타입(p63)
/*참조타입(reference type):주소저장
*기본타입(primitive type):값 저장 
 정수 : byte(1byte)<short(2),char(2)<int(4.기본)<long(8)
 실수 : float(4)<double(8.기본)
 논리형: true, false
 */
public class Ex02_p60 {

	public static void main(String[] args) {
		//char타입은 유니코드로 변환되어 저장
		/*유니코드? 
		 * 국제표준규약.
		 * 세계 각국의 문자를 2byte로 표현할 수 있는 
		 * 숫자(0~65535)로 매핑 */
		char v1 = 'A';
		int  v11= v1; //65
		char v2 = 'a';
		int  v21= v2; //97
		int  v22= 'b';//98
		char v3 = (char)v22;
		System.out.println("char v1="+v1);//A
		System.out.println("int v11="+v11);//65
		System.out.println("char v2="+v2);//a
		System.out.println("int v21="+v21);//97
		System.out.println("int v22="+v22);//98
		System.out.println("char로 확인 v22="+v3);//b
		
		//v1의 'A'를 'a'로 변환하여 출력하시오
		char result = (char)(v1+32);
		System.out.println("'A'를 'a'로 변환="+result);//a예측
		
	  //String x = new String("A");
		String x = "A";
		System.out.println(x); //A
		//String클래스에서 제공한 toLowerCase() : 소문자로변환
		//String클래스에서 제공한 toUpperCase() : 대문자로변환
		System.out.println(x.toLowerCase()); //a
		System.out.println("a".toUpperCase());//A
	}

}









