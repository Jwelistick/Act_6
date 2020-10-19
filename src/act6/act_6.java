package act6;
import java.util.*;

public class act_6 {
    public static void main(String[] args) {
        //Variables y scanners
        Scanner sc = new Scanner(System.in);
        Scanner alumn =  new Scanner(System.in);
        int cali;
        int[] resp = new int[5];
        int prom = 0;
        String resu = "F";

        //Introducción
        System.out.println("Programa de promedio y calificación de alumnos\n" +
                "Escribe el nombre: ");
        String alumno = alumn.nextLine();

        //Calificación array
        System.out.println("Escribe cuántas calificaciones introducirás: ");
        cali = sc.nextInt();
        for (int i = 0; i < cali; i++) {
            System.out.println("Calificación " + (i+1));
            resp[i] = sc.nextInt();
            prom = prom+resp[i];
        }

        //Resultado final
        System.out.println("Nombre del estudiante: "+ alumno);
        for (int i = 1; i == cali; i++) {
            System.out.println("Calificación "+i+"= "+resp[i]);
        }
        System.out.println("Promedio ="+(prom/cali));
        if (prom >= 51 && prom <= 60){
            resu = "E";
        }else if (prom >= 61 && prom <= 70){
            resu = "D";
        }else if (prom >= 71 && prom <= 80){
            resu = "C";
        }else if (prom >= 81 && prom <= 90) {
            resu = "B";
        }else if (prom >= 91 && prom < 100){
            resu = "A";
        }
        System.out.println("Calificación ="+resu);
    }
}
