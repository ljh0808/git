package ch02ch03;

//printf(p90)
//printf()
public class PrintfEx_p90 {

	public static void main(String[] args) {
		String name = "HGD";
		long age = 45;
		double height = 180.5;
		
		System.out.printf("%10s%5d%10.3f\n",name,age,height);
		System.out.printf("%10s%5d%10.3f\n","abc",55,199.9);
		System.out.printf("%10s%5d%10.3f\n","abcd",1,169.15);
		System.out.printf("%10s%5d%10.3f\n","abcdfesq",123,178.9);
		System.out.println("---------------");//줄바꿈
		
		System.out.println("println 이름:"+name);		
		System.out.print("print 이름:");		
		System.out.print(name+"\n");
		System.out.printf("printf 이름:%s\n",name);
		System.out.printf("printf 나이:%d",age);
//The method printf(String, Object...) in the type PrintStream 
//is not lapplicabe for the arguments (long)
	}

}






