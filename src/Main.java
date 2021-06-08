import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * @author JOAQUIN
 *
 */
public class Main {
/**
 * En el main se encuentra el switch para elegir que met�do ejecutar.
 * @param args
 */
	public static void main (String [] args) {
		while(true) {
    		int opcion = menu();
    		switch (opcion) {
			case 1:
				Suma();
				break;
			case 2:
				Resta();
				break;
			case 3:
				Multiplicaci�n();
				break;
			case 4:
				Divisi�n();
				break;
			case 5:
				Potencia();
				break;
			case 6:
				Resto();
				break;
			case 7:
				Seno();
				break;
			case 8:
				Coseno();
				break;
			case 9:
				Tangente();
				break;
			case 10:
				Logaritmos();
				break;
			default:
				break;
			}
    	
		}
	}
		/**
		 * Este metodo muestra las opciones del men� cuando se llama en el main, y llama al m�todo leeropcion. Este se repite hasta poner una
		 * opci�n v�lida
		 * @return opcion Devuelve la opci�n elegida
		 */
		private static int menu() {
	    	int opcion=0;
	    	
	    	do {
	    		System.out.println("Opciones:");
	    		System.out.println("1. Suma");
	    		System.out.println("2. Resta");
	    		System.out.println("3. Multiplicaci�n");
	    		System.out.println("4. Divisi�n");
	    		System.out.println("5. Potencia");
	    		System.out.println("6. Calculo de resto");
	    		System.out.println("7. Seno");
	    		System.out.println("8. Coseno");
	    		System.out.println("9. Tangente");
	    		System.out.println("10. Logaritmos");
	    		System.out.println("Introduce la opcion:");
	    	
	    		opcion = leerOpcion(10);
	    		
	    	}while(opcion <=0);
	    	
	    	return opcion;
	    }
		/**
		 * Este m�todo lee la opcion que se pasa por teclado cuando se le pide en el m�todo menu y si la opcion es incorrecta salta un error
		 * @param max
		 * @return opcion Devuelve la opci�n elegida
		 */
		 private static int leerOpcion(double max) {
		    	int opcion = -1;
		    	try {
		    		Scanner teclado = new Scanner(System.in);
		    		opcion=teclado.nextInt();
		    		if(opcion>max)
		    			opcion=-1;
		    	}catch (InputMismatchException e) {
					System.out.println("Opci�n incorrecta");
				}
		    	
		    	return opcion;
		 }
		 
		 
		 /**
		  * Realiza una suma de dos parametros que se piden por teclado, y muestra el resultado. Esto lo hace cuando se le llama en el men� y 
		  * y tiene contralado que solo se le pasen n�meros.
		  */
		 private static void Suma() {
			 try {
		    	double result = 0;
		    	double num1 = 0;
		    	double num2 = 0;
		    	Scanner teclado = new Scanner(System.in);
		    	System.out.println("Introduce un sumando");
	    		num1=teclado.nextInt();
	    		System.out.println("Introduce otro sumando");
	    		num2=teclado.nextInt();
		    	result = num1 + num2;
		   
		    	System.out.println("---------------------------------");
		    	System.out.println("El resultado de la suma es:");
		    	System.out.println(result);
		    	System.out.println("---------------------------------\n");
			 }catch(InputMismatchException ime) {
				 System.out.println("Solo se admiten n�meros");
			 }
		 }
		 
		 /**
		  * Realiza una Resta de dos parametros que se piden por teclado, y muestra el resultado. Esto lo hace cuando se le llama en el men� y 
		  * y tiene contralado que solo se le pasen n�meros.
		  */
		 private static void Resta() {
			 try {
		    	double result = 0;
		    	double num1 = 0;
		    	double num2 = 0;
		    	Scanner teclado = new Scanner(System.in);
		    	System.out.println("Introduce un minuendo");
	    		num1=teclado.nextInt();
	    		System.out.println("Introduce un substrayendo");
	    		num2=teclado.nextInt();
		    	result = num1 - num2;
		   
		    	System.out.println("---------------------------------");
		    	System.out.println("El resultado de la resta es:");
		    	System.out.println(result);
		    	System.out.println("---------------------------------\n");
			 }catch(InputMismatchException ime) {
				 System.out.println("Solo se admiten n�meros");
			 }
		 }
		 
		 /**
		  * Realiza una multiplicaci�n de dos parametros que se piden por teclado, y muestra el resultado. Esto lo hace cuando se le llama en el men� y 
		  * y tiene contralado que solo se le pasen n�meros.
		  */
		 private static void Multiplicaci�n() {
			 try{
		    	double result = 0;
		    	double num1 = 0;
		    	double num2 = 0;
		    	Scanner teclado = new Scanner(System.in);
		    	System.out.println("Introduce un multiplicando");
	    		num1=teclado.nextInt();
	    		System.out.println("Introduce un multiplicador");
	    		num2=teclado.nextInt();
		    	result = num1 * num2;
		   
		    	System.out.println("---------------------------------");
		    	System.out.println("El resultado de la multiplicaci�n es:");
		    	System.out.println(result);
		    	System.out.println("---------------------------------\n");
		 	}catch(InputMismatchException ime) {
			 System.out.println("Solo se admiten n�meros");
		 	}
		 }
		 
