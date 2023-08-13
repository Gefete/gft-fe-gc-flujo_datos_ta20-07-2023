import javax.swing.JOptionPane;

public class CalculadoraInversa {

	public static void main(String[] args) {
		boolean correct=true;
		//El while esta para reiniciar el proceso en caso de que el usuario cometa un error en la introduccion de operador
		do {
			String strnum1=JOptionPane.showInputDialog("Introduce el primer número entero");
			String strnum2=JOptionPane.showInputDialog("Introduce el segundo número entero");
			int num1=Integer.parseInt(strnum1);
			int num2=Integer.parseInt(strnum2);
			//recoge el simbolo del operador
			String symbol = JOptionPane.showInputDialog("introduce uno de los siguientes simbolos (+, -, *, /, ^, %)");
			int result=0;
			correct=true;
			
			//Switch que realiza operaciones segun el operador pasado
			switch (symbol) {
				case "+": {
					result=num1+num2;
					break;
				}
				case "-": {
					result=num1-num2;
					break;
				}
				case "*": {
					result=num1*num2;
					break;
				}
				case "/": {
					result=num1/num2;
					break;
				}
				case "^": {
					result=(int)Math.pow(num1, num2) ;
					break;
				}
				case "%": {
					result=num1%num2;
					break;
				}
				//Si el operador es incorrecto salta la opcion default que marcara mediante un boolean que el usuario 
				//ha cometido un error a la hora de ingresar operador
				default:
					System.out.println("El operador es incorrecto vuelve ha intentar");
					correct=false;
			}
			
			//Si todo se ha realizado correctamente mostrara al usuario el resultado de la operacion
			if(correct) {
				System.out.println(num1+" "+symbol+" "+num2+" = "+result);
			}
		//si el boleano es falso significa que el usuario no ha introducido el valor correcto que se pedia
		} while (!correct);

	}

}
