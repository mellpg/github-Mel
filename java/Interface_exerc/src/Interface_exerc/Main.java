package Interface_exerc;

import java.util.*;

public class Main {

	public static
	void
	main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		while(true) {
			System.out.println("Escolha uma das opções a seguir:");
			System.out.println("1 - SMS");
			System.out.println("2 - Whatzapp");
			System.out.println("3 - E-mail");
			System.out.println("4 - Redes sociais");
			System.out.println("5 - Sair do programa");
			sc.close();
			switch(option) {
			case 1 -> {
				SMS sms = new SMS();  
		        sms.makeCall();

			}
			
			case 2 -> {
				Whatzapp whatzapp = new Whatzapp();
				whatzapp.makeCall();
			}
			
			case 3 -> {
				Email email = new Email();
				email.makeCall();
			}
			
			case 4 -> {
				RedesSociais redesSociais = new RedesSociais();
				redesSociais.makeCall();
			}
			
			case 5 -> {
				break;
			}
			default -> {
				System.out.println("Inválido! Tente novamente!");
			}
			}
		}
		
		

	}

}
