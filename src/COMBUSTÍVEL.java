import java.util.Scanner;
public class COMBUST�VEL {
	public static void main(String args[]) {
		Scanner in=new Scanner (System.in);
		int km, ct, consumo;
		System.out.println("Entre com a dist�ncia percorrida:");
		km = in.nextInt();
		System.out.println("Entre com a capacidade do tanque:");
		ct = in.nextInt();
		consumo = km/ct;
		System.out.println("O consumo de combust�vel foi de:"+consumo+" litros");
		if (consumo>=10) {
			System.out.println("Econ�mico.");
		}else
			System.out.println("N�o econ�mico.");
		}
	}
