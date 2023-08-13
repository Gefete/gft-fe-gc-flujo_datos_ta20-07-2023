import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta20_11 {

	public static void main(String[] args) {
		//Boleano que servira para controlar errores en la introduccion de datos
		boolean correctvalue;	
		do {
			correctvalue=true;
			//Entrada de datos del usuario
			String day = JOptionPane.showInputDialog("Ingresa el dia de la semana (Lunes, Martes...)");
			day = day.toLowerCase();
			
			//Escogera dependiendo el dia y mostrara el dia de la semana y si es laborable
			switch (day) {
				case "lunes": {
					System.out.println(day+" es dia laborable");
					break;
				}
				case "martes": {
					System.out.println(day+" es dia laborable");
					break;
				}
				case "miercoles": {
					System.out.println(day+" es dia laborable");
					break;
				}
				case "jueves": {
					System.out.println(day+" es dia laborable");
					break;
				}
				case "viernes": {
					System.out.println(day+" es dia laborable");
					break;
				}
				case "sabado": {
					System.out.println(day+" es festivo");
					break;
				}
				case "domingo": {
					System.out.println(day+" es festivo");
					break;
				}
				//El valor default servira para reiniciar la demanda de datos en caso de no coincidir
				default:
					System.out.println("Valor incorrecto intente de nuevo");
					correctvalue=false;
			}
		//si el boleano es falso significa que el usuario no ha introducido el valor correcto que se pedia
		} while (!correctvalue);
	}

}
