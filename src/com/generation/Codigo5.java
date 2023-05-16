package com.generation;

import java.util.Scanner;

public class Codigo5 {
	
		// Se agrega un metodo main
		public static void main(String[] args) {
		// Se importa Scanner y se agregar System in
		Scanner in = new Scanner(System.in);
		// Se cambia comillas a dobles, se agrega ln a print
	    System.out.println("Introduzca un número: ");
	    // se cambia el valor a int de ni
	    int numero = in.nextInt();
	    
	    int afortunado = 0;
	    int noAfortunado = 0;
	    
	    while (numero > 0) {
	    	// Se elimina (int) porque no es necesario convertir el dato
		  int digito = (numero % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
	    	  afortunado++;
	      } else {
	    	  noAfortunado++;
			// se elimina ni /= 10
	    } // else

	    if (afortunado > noAfortunado) {
	    	// Se agrega una t al print y se cambia c por ni
	      System.out.println("El " + numero + " es un número afortunado.");
	    } else {
	    	// Se cambia c por ni 
	      System.out.println("El " + numero + " no es un número afortunado.");
	    } // else
	    // Se agrega break para que no corra infinito
	    break;
	  } // while
	    in.close();
	} // main 
} // class Codigo5