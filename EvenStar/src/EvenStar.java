import java.util.Scanner;

/**
 * @author Cerulean
 *	Every Other Digit
	모든 짝수번째 숫자를 * 로 치환하시오.(홀수번째 숫자,또는 짝수번째 문자를 치환하면 안됩니다.) 로직을 이용하면 쉬운데 정규식으로는 어려울거 같아요.
	Example: a1b2cde3~g45hi6 → a*b*cde*~g4*hi6
	http://regex101.com/quiz/ , http://codingdojang.com/scode/428
 *
 */

public class EvenStar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expr = "[0-9]";
		char[] str = (new Scanner(System.in)).next().toCharArray();
		for(int i=0; i<str.length; i++) 
		{
			if((i%2==1) && Character.toString(str[i]).matches(expr)) 
				str[i] = '*';
			System.out.print(str[i]);
		}
	}
}
