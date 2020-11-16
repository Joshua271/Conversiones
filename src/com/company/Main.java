package com.company;

import java.util.Scanner;

public class Main {

    //funcion principal
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int opt;
        do {
            menu(); //menu principal
            opt = getInt(rd); //eleccion en el menu principal


            if (opt == 1) {
                System.out.print("Ingresa unidad de masa (kg/lb): ");
                texto(rd);
                String unidad = texto(rd);

                if (unidad.equals("kg") || unidad.equals("lb")) {
                System.out.print("Ingresa cantidad: ");
                double cantidad = getDouble(rd);

                conversionMasa(unidad, cantidad); //llamada a la funcion conversionMasa
                double resultado = conversionMasa(unidad, cantidad);


                if (unidad.equals("kg")) {
                System.out.println("Resultado: " + cantidad + " " + unidad + " = " + resultado + " lb");
                } else {
                    System.out.println("Resultado: " + cantidad + " " + unidad + " = " + resultado + " kg");
                }

                } else {
                    System.out.println("opcion invalida");
                }

                } else if (opt == 2) {
                System.out.print("Ingresa unidad de velocidad (km/mi): ");
                texto(rd);
                String unidad = texto(rd);


                if (unidad.equals("km") || unidad.equals("mi")) {
                    System.out.print("Ingresa cantidad: ");
                    double cantidad = getDouble(rd);

                    conversionVelocidad(unidad, cantidad); //llamada a la funcion conversionVelocidad
                    double resultado = conversionVelocidad(unidad, cantidad);

                    if (unidad.equals("km")) {
                        System.out.println("Resultado: " + cantidad + " " + unidad + " = " + resultado + " mi");
                    } else {
                        System.out.println("Resultado: " + cantidad + " " + unidad + " = " + resultado + " km");
                    }
                } else {
                    System.out.println("opcion no valida");
                }
            } else if(opt!=3) {
                System.out.println("Opcion incorrecta");
            }

        }while(opt!=3);

        System.out.println("Adios!");
    }

    //funcion de conversion de masa
    public static double conversionMasa(String unid, double cant) {
        double result1 = 0;
        if (unid.equals("kg")) {
            result1 = (float) (cant * 2.2);
        } else if (unid.equals("lb")) {
            result1 = (float) (cant / 2.2);
        }
        return result1;
    }

    //funcion de conversion de velocidad
    public static double conversionVelocidad(String unid, double cant) {
        double result2 = 0;

        if (unid.equals("km")) {
            result2 = (float) (cant / 1.6);
        } else if (unid.equals("mi")) {
            result2 = (float) (cant * 1.6);
        }
        return result2;
    }

    //funcion de menu principal
    public static void menu() {
        System.out.println("--------------------");
        System.out.println("Conversiones");
        System.out.println("--------------------");
        System.out.println("1. Conversion de masa");
        System.out.println("2. Conversion de velocidad");
        System.out.println("3. Salir");
        System.out.print("\nElija una opcion:  ");
    }

    //funcion de lectura de un double
    public static double getDouble(Scanner ent) {
        return ent.nextDouble();
    }

    //funcion de lectura de un int
    public static int getInt(Scanner ent) {
        return ent.nextInt();
    }

    //funcion de lectura de un String
    public static String texto(Scanner ent) {
        return ent.nextLine();
    }
}
