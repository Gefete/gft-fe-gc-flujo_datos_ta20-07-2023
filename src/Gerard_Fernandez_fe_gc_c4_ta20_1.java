import java.util.Random;

public class Gerard_Fernandez_fe_gc_c4_ta20_1 {

	public static void main(String[] args) {
		//Se declara un random que genera diferentes valores para comprobar el funcionamiento
		Random random = new Random();
		int num1 = random.nextInt(50);
		int num2 = random.nextInt(50);

		//Condicional para comprobar que numero es mayor o igual 
		if(num1>num2) {
			System.out.println(num1+"=(num1) Es mayor que (num2)="+num2);
		}else if(num1==num2) {
			System.out.println(num1+"=(num1) Es igual que (num2)="+num2);
		}else {
			System.out.println(num1+"=(num1) Es menor que (num2)="+num2);
		}
	}

}
