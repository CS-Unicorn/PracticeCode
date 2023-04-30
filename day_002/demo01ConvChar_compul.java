/**
	CodePractice_day_002
	@author programmerX
	@version default
*/
public class demo01ConvChar_compul{
	/**
		compulsively datatype convert
	*/
	public static void main(String[] args){
		byte num1 = 122;
		System.out.println("num1 = " + num1);
		
		byte num2 = 3;
		System.out.println("num2 = " + num2);
		byte num3 = (byte)(num2+1);
		System.out.println("num3 = num2 + 1 = " + num3);
		
		char c1 = 'Œ“';
		System.out.println("Œ“ = "+ (c1+0));
		
		int c2 = 20013;
		System.out.println("20013 = " + (char)c2);
	}
}