		 /**
		  * Realiza una divisi�n de dos parametros que se piden por teclado, y muestra el resultado. Esto lo hace cuando se le llama en el men� y 
		  * y tiene contralado que solo se le pasen n�meros.
		  */
		 private static void Divisi�n() {
			 try {
		    	double result = 0;
		    	double num1 = 0;
		    	double num2 = 0;
		    	Scanner teclado = new Scanner(System.in);
		    	System.out.println("Introduce un dividendo");
	    		num1=teclado.nextInt();
	    		System.out.println("Introduce un divisor");
	    		num2=teclado.nextInt();
		    	result = num1 / num2;
		   
		    	System.out.println("---------------------------------");
		    	System.out.println("El resultado de la divisi�n es:");
		    	System.out.println(result);
		    	System.out.println("---------------------------------\n");
			 }catch(InputMismatchException ime) {
				 System.out.println("Solo se admiten n�meros");
			 }
		 }
		 
		 /**
		  * Realiza una potencia de dos parametros que se piden por teclado, y muestra el resultado. Esto lo hace cuando se le llama en el men� y 
		  * y tiene contralado que solo se le pasen n�meros.
		  */
		 private static void Potencia() {	
			try {	 	
			 	double result = 0;
			   	double num1 = 0;
			   	double num2 = 0;
			   	Scanner teclado = new Scanner(System.in);
			   	System.out.println("Introduce una base");
		    	num1=teclado.nextInt();
		    	System.out.println("Introduce un exponente");
		    	num2=teclado.nextInt();
			   	result = (double)Math.pow(num1, num2);
			   
			   	System.out.println("---------------------------------");
			    System.out.println("El resultado de la potencia es:");
			    System.out.println(result);
			    System.out.println("---------------------------------\n");
			 }catch(InputMismatchException ime) {
				 System.out.println("Solo se admiten n�meros");
			 }
		 }
		 
		 
		 /**
		  * Realiza una resto de dos parametros que se piden por teclado, y muestra el resultado. Esto lo hace cuando se le llama en el men� y 
		  * y tiene contralado que solo se le pasen n�meros.
		  */
		 private static void Resto() {
		    try {
		    	double result = 0;
		    	double num1 = 0;
		    	double num2 = 0;
		    	Scanner teclado = new Scanner(System.in);
		    	System.out.println("Introduce un dividendo");
	    		num1=teclado.nextInt();
	    		System.out.println("Introduce un divisor");
	    		num2=teclado.nextInt();
		    	result = num1 % num2;
		   
		    	System.out.println("---------------------------------");
		    	System.out.println("El resto de estos dos n�mero es:");
		    	System.out.println(result);
		    	System.out.println("---------------------------------\n");
		    }catch(InputMismatchException ime) {
				 System.out.println("Solo se admiten n�meros");
			}
		 }
		 
		 /**
		  * Calcula el seno del parametros que se piden por teclado, y muestra el resultado. Esto lo hace cuando se le llama en el men� y 
		  * y tiene contralado que solo se le pasen n�meros.
		  */
		 private static void Seno() {
			 try {
			 	double result = 0;
		    	double num1 = 0;
		    	Scanner teclado = new Scanner(System.in);
		    	System.out.println("Introduce un n�mero");
	    		num1=teclado.nextInt();
		    	result = Math.sin(num1);
		   
		    	System.out.println("---------------------------------");
		    	System.out.println("El seno de "+num1+" es:");
		    	System.out.println(result);
		    	System.out.println("---------------------------------\n");
			 }catch(InputMismatchException ime) {
				 System.out.println("Solo se admiten n�meros");
			 }
		 }
		 
		 /**
		  * Calcula el coseno del parametros que se piden por teclado, y muestra el resultado. Esto lo hace cuando se le llama en el men� y 
		  * y tiene contralado que solo se le pasen n�meros.
		  */
		 private static void Coseno() {
			 try {
			 	double result = 0;
		    	double num1 = 0;
		    	Scanner teclado = new Scanner(System.in);
		    	System.out.println("Introduce un n�mero");
	    		num1=teclado.nextInt();
		    	result = Math.cos(num1);
		   
		    	System.out.println("---------------------------------");
		    	System.out.println("El coseno de "+num1+" es:");
		    	System.out.println(result);
		    	System.out.println("---------------------------------\n");
			 }catch(InputMismatchException ime) {
				 System.out.println("Solo se admiten n�meros");
			 }
		 }
		 
		 /**
		  * Calcula el tangente del parametros que se piden por teclado, y muestra el resultado. Esto lo hace cuando se le llama en el men� y 
		  * y tiene contralado que solo se le pasen n�meros.
		  */
		 private static void Tangente() {
			 try {
			 	double result = 0;
		    	double num1 = 0;
		    	Scanner teclado = new Scanner(System.in);
		    	System.out.println("Introduce un n�mero");
	    		num1=teclado.nextInt();
		    	result = Math.tan(num1);
		   
		    	System.out.println("---------------------------------");
		    	System.out.println("El tangente de "+num1+" es:");
		    	System.out.println(result);
		    	System.out.println("---------------------------------\n");
			 }catch(InputMismatchException ime) {
				 System.out.println("Solo se admiten n�meros");
			 }
		 }
		 
		 /**
		  * Calcula el logaritmos del parametros que se piden por teclado, y muestra el resultado. Esto lo hace cuando se le llama en el men� y 
		  * y tiene contralado que solo se le pasen n�meros.
		  */
		 private static void Logaritmos() {
			 try {
			 	double result = 0;
		    	double num1 = 0;
		    	Scanner teclado = new Scanner(System.in);
		    	System.out.println("Introduce un n�mero");
	    		num1=teclado.nextInt();
		    	result = Math.log(num1);
		   
		    	System.out.println("---------------------------------");
		    	System.out.println("El resultado del logaritmos del "+num1+" es:");
		    	System.out.println(result);
		    	System.out.println("---------------------------------\n");
			 }catch(InputMismatchException ime) {
				 System.out.println("Solo se admiten n�meros");
			 }
		 }
		 
		 
		 
		 
}
