package ch02ch03;

public class Ex02 {

	public static void main(String[] args) {
	  //데이터타입 변수명; //변수선언
	  //변수명 = 값;     //값할당 
		String name;
		name = "홍길동";//초기값(default value)
		System.out.println("개명전 회원명:"+name);//콘솔출력
		
		//임의비밀번호를 pwd변수에 저장 및 출력
		//데이터타입 변수명 = 값;
		String pwd = "123456";
		String id = "hongid";
		name = "홍GD";
		
		//Syntax error on token "name", delete this token
		// + 연결연산자
		System.out.print("비번:"+pwd+"\n");
		System.out.println("id:"+id);//콘솔출력

		System.out.println("개명후 회원명:"+name);//홍GD
	}

}
