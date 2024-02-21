/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_asignatura;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA1_6_ASIGNATURA {

    public static void main(String[] args) {
        //DECLARAR VARIABLES Y JUNTARLOS
        String clave, nombre, carrera;
        boolean tipoMateria;
        int creditos, horasTeoricas, horasPracticas;
        //DECLARAR EL SCANNER
        Scanner cap = new Scanner(System.in);
        //PREGUNTAR Y INTRODUCIR LA RESPUESTAS
        System.out.println("¿Cual es la clave de la materia?");
        clave = cap.nextLine();
        System.out.println("¿Cual es el nombre de la materia?");
        nombre = cap.nextLine();
        System.out.println("¿Cual es la carrera?");
        carrera = cap.nextLine();
        System.out.println("¿Es materia genetica?");
        tipoMateria = cap.nextBoolean();
        System.out.println("¿Cuantos creditos tiene?");
        creditos = cap.nextInt();
        System.out.println("¿cuantas horas de teoria tiene?");
        horasTeoricas = cap.nextInt();
        System.out.println("¿Cuantas horas de practica tiene?");
        horasPracticas = cap.nextInt();
        //IMPRIMIR LOS RESULTADOS GUARDADOS
        System.out.println("Tu clave de materia es: "+clave);
        System.out.println("El nombre de la materia es: "+nombre);
        System.out.println("Tu carrera es: "+carrera);
        System.out.println("Tu materia es generica: "+tipoMateria);
        System.out.println("Tus creditos de la materia es: "+creditos);
        System.out.println("Las horas de teoria tiene: "+horasTeoricas);
        System.out.println("Las horas de practica tiene: "+horasPracticas);
    }
}