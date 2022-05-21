package operaciones;

public class Calculadora {
    /**
     * método para obtener la suma de dos números
     * @param x argumento para asignar un valor para la operación
     * @param y argumento para asignar un valor para la operación
     * @return devuelve el resultado de la operación suma
     */
    public double suma(double x, double y) {
        return x + y;
    }

    /**
     * método para obtener la resta de dos números
     * @param x argumento para asignar un valor para la operación
     * @param y argumento para asignar un valor para la operación
     * @return  devuelve el resultado de la operación resta
     */
    public double resta(double x, double y) {
        return x - y;
    }

    /**
     * método para obtener la multiplicación de dos números
     * @param x argumento para asignar un valor para la operación
     * @param y argumento para asignar un valor para la operación
     * @return  devuelve el resultado de la operación multipliación
     */
    public double multiplicacion(double x, double y) {
        return x * y;

    }

    /**
     * método para obtener la división de dos números
     * @param x argumento para asignar un valor para la operación
     * @param y argumento para asignar un valor para la operación
     * @return  devuelve el resultado de la operación división
     */
    public double division(double x, double y) {
        if (y != 0) {
            return x / y;
        } else
            return -1;
    }

    /**
     * método para obtener el módulo de un número
     * @param x argumento para asignar un valor para la operación
     * @param y argumento para asignar un valor para la operación
     * @return  devuelve el resultado de la operación módulo
     */
    public double modulo(double x, double y){
        return x%y;
    }
}
