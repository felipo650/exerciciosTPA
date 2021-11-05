import java.util.Scanner;
public class multiplo10{
	public static void main (String args[]) {
		Scanner in=new Scanner (System.in);
		int i = 0;
		do {
		if (i % 10==0) {
			System.out.println(i+ " multiplo de 10.");
		}else {
			System.out.println (i);
		}
			i++;
		}while (i<301);
	}
}