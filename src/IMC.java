import java.util.Scanner;
public class IMC {
	public static void main(String args[]) {
		Scanner in=new Scanner (System.in);
		double kg, m, imc;
		System.out.println("Entre com o seu peso:");
		kg = in.nextInt();
		System.out.println("Entre com a sua altura:");
		m = in.nextDouble();
		imc = kg/(m*m);
		System.out.println("Seu IMC é:"+Math.round(imc));
		if (imc>=18.5 && imc<25) {
			System.out.println("Excesso de Magreza.");
		}else if (imc>=25 && imc<30) {
			System.out.println("Peso Normal.");
		}else if (imc>=30 && imc<35) {
			System.out.println("Excesso de peso.");
		}else if (imc>=35 && imc<40) {
			System.out.println("Grau de Obesidade I.");
		}else if (imc>=40) {
			System.out.println("Grau de Obesidade II.");
		} else {
			System.out.println("Grau de Obesidade III.");
			
		}
	}
}