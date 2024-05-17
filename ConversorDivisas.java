import java.util.Scanner;

public class ConversorDivisas {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
	String moneda="", otraMoneda="";
	double dolar=4000;
	
	     
	System.out.println("***************************************");
	System.out.println("* BIENVENIDO AL CORVERSOR DE MONEDAS  *");
	System.out.println("*                                     *");
	System.out.println("* Seleccione la moneda de su país     *");
	System.out.println("*                                     *");
	System.out.println("* 1. Pesos Colombianos                *");
	System.out.println("* 2. Pesos Mexicanos                  *");
	System.out.println("* 3. Euros                            *");
	System.out.println("* 4. Dolares                          *");
	System.out.println("* 5. Salir                            *");
        System.out.println("***************************************");
	
        int parametro = lectura.nextInt();

	switch(parametro){
	   case 1:moneda="Pesos Colombianos";
		System.out.println("Moneda seleccionada es: "+ moneda);
		break;
   	   case 2:moneda="Pesos Mexicanos";
		System.out.println("Moneda seleccionada es: "+ moneda);
		break;
	   case 3:moneda="Euros";
		System.out.println("Moneda seleccionada es: "+ moneda);
		break;
	   case 4:moneda="Dolares";
		System.out.println("Su opción seleccionada es: "+ moneda);
		break;
	   case 5:moneda="Salir";
		System.out.println("Su opción seleccionada es: "+ moneda);
		break;
	default: System.out.println("Error, la opción no existe");
	break;
  	}

	System.out.println("***************************************");
	System.out.println("*                                     *");
	System.out.println("* Seleccione la moneda del cambio     *");
	System.out.println("*                                     *");
	System.out.println("* 1. Pesos Colombiano                 *");
	System.out.println("* 2. Pesos Mexicano                   *");
	System.out.println("* 3. Euros                            *");
	System.out.println("* 4. Dolares                          *");
	System.out.println("* 5. Salir                            *");
	System.out.println("***************************************");

	int opcion = lectura.nextInt();
	
	switch(opcion){
	   case 1:otraMoneda="Pesos Colombianos";
		System.out.println("Moneda seleccionada es: "+ otraMoneda);
		break;
   	   case 2:otraMoneda="Pesos Mexicanos";
		System.out.println("Moneda seleccionada es: "+ otraMoneda);
		break;
	   case 3:otraMoneda="Euros";
		System.out.println("Moneda seleccionada es: "+ otraMoneda);
		break;
	   case 4:otraMoneda="Dolares";
		System.out.println("Su opción seleccionada es: "+ otraMoneda);
		break;
	   case 5:otraMoneda="Salir";
		System.out.println("Su opción seleccionada es: "+ otraMoneda);
		break;
	default: System.out.println("Error, la opción no existe");
	break;
  	}
	
	System.out.println("¿Cuál es la cantidad a convertir? : ");
        double cantidad = lectura.nextDouble();

	double resultado=(cantidad*dolar);
	System.out.println( cantidad+" " + moneda +" son: "+resultado +" "+ otraMoneda);
	
	double resultado2=(cantidad/dolar);
	System.out.println( cantidad+" " + moneda +" son: "+resultado2 +" "+ otraMoneda);

 }
}