
public class Gerard_Fernandez_fe_gc_c4_ta20_9 {

	public static void main(String[] args) {
		//Bucle for, se le indica que reitere 100 veces, y el valor i almacena la acumulación
				for (int i = 1; i <= 100; i++) {
					//condicional que comprueba que el numero de la iteración sea divisible entre 2 y 3
					if(i%2==0 && i%3==0) {
						System.out.println(i+" es divisible entre 2 y 3");
					}
				}
				//Informa que los numeros que no salen en el rango anterior no son validos
				System.out.println("\nDel 1 al 100 que no aparecen en la lista anterior no son divisibles entre esos 2 numeros (2 y 3)");

	}

}
