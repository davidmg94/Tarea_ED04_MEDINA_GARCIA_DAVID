package cuentas.clientes;

import java.util.Scanner;    

public class Main {

    public static void main(String[] args) {
        Cuenta cuenta1;
        double saldoActual;

        cuenta1 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
        System.out.println("El saldo actual es:"+ cuenta1.estado() );

        operativa_cuenta(cuenta1, 0);
    }
    
    public static double pedirCantidad(String mensaje){
        Scanner teclado = new Scanner(System.in);
        double num;
        System.out.println(mensaje);
        num = teclado.nextDouble();
        return num;
    }       
    
    private static void operativa_cuenta(Cuenta cuenta1, float cantidad) {
        try {
            System.out.println("Retirada de cuenta");
            double num = pedirCantidad("Introduce cantidad a retirar:");
            cuenta1.retirar(num);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            double num = pedirCantidad("Introduce cantidad a ingresar:");
            cuenta1.ingresar(num);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
