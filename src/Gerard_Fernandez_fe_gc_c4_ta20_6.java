import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta20_6 {

	public static void main(String[] args) {
		final int iva = 21;
		//Se pone un try catch para comprobar que el valor introducido es un numero
		//ya que si se introduce texto y se intenta convertir en Duoble saltare el error
		try {
			
			//Recoge los datos del input
			String price = JOptionPane.showInputDialog("Por favor ingresa el precio del producto");
			//Calcula el precio con el iva (price*0.21)
			double total= Double.parseDouble(price)+(Double.parseDouble(price)*((double)iva/100));
			
			//Indica el resultado del precio 'total' con un formato de 2 decimales
			System.out.println("El precio total con IVA incluido es : "+String.format("%.2f", total));
		}catch(Exception e) {
			//Informa de que el input no ha recibido un numero
			System.out.println("El valor introducido no es un numero");
		}

	}

}
