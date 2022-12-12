import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero1, numero2, resultado;
		System.out.print("Introduce primer número: ");
		numero1 = sc.nextInt();
		System.out.print("Introduce segundo número: ");
		numero2 = sc.nextInt();
	}

	public static int suma(int a, int b) {
			int c;
			c = a + b;
			return c;
			
			resultado = suma(numero1, numero2);
			System.out.println("Suma: " + resultado);
			
		public static int resta(int a, int b) {
				int c;
				c = a - b;
				return c;
		}
		
		public static int producto(int a, int b) {
					int c;
					c = a * b;
					return c;
		}

		public static int dividir(int a, int b) {
						int c;
						c = a / b;
						return c;
		}

					
}

}
