package ch02ch03;

//+연산에서의 문자열 자동 타입 변환
public class Ex05_p82 {

	/*
	 * 801123-1234567 "801123-1234567"
	 */
	
	public static void main(String[] args) {
		int n1 = 100;
		System.out.println("나이:"+(n1-1)+"세"); 
		//(n1-1)  100-1  99
		//"나이:"+"99"+"세"  
		//"나이:99세"
//The operator-is undefined for the argument type(s) String, int		
		
		String v1 = "100";
		//문자열String을 정수(byte,short,int,long)로 변환
		//byte v2 = Byte.parseByte(v1);
		//short v2 = Short.parseShort(v1);
		int v2 = Integer.parseInt(v1);
		//long v2 = Long.parseLong(v1);
				
		System.out.println(v2+"<==파싱후");
		System.out.println("나이:"+(v2-1)+"세");  //문자열변수
		System.out.println("나이:"+"100"+"세");
	}

}





