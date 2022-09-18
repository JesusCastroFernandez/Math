package math;

import static java.lang.Math.*;

/**
 *
 * @author JESUS
 */
public class Math {
    // Accesibilidad, Visibilidad, Mutabilidad, Tipo, Nombre, Valor
    private static final double E= 0.1;
    private static final double PI = 3.14159265358979323846;
    public static  int a= 1;
    public static long b= 2;
    public static double c = 3;
    public static float d = 4;
    public static  int e= 5;
    public static long f= 6;
    public static double g = 7;
    public static float h = 8;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
         
         System.out.println("Clase de Matemáticas.");
         System.out.println("-------------------------------");
         System.out.println();
        
         System.out.println("Modificador y Tipo.");
         System.out.println("-------------------------");
        
         System.out.println(E);
        
         System.out.println(PI);
         System.out.println();
         
         System.out.println("Resumén del Método: Todos los Métodos.");
         System.out.println("------------------------------");
         System.out.println();
         
         System.out.println(abs(a));// Devuelve el valor absoluto de un valor.int
         System.out.println(abs(1.0));
                 
         System.out.println(abs(b));// Devuelve el valor absoluto de un valor.long
    
         System.out.println(abs(c));// Devuelve el valor absoluto de un valor.double
        
         System.out.println(abs(d));// Devuelve el valor absoluto de un valor.float
         
         System.out.println(acos(c));// Devuelve el coseno de arco de un valor; el ángulo devuelto está en el rango de 0.0 a través de pi.
          
         System.out.println(addExact(a, e));// Devuelve la suma de sus argumentos, arrojando una excepción si el resultado desborda un archivo .int
         
         System.out.println(addExact(b, f));// Devuelve la suma de sus argumentos, arrojando una excepción si el resultado desborda un archivo .long
         
         System.out.println(asin(c));// Devuelve el seno de arco de un valor; el ángulo devuelto está en el rango -pi/2 a pi/2.
         
         System.out.println(atan(c));// Devuelve la tangente de arco de un valor; el ángulo devuelto está en el rango -pi/2 a pi/2.
          
         System.out.println(atan2(c, g));// Devuelve el ángulo theta de la conversión de coordenadas rectangulares (, ) a coordenadas polares (r, theta).xy
                 
         System.out.println(cbrt(c));// Devuelve la raíz cúbica de un valor.double
        
         System.out.println(ceil(c));// Devuelve el valor más pequeño (más cercano al infinito negativo) que es mayor o igual que el argumento y es igual a un entero matemático.double
          
         System.out.println(copySign(c, g));// Devuelve el primer argumento de coma flotante con el signo del segundo argumento de coma flotante.
          
         System.out.println(copySign(d, h));// Devuelve el primer argumento de coma flotante con el signo del segundo argumento de coma flotante.
         
         System.out.println(cos(c));// Devuelve el coseno trigonométrico de un ángulo.
          
         System.out.println(cosh(c));// Devuelve el coseno hiperbólico de un valor.double
         
         System.out.println(decrementExact(a));// Devuelve el argumento disminuido por uno, lo que genera una excepción si el resultado desborda un archivo .int
         
         System.out.println(decrementExact(b));// Devuelve el argumento disminuido por uno, lo que arroja una excepción si el resultado desborda un archivo .long
         
         System.out.println(exp(c));// Devuelve el número de Euler e elevado a la potencia de un valor.double
          
         System.out.println(expm1(c));// Devuelve ex -1.
          
         System.out.println(floor(c));// Devuelve el valor mayor (más cercano al infinito positivo) que es menor o igual que el argumento y es igual a un entero matemático.double
         
         System.out.println(floorDiv(a, e));// Devuelve el valor mayor (más cercano al infinito positivo) que es menor o igual que el cociente algebraico.int
         
         System.out.println(floorDiv(b, f));// Devuelve el valor mayor (más cercano al infinito positivo) que es menor o igual que el cociente algebraico.long
          
         System.out.println(floorMod(a, e));// Devuelve el módulo de piso de los argumentos.int
         
         System.out.println(floorMod(b, f));// Devuelve el módulo de piso de los argumentos.long
         
         System.out.println(getExponent(c));// Devuelve el exponente imparcial utilizado en la representación de un archivo .double
         
         System.out.println(getExponent(d));// Devuelve el exponente imparcial utilizado en la representación de un archivo .float
         
         System.out.println(hypot(b, f));// Devuelve sqrt(x2 +y2) sin desbordamiento intermedio o desbordamiento.
         
         System.out.println(IEEEremainder(b, f));// Calcula la operación restante en dos argumentos según lo prescrito por el estándar IEEE 754.
          
         System.out.println(incrementExact(a));// Devuelve el argumento incrementado por uno, lo que genera una excepción si el resultado desborda un archivo .int
         
         System.out.println(incrementExact(b));// Devuelve el argumento incrementado por uno, produciendo una excepción si el resultado desborda un archivo .long
         
