package ch14;

//java에서는 java.lang패키지는 import하지않아도 된다
//java.util패키지안의 Scanner클래스를 import
import java.util.Scanner;

/*Scanner클래스(p636)
-java.util패키지에서 제공하는 클래스
-사용자로부터 입력받기 위해서 사용되는 클래스
 */
public class ScannerEx01_p636 {

	public static void main(String[] args) {
		//class(클래스)로부터 object(객체) 생성하여 참조변수 주소할당

/*		//타입    변수명; //참조변수선언
		//클래스명 변수명;
		String name;
		
		//new 클래스명();  //object(객체) 생성
		name = new String("홍길동"); 
		System.out.println("name="+name);
		
		String name3 = new String("홍길동");
		System.out.println("name3="+name3);
*/
		
		//Scanner class(클래스)로부터 object(객체) 생성하여 참조변수 주소할당
		Scanner sc = new Scanner(System.in);
		
		//nextLine(): 한 줄의 문자열을 입력받기
		System.out.print("이름을 입력하세요:");
		String name = sc.nextLine();
		System.out.println("입력받은 이름:"+name);
		
		//nextInt(): 정수값을 입력받기
		System.out.print("나이을 입력하세요:");
		int age = sc.nextInt();
		System.out.println("입력받은 나이:"+age);
		
		//nextDouble() : 실수값을 입력받기
		System.out.print("(소수점)키를 입력하세요:");
		double height = sc.nextDouble(); 
		System.out.println("입력받은 키:"+height);
		
		//nextBoolean():boolean값을 입력받기
		System.out.print("여성입니까?(true|false):");
		boolean isWoman = sc.nextBoolean();
		System.out.println("대답:"+isWoman);
		
		sc.close();//자원해제
	}

}







