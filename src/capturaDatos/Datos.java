package capturaDatos;

import operaciones.Calculadora;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * Clase Datos
 */
public class Datos {
    /**
     * Se crean los objetos de tipo scanner para capturar por teclado
     */
    Scanner sn = new Scanner(System.in);
    Scanner valor = new Scanner(System.in);
    /**
     * Se crea un objeto de tipo Array el cual almacena los resultados
     * que se van obteniendo
     */
    ArrayList<Double> result = new ArrayList<>();
    String metodoCalcular; //Variable de tipo string donde se almacena la opción de operador que digita el usuario (+,-,*,/,%)
    Double numero1; //Variable que almacena el número con el cual se va realizando las operaciones
    Double numero2; //Variable que almacena el número con el cual se va realizando las operaciones
    Double resultado; //Variable que almacena el resultado de las operaciones realizadas
    Boolean salir = false; //Variable que finaliza el programa
    /**
     * Se instancia la clase Calculadora
     */
    Calculadora calculadora = new Calculadora();

    public void Datos(){
        /**
         * se llama el método captura
         */
        captura();
    }

    private void captura(){

        System.out.println("""
                                
                    Instrucciones de uso:
                   
                1.  Se debe digitar un número, luego presionar la tecla enter.
                2.  Se debe digitar un signo de operación: (+,-, *, /, o %), 
                    luego presionar la tecla enter.
                3.  Se debe digitar un segundo número, luego presionar la tecla
                    enter, el resultado se imprimira en pantalla.
                4.  Después de obtener el resultado podrá digitar (+,-, *, /, o %)
                    seguido de la tecla enter, para seguir
                    realizando operaciones.
                    * Si desea reiniciar el valor de calculadora, digite "RESET".
                    * Cuando decida terminar las operaciones digite "FIN".\s
                                                                                """);

        numero1 = valor.nextDouble(); //Se asigna a la variable numero1 el primer número ingresado
        while (!salir) { //se escribe y se valida la condición del ciclo mientras

            try {
                metodoCalcular = sn.next();//Se asigna a la variable metodoCalcular la opción de la operacion (+,-,*,/,%)
                switch (metodoCalcular) {
                    case "+" -> {
                        /**
                         * Se llama el método condicionSuma
                         */
                        condicionSuma();
                    }
                    case "-" -> {
                        /**
                         * Se llama el método condicionResta
                         */
                        condicionResta();
                    }
                    case "*" -> {
                        /**
                         * Se llama el método condicionMultiplicacion
                         */
                        condicionMultiplicacion();
                    }
                    case "/" -> {
                        /**
                         * Se llama el método condicionDivisión
                         */
                        condicionDivision();
                    }
                    case "%" -> {
                        /**
                         * Se llama el método condicionModulo
                         */
                        condicionModulo();
                    }
                    case "RESET" -> {
                        /**
                         * Se resetea el ArrayList que contiene el resultado
                         * de las operaciones
                         */
                        result.clear();
                        System.out.println("Valor reseteado, introduce digita un número:");
                        numero1 = valor.nextDouble();
                    }
                    case "FIN" -> {
                        /**
                         * Instrucción que finaliza el programa
                         */
                        salir = true;
                        System.out.println("Calculadora finalizada.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo se permiten números número");
                sn.next();
            }
        }
    }

    /**
     * En este metodo se pregunta si el objeto Array esta vacio,
     * se asigna a la variable numero1 el valor del elemento que está en la ultima posición
     * y posterior a esto se asigna a la variable numero2 el segundo número para realizar la operación.
     * A la variable resultado se le asigna el valor que se obtendría de la operación
     * sumar de la clase Calculadora y se agrega al ArrayList el resultado para usarlo en posteriores
     * operaciones.
     */
    private void condicionSuma(){
        if (result.size() != 0) {
            numero1 = result.get(result.size() - 1);
        }
        numero2 = valor.nextDouble();
        resultado = calculadora.suma(numero1, numero2);
        System.out.println(resultado);
        result.add(resultado);
    }

    private void condicionResta(){
        if (result.size() != 0) {
            numero1 = result.get(result.size() - 1);
        }
        numero2 = valor.nextDouble();
        resultado = calculadora.resta(numero1, numero2);
        System.out.println(resultado);
        result.add(resultado);
    }

    private void condicionMultiplicacion(){
        if (result.size() != 0) {
            numero1 = result.get(result.size() - 1);
        }
        numero2 = valor.nextDouble();
        resultado = calculadora.multiplicacion(numero1, numero2);
        System.out.println(resultado);
        result.add(resultado);
    }

    private void condicionDivision(){
        if (result.size() != 0) {
            numero1 = result.get(result.size() - 1);
        }
        numero2 = valor.nextDouble();
        if (numero2 == 0) {
            System.out.println("No se puede dividir por cero(0)");
            result.clear();
            numero1 = valor.nextDouble();
        } else {
            resultado = calculadora.division(numero1, numero2);
            System.out.println(resultado);
            result.add(resultado);
        }
    }

    private void condicionModulo(){
        if (result.size() != 0) {
            numero1 = result.get(result.size() - 1);
        }
        numero2 = valor.nextDouble();
        resultado = calculadora.modulo(numero1, numero2);
        System.out.println(resultado);
        result.add(resultado);
    }
}
