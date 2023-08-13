import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta20_5 {

	public static void main(String[] args) {
		try {
			//Recoge los datos del input
			String num = JOptionPane.showInputDialog("Por favor ingresa un numero para saber si es divisible entre 2");
			
			//Calcula la division y devuelve el resto
			int divisible= Integer.parseInt(num)%2;
			
			//Condicional que comprueba si el valor es 0 (divisible) o mas de uno (no divisible)
			if(divisible==0) {
				System.out.println(num+" es divisible entre 2 dando como resto "+divisible);
			}else{
				System.out.println(num+" 'No' es divisible entre 2 dando como resto "+divisible);
			}
		}catch(Exception e) {
			//Informa de que el input no ha recibido un numero
			System.out.println("El valor introducido no es un numero o un numero valido");
		}

	}

}
