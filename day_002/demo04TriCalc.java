/**
	CodePractice_day_002
	@author programmerX
	@version default
*/
public class demo04TriCalc{
	public static void main(String[] args){
		int p1 = 170, p2 = 175, p3 = 180;
		int maxTemp = (p1>p2) ? p1 : p2;
		int max = (maxTemp>p3) ? maxTemp : p3;
		System.out.println(max);
	}
}