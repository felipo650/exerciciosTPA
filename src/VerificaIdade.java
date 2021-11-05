import java.util.Scanner;
public class VerificaIdade {
	public static void main(String args[]) {
		Scanner in=new Scanner (System.in);
		
		int aa, an ,id;
		
		System.out.println("Entre com seu ano de nascimento:");
		an = in.nextInt();
		System.out.println("Entre com o ano atual:");
		aa = in.nextInt();
		id = aa-an;
		System.out.println("Sua idade é "+id+" anos");
		if (id<10) {
			System.out.println("Criança.") ;
		}else if(id>=10 && id<18) {
			System.out.println("Adolescente.");
		}if(id>=18 && id<60) {
			System.out.println("Adulto.");
		}else if(id>60){
			System.out.println("Idoso.");
		}
	}
}
	


	