         System.out.println(log(c));// Devuelve el logaritmo natural (base e) de un valor.double
         
         System.out.println(log10(c));// Devuelve el logaritmo base 10 de un valor.double
         
         System.out.println(log1p(c));// Devuelve el logaritmo natural de la suma del argumento y 1.
         
         System.out.println(max(g, c));// Devuelve el mayor de dos valores.double
         
         System.out.println(max(h, d));// Devuelve el mayor de dos valores.float
         
         System.out.println(max(e, a));// Devuelve el mayor de dos valores.int
          
         System.out.println(max(f, b));// Devuelve el mayor de dos valores.long
          
         System.out.println(min(g, c));// Devuelve el menor de dos valores.double
         
         System.out.println(min(h, d));// Devuelve el menor de dos valores.float
         
         System.out.println(min(e, a));// Devuelve el menor de dos valores.int
          
         System.out.println(min(f, b));// Devuelve el menor de dos valores.long
         
         System.out.println(multiplyExact(e, a));// Devuelve el producto de los argumentos, arrojando una excepción si el resultado desborda un archivo .int
         
         System.out.println(multiplyExact(f, b));// Devuelve el producto de los argumentos, arrojando una excepción si el resultado desborda un archivo .long
         
         System.out.println(negateExact(a));// Devuelve la negación del argumento, arrojando una excepción si el resultado desborda un archivo .int
          
         System.out.println(negateExact(b));// Devuelve la negación del argumento, arrojando una excepción si el resultado desborda un archivo .long
         
         System.out.println(nextAfter(g, c));// Devuelve el número de coma flotante adyacente al primer argumento en la dirección del segundo argumento.
         
         System.out.println(nextAfter(h, d));// Devuelve el número de coma flotante adyacente al primer argumento en la dirección del segundo argumento.
         
         System.out.println(nextDown(g));// Devuelve el menor de dos valores.double
         
         System.out.println(nextDown(h));// Devuelve el menor de dos valores.float
         
         System.out.println(nextUp(g));// Devuelve el menor de dos valores.double
         
         System.out.println(nextUp(h));// Devuelve el menor de dos valores.float
         
         System.out.println(pow(g, c));// Devuelve el valor del primer argumento generado a la potencia del segundo argumento.
         
         System.out.println(random());// Devuelve un valor con un signo positivo, mayor o igual que y menor que .double0.01.0
         
         System.out.println(rint(g));// Devuelve el valor que tiene un valor más cercano al argumento y es igual a un entero matemático.double
         
         System.out.println(round(g));// Devuelve el más cercano al argumento, con lazos redondeados al infinito positivo.long
         
         System.out.println(round(h));// Devuelve el más cercano al argumento, con lazos redondeados al infinito positivo.int
         
         System.out.println(scalb(g, a));// Devuelve × 2scaleFactor redondeado como si lo realizara un único multiplicador de coma flotante correctamente redondeado a un miembro del conjunto de valores dobles.d
         
         System.out.println(scalb(h, a));// Devuelve × 2scaleFactor redondeado como si lo realizara un único multiplicador de coma flotante correctamente redondeado a un miembro del conjunto de valores flotantes.f
         
         System.out.println(signum(g));// Devuelve la función signum del argumento; cero si el argumento es cero, 1.0 si el argumento es mayor que cero, -1.0 si el argumento es menor que cero.
         
         System.out.println(signum(h));// Devuelve la función signum del argumento; cero si el argumento es cero, 1.0f si el argumento es mayor que cero, -1.0f si el argumento es menor que cero.
         
         System.out.println(sin(g));// Devuelve el seno trigonométrico de un ángulo.
          
         System.out.println(sinh(g));// Devuelve el seno hiperbólico de un valor.double
           
         System.out.println(sqrt(g));// Devuelve la raíz cuadrada positiva redondeada correctamente de un valor.double
         
         System.out.println(subtractExact(e, a));// Devuelve la diferencia de los argumentos, arrojando una excepción si el resultado desborda un archivo .int
         
         System.out.println(subtractExact(f, b));// Devuelve la diferencia de los argumentos, produciendo una excepción si el resultado desborda un archivo .long
         
         System.out.println(tan(g));// Devuelve la tangente trigonométrica de un ángulo.
          
         System.out.println(tanh(g));// Devuelve la tangente hiperbólica de un valor.double
         
         System.out.println(toDegrees(g));// Convierte un ángulo medido en radianes en un ángulo aproximadamente equivalente medido en grados.
          
         System.out.println(toIntExact(e));// Devuelve el valor del argumento; generar una excepción si el valor desborda un archivo .longint
         
         System.out.println(toRadians(g));// Convierte un ángulo medido en grados en un ángulo aproximadamente equivalente medido en radianes.
         
         System.out.println(ulp(g));// Devuelve el tamaño de un ulp del argumento.
         
         System.out.println(ulp(h));// Devuelve el tamaño de un ulp del argumento.         
          
    }    
}
