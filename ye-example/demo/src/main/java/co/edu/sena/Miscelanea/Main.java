package co.edu.sena.Miscelanea;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
    public static void main( String[] args )
    {
    
    double dato1;
    double dato2;
    double dato3;
    double dato4;
    String dato5;

    //Menú y submenús
    System.out.println("1. Operadores");
    System.out.println("2. Condicionales");
    System.out.println("3. Ciclos");
    System.out.println("4. Arreglos");
    System.out.println("99. Salir");

    //Archivos
    Ejercicios ejercicios = new Ejercicios();
    Scanner src = new Scanner (System.in);

    //1 Operadores
    // 1.1
    System.out.println("1.1 Calcular el área del triángulo");

    System.out.println("Ingrese la base del triángulo");
    dato1 = src.nextDouble();
    System.out.println("Ingrese la altura del triángulo");
    dato2 = src.nextDouble();

    ejercicios.areaTriangulo(dato1, dato2);
    dato3 = ejercicios.areaTriangulo(dato1, dato2);
    System.out.println("El área del triángulo es:" +dato3);

    //1.2
    System.out.println("1.2 Ingresar dos números por teclado y sumarlos");

    System.out.println("Ingrese el primer número");
    dato1 = src.nextDouble();
    System.out.println("Ingrese el segundo número");
    dato2 = src.nextDouble();

    ejercicios.Suma(dato1, dato2);
    dato3 = ejercicios.Suma(dato1, dato2);
    System.out.println("La suma de los dos numeros es de:" +dato3);

    //1.3
    System.out.println("1.3 Ingresar un número y visualizar el núemro elevado al cuadrado");

    System.out.println("Ingrese el número");
    dato1 = src.nextDouble();
    dato2 = 2;

    ejercicios.elevacionNumero(dato1, dato2);
    dato3 = ejercicios.elevacionNumero(dato1, dato2);
    System.out.println("El número selecionado elevado al cuadrado es:" +dato3);

    //1.4
    System.out.println("1.4 Escribir un algortimo que convierta de euros a dolares");

    System.out.println("Ingrese los euros que desean convertir");
    dato1 = src.nextDouble();
    dato2 = 1.8;

    ejercicios.Conversion(dato1, dato2);
    dato3 = ejercicios.Conversion(dato1, dato2);
    System.out.println("Los euros convertidos a dolares tienen un valor de:" +dato3);

    //1.5
    System.out.println("1.5 Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del perímetro");

    System.out.println("Ingrese el valor numerico del lado del cuadrado");
    dato1 = src.nextDouble();

    ejercicios.areaCuadrado(dato1);
    dato2 = ejercicios.areaCuadrado(dato1);
    System.out.println("El área del cuadrado es:" +dato2);

    ejercicios.perimetroCuadrado(dato1);
    dato3 = ejercicios.perimetroCuadrado(dato1);
    System.out.println("El perímetro del cuadrado es de:" +dato3);

    //1.6
    System.out.println("1.6 Escribir un algoritmo que determine el área y el volúmen del cilindro");

    System.out.println("Ingrese el radio del cilindro");
    dato1 = src.nextDouble();
    System.out.println("Ingrese la altura del cilindro");
    dato2 = src.nextDouble();

    ejercicios.areaCilindro(dato1, dato2);
    dato3 = ejercicios.areaCilindro(dato1, dato2);
    System.out.println("El área del cilindro es:" +dato3);

    ejercicios.volumenCilindro(dato1, dato2);
    dato4 = ejercicios.volumenCilindro(dato1, dato2);
    System.out.println("El volumen del cilindro es:" +dato4);

    //1.7
    System.out.println("1.7 Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y el área (pi*r)^2 del círculo inscrito");

    System.out.println("Ingrese el radio de la circunferencia");
    dato1 = src.nextDouble();

    ejercicios.longitudCircunferencia(dato1);
    dato2 = ejercicios.longitudCircunferencia(dato1);
    System.out.println("La longitud de la circunferencia es:" +dato2);

    ejercicios.areaCircunferencia(dato1);
    dato3 = ejercicios.areaCircunferencia(dato1);
    System.out.println("El área de la circunferencia es:" +dato3);

    //1.8
    System.out.println("1.8 Calcular el promedio de tres (3) números ingresados por el teclado");

    System.out.println("Ingrese el primer número");
    dato1 = src.nextDouble();
    System.out.println("Ingrese el segundo número");
    dato2 = src.nextDouble();
    System.out.println("Ingrese el tercer número");
    dato3 = src.nextDouble();

    ejercicios.Promedio(dato1, dato2, dato3);
    dato4 = ejercicios.Promedio(dato1, dato2, dato3);
    System.out.println("El promedio de los tres números es:" +dato4);

    //2. Condicionales
    //2.1
    System.out.println("Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo.");

    System.out.println("Ingrese el número");
    dato1 = src.nextDouble();

    ejercicios.Numeros(dato1);
    dato5 = ejercicios.Numeros(dato1);
    System.out.println("" +dato5);

    //2.2
    System.out.println("Escribir un algoritmo que reciba dos números por teclado y diga cuál es el mayor y cuál el mayor y el menor.");

    System.out.println("Ingrese el primer número");
    dato1 = src.nextDouble();
    System.out.println("Ingrese el segundo número");
    dato2 = src.nextDouble();

    ejercicios.Mayor(dato1, dato2);
    dato5= ejercicios.Mayor(dato1, dato2);
    System.out.println(dato5);

    //2.3
    System.out.println("Escriba un programa que lea tres números enteros positivos y que calcule e imprima en la pantalla el menor y el mayor de ellos.");

    System.out.println("Ingrese el primer número");
    dato1 = src.nextDouble();
    System.out.println("Ingrese el segundo número");
    dato2 = src.nextDouble();
    System.out.println("Ingrese el tercer número");
    dato3 = src.nextDouble();

    ejercicios.Menor(dato1, dato2, dato3);
    dato5= ejercicios.Menor(dato1, dato2, dato3);
    System.out.println(dato5);

    //2.4
    System.out.println("Dados dos números A y B, sumarlos si A es menor que B o sino restarlos.");

    System.out.println("Ingrese el número A");
    dato1 = src.nextDouble();
    System.out.println("Ingrese el número B");
    dato2 = src.nextDouble();
    dato3 = 0;

    ejercicios.Mat(dato1, dato2, dato3);
    dato5= ejercicios.Mat(dato1, dato2, dato3);
    System.out.println(dato5);

    //2.5
    System.out.println("Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es posible.");

    System.out.println("Ingrese el número A");
    dato1 = src.nextDouble();
    System.out.println("Ingrese el número B");
    dato2 = src.nextDouble();
    dato3 = 0;

    ejercicios.cociente(dato1, dato2, dato3);
    dato5= ejercicios.cociente(dato1, dato2, dato3);
    System.out.println(dato5);

    //2.6
    System.out.println("Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplicarlos.");

    System.out.println("Ingrese el número A");
    dato1 = src.nextDouble();
    System.out.println("Ingrese el número B");
    dato2 = src.nextDouble();
    dato3 = 0;
     
    ejercicios.negativo(dato1, dato2, dato3);
    dato5=ejercicios.negativo(dato1, dato2, dato3);
    System.out.println(dato5);

    //2.7
    System.out.println("Escribir un algoritmo que determine si un año es biciesto o no");

    System.out.println("Ingrese el año");
    dato1 = src.nextDouble();

    ejercicios.year(dato1);
    dato5=ejercicios.year(dato1);
    System.out.println(dato5);
    }
}
