import java.util.Scanner;

/**
 * 
 * @author henriquerc_18
 *
 */

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int mes = 0;
		int dia = 0;
		
		System.out.println("Digite o dia do seu aniversário: ");
		dia = scan.nextInt();
		scan.nextLine();
		System.out.println("Digite o mês do seu aniversário: ");
		mes = scan.nextInt();
		scan.nextLine();
		
		if(dia >= 21 && dia <= 31 && mes == 3 || dia >= 1 && dia <= 21 && mes == 4){
			System.out.println("Áries");
		}else if(dia >= 22 && dia <= 30 && mes == 4 || dia >= 1 && dia <= 20 && mes == 5){
			System.out.println("Touro");
		}else if(dia >= 21 && dia <= 31 && mes == 5 || dia >= 1 && dia <= 21 && mes == 6){
			System.out.println("Gêmeos");
		}else if(dia >= 22 && dia <= 30 && mes == 6 || dia >= 1 && dia <= 22 && mes == 7){
			System.out.println("Câncer");
		}else if(dia >= 23 && dia <= 31 && mes == 7 || dia >= 1 && dia <= 23 && mes == 8){
			System.out.println("Leão");
		}else if(dia >= 24 && dia <= 31 && mes == 8 || dia >= 1 && dia <= 22 && mes == 9){
			System.out.println("Virgem");
		}else if(dia >= 24 && dia <= 30 && mes == 9 || dia >= 1 && dia <= 23 && mes == 10){
			System.out.println("Libra");
		}else if(dia >= 24 && dia <= 31 && mes == 10 || dia >= 1 && dia <= 22 && mes == 11){
			System.out.println("Escorpião");
		}else if(dia >= 23 && dia <= 30 && mes == 11 || dia >= 1 && dia <= 21 && mes == 12){
			System.out.println("Sagitário");
		}else if(dia >= 22 && dia <= 31 && mes == 12 || dia >= 1 && dia <= 21 && mes == 1){
			System.out.println("Capricórnio");
		}else if(dia >= 22 && dia <= 31 && mes == 1 || dia >= 1 && dia <= 19 && mes == 2){
			System.out.println("Aquário");
		}else if(dia >= 20 && dia <= 29 && mes == 2 || dia >= 1 && dia <= 20 && mes == 3){
			System.out.println("Peixes");
		}

	}

}
