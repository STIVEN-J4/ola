/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.de.computación.pintura;

/**
 *
 * @author STIVEN
 */
import java.util.Scanner;
public class MODELODECOMPUTACIÓNPINTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner objeto=new Scanner (System.in);
           System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-LATACUNGA\n");
        System.out.println("MODELO DE COMPUTACIÓN – CASO PRÁCTICO-ROBOTS EN LA INDUSTRIA AUTOMOTRIZ-PINTURA\n");
        System.out.println("GRUPO 4\n");
        System.out.println("Integrantes:");

        System.out.println("\nADMINISTRDOR DEL NIVEL DE CAMPO:");
        String CAMPO=objeto.nextLine();

        System.out.println("\nADMINISTRADOR DEL NIVEL DE CONTROL PLC:");
        String CONTROL=objeto.nextLine();

        System.out.println("\nADMINISTRADOR DEL NIVEL DE SUPERVISION:");
        String SUPERVISON=objeto.nextLine();

        System.out.println("\nADMINISTRADOR DE NIVEL M-E-S:");
        String redneuronal=objeto.nextLine();

        System.out.println("\nADMINISTRADOR DE NIVEL E-R-P:");
        String NIVEL=objeto.nextLine();

        System.out.println("\nIMPRMIR REPORTES:");
        String REPORTES=objeto.nextLine();

    }

}
