/*
La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
Por ejemplo, el resultado podría ser algo así:
La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882
 */

import java.util.Scanner;
public class DetalleFactura {
    public static void main(String[] args) {
        System.out.println("Ingrese el nombre de la factura: ");
        Scanner sc = new Scanner(System.in);
        String nombreFactura = sc.nextLine();

        System.out.println("Ingrese el primer valor: ");
        Scanner v1 = new Scanner(System.in);
        double valor1 = v1.nextDouble();

        System.out.println("Ingrese el segundo valor: ");
        Scanner v2 = new Scanner(System.in);
        double valor2 = v2.nextDouble();

        double suma = valor1 + valor2;
        double impuesto = suma * 0.19;
        double conImp = impuesto + suma;
        System.out.println("La factura " + nombreFactura +
                        " tiene un total bruto de " + suma +
                        ", con un impuesto de " + impuesto +
                        " y el monto despues del impuesto es de: " + conImp);
    }
}
