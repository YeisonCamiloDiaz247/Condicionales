package co.edu.sena.Miscelanea;

public class Ejercicios {

    public double areaTriangulo(double d1, double d2){
        return (d1 * d2) /2;

    }

    public double Suma(double d1, double d2){
        return (d1 + d2);
    }

    public double elevacionNumero(double d1, double d2){
        return Math.pow(d1, d2);
    }

    public double Conversion(double d1, double d2){
        return (d1 * d2);
    }

    public double areaCuadrado(double d1){
        return (d1 * d1);
    }

    public double perimetroCuadrado(double d1){
        return (d1 * 4);
    }

    public double areaCilindro(double d1, double d2){
        return  2 *Math.PI * d1 * (d1 + d2);
    }

    public double volumenCilindro(double d1, double d2){
        return  Math.PI * Math.pow (d1, 2) * d2;
    }
    
    public double longitudCircunferencia(double d1){
        return  2 * Math.PI * d1;
    }

    public double areaCircunferencia(double d1){
        return  Math.PI * Math.pow(d1, 2);
    }

    public double Promedio(double d1, double d2, double d3){
        return  (d1 + d2 + d3) /3;
    }
    
    public String Numeros(double d1){  
    if (d1 >0) {
        return("El número es positivo");
    } 
    else if (d1==0){
        return("El número es neutro"); 
    }
    else {
        return("El número es negativo");
    }
    }

    public String Mayor(double d1, double d2){
        if (d1 > d2){
            return("El primer número: " +d1+ " es mayor, el segundo número: " +d2+ " es menor");
        }
        else if (d2 > d1){
            return("El segundo número: " +d2+ " es mayor, el primer número: " +d1+ " es menor");
        }
        else {
            return("Ambos números son iguales");
        }
    }

    public String Menor(double d1, double d2, double d3){
        if(d1 <=0 || d2 <=0 || d3 <=0)
        {
            return("Campo invalido");
        }
        else if(d1>d2 && d2>d3){
            return("El número mayor es: " +d1+ " y el número menor es: " +d3);
        }
        else if(d1>d3 && d3>d2){
            return("El número mayor es: " +d1+ " y el número menor es: " +d2);
        }
        else if(d2>d3 && d3>d1){
            return("El número mayor es: " +d2+ " y el número menor es: " +d1);
        }
        else if(d2>d1 && d1>d3){
            return("El número mayor es: " +d2+ " y el número menor es: " +d3);
        }
        else if(d3>d2 && d2>d1){
            return("El número mayor es: " +d3+ " y el número menor es: " +d1);
        }
        else if(d3>d1 && d1>d2){
            return("El número mayor es: " +d3+ " y el número menor es: " +d2);
        }
        else 
        {
            return("Todos los números son iguales");
        }
        
    }
    
    public String Mat(double d1, double d2, double d3){
        if (d1<d2) {
            d3 = d1 + d2;
            return("El número A era menor al número B, así que se suman: "+d3);
        }
        else if (d1 == d2) {
            return("Ambos números son iguales");
        }
        else {
            d3 = d1 - d2;
            return("El número B era menor al número A, así que se restan: "+d3);
        }
    }

    public String cociente(double d1, double d2, double d3){
        if (d1==0 || d2==0) {
            return("No es posible dividir entre cero");
        }
        else {
            d3 = d1/d2;
            return("El cociente de la division es: " +d3);
        }
    }

    public String negativo(double d1, double d2, double d3){
        if (d1 < 0 || d2 < 0) {
            d3 = d1 + d2;
            return("Como un número es negativo, los numeros se suman " +d3);
        }
        else {
            d3 = d1 * d2;
            return("Como ningun número es negativo, los numeros se multiplican: " +d3);
        }
    }

    public String year(double d1){
        if (d1 % 4 == 0){
            return("El año es biciesto");
        }
        else {
            return("El año no es biciesto");
        }
    }
        



    
    

}
