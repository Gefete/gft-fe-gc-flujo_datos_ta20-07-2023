import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta20_4 {
	public static void main(String[] args) {
		//Se pone un try catch para comprobar que el valor introducido es un numero
		//ya que si se introduce texto y se intenta convertir en Duoble saltare el error
		try {
			//Recoge los datos del input
			String r = JOptionPane.showInputDialog("Por favor el radio del circulo para devolver el area");
			//Calcula del area del circulo
			double circleA= Math.PI*Math.pow(Double.parseDouble(r), 2);
			System.out.println("El area del circulo es : "+String.format("%.2f", circleA));
		}catch(Exception e) {
			//Informa de que el input no ha recibido un numero
			System.out.println("El valor introducido no es un numero");
		}
	}
}
