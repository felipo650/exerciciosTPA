import java.util.Scanner;
public class idadeAluno {
	public static void main (String args[]) {
	Scanner in = new Scanner (System.in);
	int i=1;
	int idadeAluno, maior=0, menor=0;
		while (i<=10) {
			System.out.println("Entre com a idade do "+i+" aluno:");
			idadeAluno = in.nextInt();
			idadeAluno++;
			if (idadeAluno<18) {
			System.out.println("Esse(a) aluno(a) é menor de idade.");
			menor++;
			}else {
			System.out.println("Esse(a) aluno(a) é maior de idade.");
			maior++;
			}
			i++;
		}
		System.out.println("Quantidade de menores "+menor);
		System.out.println("Quantidade de maiores "+maior);
	}
}