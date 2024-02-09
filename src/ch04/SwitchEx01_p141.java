package ch04;

/*제어문
 * -조건문(if,switch),반복문
*switch(변수명){
  case 값1: 실행코드; break;  
  case 값2: 실행코드; break;  
  case 값n: 실행코드; break;
  default: 실행코드; break; 
}

*/
public class SwitchEx01_p141 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String result = null;
		
		//user로 부터 정수값을 입력받으세요
	/*	System.out.print("정수값을 입력하세요:");
		int num = scanner.nextInt();*/
		
		//1~6사이의 난수 발생
		int num = (int)(Math.random()*6)+1; 
		switch(num){
		  case 1: result = "1번"; break;  
		  case 2: result = "2번"; break;  
		  case 3: result = "3번"; break;  
		  case 4: result = "4번"; break;  
		  case 5: result = "5번"; break;  
		  case 6: result = "6번"; break;  
		  default: result = "그외"; break; 
		}
		System.out.println(num+"의 결과:"+result);
		System.out.println("---------------------");
		//P143 char타입을 사용 
		char grade = 'A';  
		switch(grade){
		  case 'A': result = "A입니다"; break;  
		  case 'B': result = "B니다"; break;  
		  case 'a': result = "a입니다"; break;  
		  case 'b': result = "b입니다"; break;  
		  default: result = "그외"; break; 
		}
		System.out.println(result);
		System.out.println("---------------------");
		//P144 String타입을 사용->해보세요~
	}

}





