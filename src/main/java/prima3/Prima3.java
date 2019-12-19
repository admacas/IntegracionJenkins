package prima3;

/**
 * 
 * @author alex
 *
 */

public class Prima3 {
		public Prima3() {};
		/***
		 * Permite verificar si una persona es apta para reduccion de pago de PRIMA 
		 * @param puntos puntos de la licencia
		 * @param puntosQuePuedePerder, cantidad de puntos que puede perder
		 * @return boolean
		 */
		 public static boolean isAptoParaReduccion(final int puntos, final int puntosQuePuedePerder){
			 final int calcular=30 - puntosQuePuedePerder;
			 final boolean pase1=calcular <= puntos;
			 final boolean pase2=puntos < 30;
			 final boolean resultado=pase1 && pase2;
			 return  resultado;
		 }
		 /***
		  * Permite identificar el factor de edad para el calculo de PRIMA
		  * @param edad del usuario
		  * @return float
		  */
		 public static double getFactorEdad(final int edad){       
		   final double v;//value
		   if     ( 18 <= edad && edad < 25 ) { v = 2.8;}
		   else if( 25 <= edad && edad < 35 ) {v = 1.8;}
		   else if( 35 <= edad && edad < 45 ) {v = 1.0;}
		   else if( 45 <= edad && edad < 65 ) {v = 0.8;}
		   else if( 65 <= edad && edad <= 90) {v = 1.5;}
		   else                               {v = -1;}//when wrong input
		   return v;
		 }
		 /***
		  * Permite identificar el numero minimo para perder puntos a partir de la edad
		  * @param edad del ususario
		  * @return int
		  */
		 public static int getPuntosQuePuedePerder(final int edad){       
		   final int v;//value
		   if     ( 18 <= edad && edad < 25 ) { v = 1;}
		   else if( 25 <= edad && edad < 35 ) {v = 3;}
		   else if( 35 <= edad && edad < 45 ) {v = 5;}
		   else if( 45 <= edad && edad < 65 ) {v = 7;}
		   else if( 65 <= edad && edad <=90 ) {v = 5;}
		   else                               {v =-1;}//when wrong input
		   return v;
		 }
		 /***
		  * Retorna el valor de reduccion en el calculo de PRIMA
		  * @param edad del usuario
		  * @return int
		  */
		 public static int getReduccion(int edad){       
		   int v;//value
		   if     ( 18 <= edad && edad < 25 ) v = 50;
		   else if( 25 <= edad && edad < 35 ) v = 50;
		   else if( 35 <= edad && edad < 45 ) v = 100;
		   else if( 45 <= edad && edad < 65 ) v = 150;
		   else if( 65 <= edad && edad < 90 ) v = 200;
		   else                               v =-1;//when wrong input
		   return v;
		 }
		 
		 /***
		  * Calcula el valor de la PRIMA
		  * @param tarifaBásica del valor de la PRIMA
		  * @param factorEdad, numero segun la edad
		  * @param reduccionConductorSeguro, puntos minimos que puede perder
		  * @return valor de PRIMA
		  */
		 public static double getValorPrima(final int tarifaBásica,final double factorEdad,final int reduccionConductorSeguro){
		   return tarifaBásica * factorEdad - reduccionConductorSeguro;
		 }
}




