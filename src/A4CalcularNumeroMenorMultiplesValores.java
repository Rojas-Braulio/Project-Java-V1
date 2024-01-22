import java.util.Scanner;

public class A4CalcularNumeroMenorMultiplesValores {
    public static void main(String[] args) {

        int numeroMenor = 0;
        int numeroMayor = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a comparar");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++){
            System.out.println("Ingrese su número: " + (i+1));
            numeroMenor = scanner.nextInt();
            if (numeroMayor < numeroMenor){
                numeroMenor = numeroMayor;
            }
        }

        if (numeroMenor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }
    }
}
