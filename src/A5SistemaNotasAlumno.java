import java.util.Scanner;

public class A5SistemaNotasAlumno {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notas = 0, notas5 = 0, notas4 = 0, notas1 = 0, contador5 = 0, contador4 = 0, promedioNotas4 = 0, promedioNotas5 = 0, promedioTotal = 0;

        for (int i = 0; i < 20; i++){
            System.out.println("Ingrese nota " + (i + 1) + " del 1 al 7: ");
            notas = scanner.nextInt();
            if (notas < 1.0 || notas > 7.0){
                System.out.println("ERROR: DEBE SER DEL 1 AL 7");
                break;
            } else if (notas > 5.0 && notas < 7.0) {
                notas5 += notas;
                contador5 += 1;

            } else {
                notas4 += notas;
                contador4 += 1;
            }
            notas1 = notas == 1 ? notas1 + 1: notas1;
        }

        promedioNotas5 = notas5 / contador5;
        promedioNotas4 = notas4 / contador4;
        promedioTotal = (notas5 + notas4) / (contador5 + contador4);

    System.out.println("Promedio de notas mayores a 5: " + promedioNotas5);
    System.out.println("Promedio de notas mayores a 4: " + promedioNotas4);
    System.out.println("La cantidad de notas 1 es: " + notas1);

    System.out.println("El promedio Total es: " + promedioTotal);
    }
}
