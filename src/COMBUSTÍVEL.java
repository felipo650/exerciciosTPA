import java.util.Scanner;
public class COMBUSTÍVEL {
	public static void main(String args[]) {
		Scanner in=new Scanner (System.in);
		int km, ct, consumo;
		System.out.println("Entre com a distância percorrida:");
		km = in.nextInt();
		System.out.println("Entre com a capacidade do tanque:");
		ct = in.nextInt();
		consumo = km/ct;
		System.out.println("O consumo de combustível foi de:"+consumo+" litros");
		if (consumo>=10) {
			System.out.println("Econômico.");
		}else
			System.out.println("Não econômico.");
		}
	}
