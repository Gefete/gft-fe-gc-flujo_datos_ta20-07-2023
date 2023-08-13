import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta20_12 {

	public static void main(String[] args) {
		//La contraseña que hay que poner para que finalice
		String password="HelloWorld123";
		boolean correct= false; 
		int intents=3;
		
		//Se cumplira el while mientras haya intentos disponibles o se haya acertado la constraseña
		while (!correct && intents>0) {
		
			//Recoge la contraseña del usuario y muestra los intentos que quedan
			String introPassword = JOptionPane.showInputDialog("Ingrese la contraseña (intentos restantes "+intents+")");
			if(password.equals(introPassword)) {
				//Notificación al usuario de que ha coincidido la constraseña
				System.out.println("Enhorabuena has logrado logearte");
				//Indica que la contraseña del usuario coincide con la variable quela almacena
				correct= true; 
			}
			
			//disminuye el contador en 1 con cada reiteración
			intents--;
		}
		
		//Mensaje que informa al usuario que no ha logrado acertar la contraseña
		if(!correct) {
			System.out.println("Acceso denegado no has logrado logearte");
		}
	}
}
