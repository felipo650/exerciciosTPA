import java.util.Scanner;
public class TRIÂNGULO {
	public static void main(String args[]) {
		Scanner in=new Scanner (System.in);
		
		int a, b, c;
		
		System.out.println("Entre com o primeiro lado:");
		a = in.nextInt();
		System.out.println("Entre com o segundo lado:");
		b = in.nextInt();
		System.out.println("Entre com o terceiro lado:");
		c = in.nextInt();
		
		if (a>b+c || b>a+c || c>a+b) {
			System.out.println("Não é triângulo.");
		}else if (a == b && b==c) {
			System.out.println("O triângulo é equilátero.");
		}else if (a !=b && a!=c) {
			System.out.println("O triângulo é escaleno");
	    }else {
	    	System.out.println("O triângulo é isósceles");
	    }
	    }
	}
	
