import java.util.Scanner;
public class maiorNumero {
	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);
		int i=0, n, qtd, o=0;
		do {
			System.out.println("Entre com a quantidade de n�meros:");
			qtd = in.nextInt();
			if (qtd == 0) {
				System.out.println("Fim do programa.");
			}else {
				do {
					System.out.println("Entre com o n�mero:");
					n = in.nextInt();
					i = 0;
					if (n<o) {
						o=n;
					}else {
						o=o;
					}
					i++;
				}while (i<qtd); {
					System.out.println("O maior n�mero �"+o);
				}
				in.close();
			}while (qtd != 0)
			in.close();
		}
	}
}
