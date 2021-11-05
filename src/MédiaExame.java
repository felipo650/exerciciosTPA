import java.util.Scanner;
public class MédiaExame {
	public static void main(String args[]) {
		Scanner in=new Scanner (System.in);
		double n1, n2, m, notaExame1,notaExame2, mediaExame;
		System.out.println("Entre com a primeira nota:");
		n1 = in.nextDouble();
		System.out.println("Entre com a segunda nota:");
		n2 = in.nextDouble();
		m = (n1+n2)/2;
		System.out.println("A média do aluno é "+m+"");
		
		if (m<3) {
			System.out.println("Reprovado");
		}else if (m>=6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Exame");
        System.out.println("Entre com a nova primeira nota:");
        notaExame1 = in.nextDouble();
        System.out.println("Entre com a nova segunda nota:");
        notaExame2 = in.nextDouble();
        mediaExame = (notaExame1+notaExame2)/2;
        System.out.println("A nova média do aluno é "+mediaExame+"");
        if (mediaExame>6) {
        	System.out.println("Aprovado");
        }else {
        	System.out.println("Reprovado");
        }
		}
	}
}