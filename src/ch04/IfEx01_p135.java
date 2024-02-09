package ch04;

/*if문
if(조건){
	조건만족시 실행코드
}

if(조건){
	조건만족시 실행코드
}else{
	조건만족x 실행코드
}

if(조건1){
	조건1만족시 실행코드
}else if(조건2){
	조건2만족시 실행코드
}else if(조건n){
	조건n만족시 실행코드
}else{
	위의 모든 조건만족x 실행코드
}
*/
public class IfEx01_p135 {
		
	public static void main(String[] args) {
		//단,점수는 0이상~100이하
		int score = 9;
		//점수가 90점 이상이면서 and 점수가 100이하라면 A학점
		//점수가 90점 이상아니지만,점수가 80점 이상이라면 B학점
		//점수가 80점 이상아니지만,점수가 70점 이상이라면 C학점
		//점수가 70점 이상아니지만,점수가 60점 이상이라면 D학점
		//점수가 60점 미만이면 F학점
		String result = null;//클래스타입의 자동초기값 null
		char grade = ' ';    //char타입의 자동초기값 공백
		if(score>=0 & score<=100) {
			if(score>=90){
				result = "A"; grade = 'a';
			}else if(score>=80){
				result = "B"; grade = 'b';
			}else if(score>=70){
				result = "C"; grade = 'c';
			}else if(score>=60){
				result = "D"; grade = 'd';
			}else {
				result = "F"; grade = 'f';
			}//내부if문
			System.out.println(result+"학점");
			System.out.println(grade+"grade");
		}else {
			System.out.println("점수는 0이상~100이하여야 합니다");
		}//외부if문

	}//main
	

}//class











