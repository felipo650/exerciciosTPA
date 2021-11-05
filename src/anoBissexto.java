import java.util.Scanner;
public class anoBissexto {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int ac= 0,  af, ab = 0;
		System.out.println("Entre com o ano inicial:");
		ac = in.nextInt();
		System.out.println("Entre com o ano final:");
		af = in.nextInt();
		do {
			if ((ac % 4==0) && (ac % 100 !=0) || (ac % 400 == 0)) {
			System.out.println("O ano "+ac+" é bissexto.");
			ab++;
		}else {
			System.out.println(ac);
		}
		ac++;
		}while(ac<=af);
			System.out.println("A quantidade de anos bissextos é "+ab);
			in.close();
		}
	}