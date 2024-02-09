package ch11;

/*Math(p504)
- 수학계산에 사용할 수 있는 필드와 메서드를 제공
  클래스명.필드명		예)Math.PI
  클래스명.메서드명()   예)Math.random()
 */
public class MathEx01_p504 {

	public static void main(String[] args) {
		//Math.PI :  3.141592653589793
		double pi = Math.PI;
//		System.out.println(pi);
		
		//Math.random(): 0.0이상 1.0미만의 난수발생
//		for(int i=1;i<=5;i++) {
//			//double rnd = Math.random();
//			int rnd = (int)Math.random()+1;
//			System.out.println(rnd);
//		}
		
		//start부터 시작하면 n개의 정수 중에서 임의 정수구하기
		//(int)(Math.random()*n)+start;
		
		//주사위:1부터 6개의 정수 중에서 임의 정수구하기
		//(int)(Math.random()*6)+1;
		System.out.println((int)(Math.random()*6)+1);
		
		//로또번호:1~45
		//1부터 시작하면 45개의 정수 중에서 임의 정수구하기
		//(int)(Math.random()*45)+1;
		
		//abs() 양수구하기
		System.out.println("Math.abs(-100)="+Math.abs(-100));
		System.out.println("Math.abs(100)="+Math.abs(100));
		System.out.println("Math.abs(pi)="+Math.abs(pi));
		
		//ceil() : 올림값
		System.out.println("Math.ceil(3.914)="+ Math.ceil(3.914));//4.0
		System.out.println("Math.ceil(-3.914)="+Math.ceil(-3.914));//-3.0
		
		//floor(): 내림값
		System.out.println("Math.floor(3.914)="+ Math.floor(3.914));//3.0
		System.out.println("Math.floor(-3.914)="+Math.floor(-3.914));//-4.0
		
		//round(): 반올림
		System.out.println("Math.round(3.194)="+Math.round(3.194));//3
		System.out.println("Math.round(3.5)="+Math.round(3.5));//4

	}

}





