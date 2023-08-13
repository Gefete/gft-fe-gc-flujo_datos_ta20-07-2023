import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta20_3 {

	public static void main(String[] args) {
		//Funcion de la libreria javax que optiene mediante un input grafico un valor
		//Tambien tenemos la funcion scanner
		String name = JOptionPane.showInputDialog("Por favor ingresa tu nombre");
		
		//suma el valor "Bienvenido" con el valor que introduce el usuario
		String output = "Bienvenido "+name;
		
		//imprime por consola la concatenacion
		System.out.println(output);
	}

}
