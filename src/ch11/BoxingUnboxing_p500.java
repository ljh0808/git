package ch11;

//Wrapper클래스(p498)
//p500
//Boxing  - 기본타입의 값을->포장객체로 만드는 과정	
//Unboxing- 포장객체에서 기본타입의 값을 얻어내는 과정
public class BoxingUnboxing_p500 {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(n);
		//Boxing  생성자 constructor
		//new Integer() Integer클래스의 객체(object)를 생성한다
		//Integer obj1  Integer클래스타입의 obj1변수 선언
		Integer obj1 = new Integer(100);
		System.out.println(obj1);
		Integer obj2 = n;  //auto-Boxing
		System.out.println(obj2);
		
		int x = obj1; //auto-Unboxing
		System.out.println(x);
		
	}

}





