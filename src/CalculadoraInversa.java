import javax.swing.JOptionPane;

public class CalculadoraInversa {

	public static void main(String[] args) {
		boolean correct=true;
		
		do {
		String strnum1=JOptionPane.showInputDialog("Introduce el primer número entero");
		String strnum2=JOptionPane.showInputDialog("Introduce el segundo número entero");
		int num1=Integer.parseInt(strnum1);
		int num2=Integer.parseInt(strnum2);
		String symbol = JOptionPane.showInputDialog("introduce uno de los siguientes simbolos (+, -, *, /, ^, %)");
		int result=0;
		correct=true;
		
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
			default:
				System.out.println("El operador es incorrecto vuelve ha intentar");
				correct=false;
		}
		
		if(correct) {
			System.out.println(num1+" "+symbol+" "+num2+" = "+result);
		}
		//si el boleano es falso significa que el usuario no ha introducido el valor correcto que se pedia
		} while (!correct);

	}

}
