import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta20_10 {

	public static void main(String[] args) {
		//Se pone un try catch para comprobar que el valor introducido es un numero
		//ya que si se introduce texto y se intenta convertir en Duoble saltare el error
		try {
			
			//Recoge los datos del input
			String numSales = JOptionPane.showInputDialog("Por favor ingresa el numero de ventas");
			//Calcula el precio con el iva (price*0.21)
			int ventas= Integer.parseInt(numSales);
			double total=0;
			boolean correctValue;
			
			for (int i = 1; i <= ventas; i++) {
				//Bucle do while utilizado para que el usuario corrija el error en la entrada de datos
				do {
					//Valor que resetea al entrar en el while este comprueba que no haya saltado el try catch
					correctValue=true;
					try {
						//Indica al usuario que entre los valores (precio) de cada producto
						String price = JOptionPane.showInputDialog("Por favor ingresa el costo de producto "+i);
						
						//Hace la conversion de String a Double en caso de saltar un error 
						//en la conversion este reinicia el pedido del valor del producto
						double pricedouble= Double.parseDouble(price);
						
						//acumula el resultado de los productos confome se introducen
						total += pricedouble;
					} catch (Exception e) {
						//Notifica que el valor introducido es incorrecto y reinicia la demanda de valor
						System.out.println("Valor incorrecto recuerda que tienes que introducir numeros sin ningun caracter");
						correctValue=false;
					}
				//Mientras el try catch no salte y convierta correctValue en falso proseguira con normalidad
				} while (!correctValue);
				
			}
			//Indica el resultado del precio 'total' con un formato de 2 decimales
			System.out.println("El precio total con IVA incluido es : "+String.format("%.2f", total)+"€");
		}catch(Exception e) {
			//Informa de que el input no ha recibido un numero
			System.out.println("El valor introducido no es un numero");
		}

	}

}
