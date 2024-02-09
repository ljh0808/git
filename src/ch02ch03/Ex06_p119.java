package ch02ch03;

/*
*단항연산자 : 피연산자의 개수 1개  !
*이항연산자 : 피연산자의 개수 2개  비교연산자,산술연산자 등
*삼항연산자 : 피연산자의 개수 3개 
* 조건? 참일경우:거짓일경우
*
*비교연산자(p119) 
A==B A는 B와 같다.동일.일치
A!=B A는 B와 같지않아요.동일X.일치X
   
A>B  A는 B보다 크다.초과
A<B  A는 B보다 작다.미만
A>=B A는 B보다 크거나 같다.이상
A<=B A는 B보다 작거나 같다.이하


if(조건){
	조건이 true=>조건충족시 실행코드
}

if(조건){
	조건이 true=>조건충족시 실행코드
}else{
	조건이 false=>조건충족x시 실행코드
}

if(조건1){
	조건1이 true=>조건1충족시 실행코드
}else if(조건2){
	조건2충족시 실행코드
}else if(조건n){
	조건n충족시 실행코드
}else{
	모든 조건 충족x시 실행코드
}


*/
public class Ex06_p119 {

	public static void main(String[] args) {
		String result = "";
		int score = 97;

		//(조건)? 참일경우:거짓일경우
		result = (score>=80)? "합격":"불합격";
		System.out.println(result);
		
		System.out.println("--------------");
		if(score>=80) {
			result = "합격";
		}else {
			result = "불합격";
		}
		System.out.println(result);
		
		System.out.println("--------------");
		if(score>=80) {
			System.out.println("합격");
		}else if(score>=70){
			System.out.println("대기합격");
		}else {
			System.out.println("불합격");
		}
		
	}

}
