import java.util.Scanner;
public class AlturaPedroJo�o {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int i=1;
		double alturaJoao, alturaPedro, alturaJoaoAno, alturaPedroAno;
		
		while (i<=3) {
			System.out.println("Entre com a altura de Jo�o:");
			alturaJoao = in.nextDouble();
			System.out.println("Entre com a altura de Pedro:");
			alturaPedro = in.nextDouble();
			System.out.println("Entre com a altura que Jo�o cresce por ano:");
			alturaJoaoAno = in.nextDouble();
			alturaJoao = alturaJoao+alturaJoaoAno;
			System.out.println("Entre com a altura que Pedro cresce por ano:");
			alturaPedroAno = in.nextDouble();
			alturaPedro = alturaPedro+alturaPedroAno;
			System.out.println("A altura de Jo�o �:"+alturaJoao);
			alturaJoao++;
			System.out.println("A altura de Pedro �:"+alturaPedro);
			alturaPedro++;
			i=i+1;
			if (alturaJoao<alturaPedro) {
				System.out.println("Jo�o ainda est� mais baixo que Pedro");
			}else {
				System.out.println("Jo�o levou "+i+" anos para ficar mais alto que Pedro");
			}
		}
	}
}