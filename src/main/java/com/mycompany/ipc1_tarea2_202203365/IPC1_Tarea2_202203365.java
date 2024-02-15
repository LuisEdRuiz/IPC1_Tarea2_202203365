/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ipc1_tarea2_202203365;

/**
 *
 * @author luisr
 */
import java.util.Scanner;

public class IPC1_Tarea2_202203365 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean inicio =true;
        
        while (inicio == true){
        
        System.out.println("-----Calculadora Basica-----");
       
        System.out.println("---Que operacion desea realizar?--- \n");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir \n");
        int menu = scanner.nextInt();
        
         switch (menu){
            case 1:
                System.out.println("Ingrese el primer numero");
                double n1 = scanner.nextDouble();
                System.out.println("ingrese el segundo numero");
                double n2 = scanner.nextDouble();
                double suma = n1+n2;
                System.out.println("La suma de numero1 + numero2 es: "+suma);
                break;
            case 2:
                System.out.println("Ingrese el primer numero");
                double n3 = scanner.nextDouble();
                System.out.println("ingrese el segundo numero");
                double n4 = scanner.nextDouble();
                double resta = n3-n4;
                System.out.println("La resta de numero1 - numero2: "+resta);
                break;
            case 3:
                System.out.println("Ingrese el primer numero");
                double n5 = scanner.nextDouble();
                System.out.println("ingrese el segundo numero");
                double n6 = scanner.nextDouble();
                double multi = n5*n6;
                System.out.println("La multiplicaion de numero1*numero2 es: "+multi);
                break;
            case 4:
                System.out.println("Ingrese el primer numero");
                double n7 = scanner.nextDouble();
                System.out.println("ingrese el segundo numero");
                double n8 = scanner.nextDouble();
                if( n8 != 0){
                    double division = n7/n8;
                    System.out.println("La division de numero1/numero2 es: "+division);
                }else {
                    System.out.println("La division no esta definida");
                }
                break;
            case 5:
                inicio = false;
                break;
            default:
                System.out.println("Opcion no valida");
       
        }
        
       }
       
    }
}
