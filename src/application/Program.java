package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Resolução de equações do segundo grau".toUpperCase());
		// leitura do valor de a não pode ser nulo
		Double a;
		while (true) {
			try {
				System.out.print("Entre com o valor de a -> ");
				String a1 = sc.next();
				a = Double.parseDouble(a1);
				
				if ( (a == 0)||(a == null) ) {//a não pode ser zero
					throw new IndexOutOfBoundsException();
				}
				else {
					break;
				}

			} 
			catch (IndexOutOfBoundsException e) {
				System.out.println("O valor de a não pode ser nulo");
			}
			catch (NumberFormatException e) {
				System.out.println("Não é um número");
			} 
			catch (Exception e) {
				System.out.println("Entrada inválida");
			} 
			
		}
		Double b;
		while (true) {
			try {
				System.out.print("Entre com o valor de b -> ");
				String b1 = sc.next();
				b = Double.parseDouble(b1);
				if (b != null) {
					break;
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Não é um número");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		//encontrando o valor de c
		Double c;
		while (true) {
			try {
				System.out.print("Entre com o valor de c -> ");
				String c1 = sc.next();
				c = Double.parseDouble(c1);
				if (c != null) {
					break;
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Não é um número");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("\nfim da entrada de dados".toUpperCase());
		System.out.printf("a = %.5f\nb = %.5f\nc = %.5f\n", a, b, c);
		//resolução
		double delta = b * b - 4 * a * c;
		System.out.printf("delta = %.5f\n", delta);
		double xv = - b / 2 * a;
		double yv = - delta / 4 * a;
		System.out.printf("As coordenadas do vértice são (%.5f, %.5f)\n", xv, yv);
		
		if (delta > 0.0) {
			System.out.println("A função tem duas raízes reais distintas");
			double x1 = (-b + Math.sqrt(delta)) / 2 * a;
			double x2 = (-b - Math.sqrt(delta)) / 2 * a;
			System.out.printf("x1 = %.5f\n", x1);
			System.out.printf("x2 = %.5f\n", x2);

		}
		else if (delta == 0.0) {
			System.out.println("A função tem duas raízes reais iguais");
			System.out.printf("x1 = x2 = %.5f\n", xv);
		}
		else {
			System.out.println("A função tem duas raízes complexas");
			double comp = Math.sqrt(-delta) / 2*a;
			if (xv != 0.0) {
				System.out.printf("x1 = %.5f + %.5fi\n",xv, comp);
				System.out.printf("x2 = %.5f - %.5fi\n",xv, comp);
			}
			else {
				System.out.printf("x1 = + %.5fi\n", comp);
				System.out.printf("x2 = - %.5fi\n", comp);
			}
		}
		System.out.println("programa finalizado".toUpperCase());
		sc.close();
	}

}
