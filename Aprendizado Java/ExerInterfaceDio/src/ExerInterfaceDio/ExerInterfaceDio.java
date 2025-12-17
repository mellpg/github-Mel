package ExerInterfaceDio;
import java.util.*;

public class ExerInterfaceDio {

	private final  static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int option = - 1;
		GeometricArea geometricArea = null;
		while(true) {
			System.out.println("Escolha a forma geométrica para calcular a área:");
			System.out.println("1 - Quadrado:");
			System.out.println("2 - Retângulo:");
			System.out.println("3 - Círculo:");
			System.out.println("4 - Sair do programa:");
			option = scanner.nextInt();
			if (option == 1) {
				geometricArea = createSquare();
			} else if (option == 2) {
				geometricArea =createRectangle();
			} else if (option == 3) {
				geometricArea = createCircle();
			} else if (option == 4) {
				break;
			} else {
				System.out.println("Inválido!");
			}
			
			System.out.println("\nSaída:") ;
			System.out.println("O resultado do cálculo da Área foi de: " + geometricArea.getArea());
			
			// esperar ENTER
			System.out.println("\nPressione ENTER para continuar...");
			scanner.nextLine(); // limpar buffer
			scanner.nextLine(); 

			// limpar a tela (funciona em IDE)
			for (int i = 0; i < 50; i++) System.out.println();


		}

	}


	private static  GeometricArea createSquare() {

		System.out.println("\nInforme o tamanho dos lados: \n");
		var side = scanner.nextDouble();
		return new Square(side);

	}

	private static GeometricArea createRectangle() {

		System.out.println("Informe a base: \n");
		var base = scanner.nextDouble();
		System.out.println("Informe a altura: \n");
		var height = scanner.nextDouble();
		return new Rectangle(height,base);

	}

	private static GeometricArea createCircle() {

		System.out.println("Informe o raio: \n");
		var radius = scanner.nextDouble();
		return new Circle(radius);

	} }
