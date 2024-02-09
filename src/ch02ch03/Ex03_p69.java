package ch02ch03;

//논리형 - false, true
public class Ex03_p69 {

	public static void main(String[] args) {
		//데이터타입 변수명 = 초기값;
		boolean stop = false;
		System.out.println("stop변수에 저장된 값="+stop); //true
				
		if(stop==true) {
			System.out.println("stop상태입니다.");
		}
		
		if(stop) {
			System.out.println("true입니다.");
		}else {
			System.out.println("false입니다.");
		}
		
		if(stop==false) {
			System.out.println("nonstop");
		}
		
		//!연산자는 not을 의미
		//!false ->not false=>true
		//!true  ->not true =>false		
		if(!false) {
			System.out.println("조건충족");
		}		
		
		//!false =>true =>if(true)
		if(!stop) {   //!true => false =>if(false)
			System.out.println("조건충족");
		}else {
			System.out.println("조건충족x");
		}

		
	}

}




