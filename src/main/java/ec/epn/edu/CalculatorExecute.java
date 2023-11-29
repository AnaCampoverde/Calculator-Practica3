package ec.epn.edu;
public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("Calculator Execute");

        Calculator c =  new Calculator();
        double suma = c.sumar(25.0,6.0);
        System.out.println("c.sumar(25.0,6.0) = "+suma);

        double resta = c.restar(38.0,13.0);
        System.out.println("c.restar(38.0,13.0) = "+resta);

        System.out.println("Segundo cambio");
        double multiplicacion = c.multiplicar(12.0,5.0);
        System.out.println("cc.multiplicar(12.0,5.0) = "+multiplicacion);

        double division = c.dividir(125.0,25.0);
        System.out.println("c.dividir(125.0,25.0) = "+division);
    }
}
