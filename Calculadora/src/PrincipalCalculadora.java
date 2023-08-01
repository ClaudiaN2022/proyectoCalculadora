import javax.swing.*;

public class PrincipalCalculadora {

    public static double sumar(double numero1, double numero2) {

        double resultado;

        resultado = numero1 + numero2;

        return resultado;


    }

    public static double restar(double numero1, double numero2) {

        double resultado;

        resultado = numero1 - numero2;

        return resultado;


    }

    public static double multiplicar(double numero1, double numero2) {

        double resultado;

        resultado = numero1 * numero2;

        return resultado;


    }

    public static double dividir(double numero1, double numero2) {

        double resultado=0;

        if (numero2 != 0)

            resultado = numero1 / numero2;

        else
            System.out.println(("Errror en el párametro no se puede dividir por cero"));



        return resultado;


    }

    public static void main(String[] args) {

        double numero1, numero2,resultado;

        String snumero1, snumero2, operacion;


        snumero1 = JOptionPane.showInputDialog("Ingrese el primer numero ");
        snumero2 = JOptionPane.showInputDialog("Ingrese el segundo numero ");

        numero1 = Double.parseDouble(snumero1);
        numero2 = Double.parseDouble(snumero2);

        operacion = JOptionPane.showInputDialog("************************\nElige opción:\n1.- Suma" +

                "\n2.- Resta\n" + "3.- Producto\n" + "4.- Division\n" + "0.- Salir\n************************");


        switch (operacion) {

            case  "1":  {

                resultado = sumar(numero1,numero2);
            System.out.println("El resultado de la suma es "+resultado);
            break;}

            case  "2":  {

                resultado = restar(numero1,numero2);
                System.out.println("El resultado de la resta es "+resultado);
                break;}

            case  "3":  {

                resultado = multiplicar(numero1,numero2);
                System.out.println("El resultado de la multiplicación es "+resultado);
                break;}

            case  "4":  {

                resultado = dividir(numero1,numero2);
                System.out.println("El resultado de la división es "+resultado);
                break;}

            case  "0":  {



                break;}

        }
        }
        }





