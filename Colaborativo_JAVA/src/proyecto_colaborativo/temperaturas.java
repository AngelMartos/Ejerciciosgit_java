package proyecto_colaborativo;

import java.util.Scanner;

public class temperaturas {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

		System.out.println("Tomar cada hora la temperatura exterior leyendola durante un per�odo"
				+ " de 24 horas. Encontrar las temperaturas m�s altas y m�s bajas del d�a a partir de estos datos");
		
		// Ingresamos temperatura
		
		Scanner lector = new Scanner(System.in);
		
		int temperatura;
		int mayor = 0;
		int menor = 0;
		
		// Valoramos el tipo de temperatura obtenida y obtenemos el mayor y el menor
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce la temperatura deseada: ");
			temperatura = lector.nextInt();
			
			if(temperatura > mayor)
			{
				mayor = temperatura;
			}
			else {
				menor = temperatura;
			}
		}
		
		System.out.println("La tempertura m�xima es "+mayor+" y la temperatura m�nima es "+menor);

	}

}
