import java.util.Scanner;

/**
 * @author Cerulean
 *	Every Other Digit
	��� ¦����° ���ڸ� * �� ġȯ�Ͻÿ�.(Ȧ����° ����,�Ǵ� ¦����° ���ڸ� ġȯ�ϸ� �ȵ˴ϴ�.) ������ �̿��ϸ� ��� ���Խ����δ� ������ ���ƿ�.
	Example: a1b2cde3~g45hi6 �� a*b*cde*~g4*hi6
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
