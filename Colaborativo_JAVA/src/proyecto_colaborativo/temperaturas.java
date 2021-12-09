package proyecto_colaborativo;

import java.util.Scanner;

public class temperaturas {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		System.out.println("Tomar cada hora la temperatura exterior leyendola durante un período"
				+ " de 24 horas. Encontrar las temperaturas más altas y más bajas del día a partir de estos datos");
		
		// Ingresamos temperatura
		
		Scanner lector = new Scanner(System.in);
		
		int temperatura;
		int mayor = 0;
		int menor = 0;
		int contador;
		
		// Valoramos el tipo de temperatura obtenida y obtenemos el mayor y el menor
		
		for (contador = 0; contador < 24; contador++) {
			System.out.println("Introduce la temperatura deseada: ");
			temperatura = lector.nextInt();
			
			if(contador == 0)
			{
				mayor = temperatura;
			}
			
			if(temperatura > mayor)
			{
				mayor = temperatura;
			}
			else
			{
				if(temperatura < menor)
				{
					menor = temperatura;
				}
			}
		}
		
		System.out.println("La tempertura máxima es "+mayor+" y la temperatura mínima es "+menor);

	}

}
