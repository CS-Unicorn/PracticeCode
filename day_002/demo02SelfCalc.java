/**
	CodePractice_day_002
	@author programmerX
	@version default
*/
public class demo02SelfCalc{
	public static void main(String[] args){
		int a = 100;
		a = a--;
		System.out.println("a = " + a);
		
		/*
			?C/C++??,???????????????
		*/
		int b = 10, c = 20;
		int calc = (b++) + --c + (++a);
		System.out.println("calc = " + calc);
	}
}