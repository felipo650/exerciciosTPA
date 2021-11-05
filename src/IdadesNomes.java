import java.util.Scanner;
public class IdadesNomes {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		String nomeMaior, nomeMenor, nome;
		int idadeMaior, idadeMenor, id;
		System.out.println("Entre com o primeiro nome:");
		nome = in.next();
		System.out.println("Entre com a primeira idade:");
		id = in.nextInt();
		
		nomeMaior = nome;
		idadeMaior = id;
		nomeMenor = nome;
		idadeMenor = id;
		
		System.out.println("Entre com o segundo nome:");
		nome = in.next();
		System.out.println("Entre com a segunda idade:");
		id = in.nextInt();
		
		if (id>idadeMaior) {
			nomeMaior = nome;
			idadeMaior = id;
		}else if (id<idadeMaior) {
			nomeMaior = nome;
			idadeMaior = id;
		}
		System.out.println("Entre com o terceiro nome:");
		nome = in.next();
		System.out.println("Entre com a terceira idade");
		id = in.nextInt();
		
		if (id>idadeMenor) {
			nomeMenor = nome;
			idadeMenor = id;
		}else if (id<idadeMaior) {
			nomeMaior = nome;
			idadeMenor = id;
		}
		System.out.println("Entre com o quarto nome:");
		nome = in.next();
		System.out.println("Entre com a quarta idade:");
		id = in.nextInt();
		
		if (id>idadeMaior) {
			nomeMaior = nome;
			idadeMaior = id;
		}else if (id<idadeMaior) {
			nomeMaior = nome;
			idadeMaior = id;
		}
		System.out.println("Entre com o quinto nome:");
		nome = in.next();
		System.out.println("Entre com a quinta idade:");
		id = in.nextInt();
		
		if (id<idadeMaior) {
			nomeMenor = nome;
			idadeMenor = id;
		}else if (id>idadeMaior) {
			nomeMaior = nome;
			idadeMaior = id;
		}
		System.out.println("O usuário mais velho possui "+idadeMaior);
		System.out.println("O nome do(a) usuário(a) mais velho(a) é: "+nomeMaior);
		System.out.println("O usuário mais novo possui "+idadeMenor);
		System.out.println("O nome do(a) usuário(a) mais velho(a) é: "+nomeMenor);
	}
}