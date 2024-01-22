import java.util.Scanner;

public class A2SistemaEstanqueGasolina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int capacidad0 = 0;
        int capacidad1 = 20;
        int capacidad2 = 35;
        int capacidad3 = 40;
        int capacidad4 = 60;
        int capacidad5 = 70;

        System.out.println("Ingrese la medida actual en litros: ");
        double medida = scanner.nextDouble();

        String mensaje = medida >= capacidad0 && medida < capacidad1 ? "Insuficiente" :
                medida >= capacidad1 && medida < capacidad2 ? "Suficiente" :
                        medida >= capacidad2 && medida < capacidad3 ? "Medio Estanque" :
                                medida >= capacidad3 && medida < capacidad4 ? "Estanque 3/4" :
                                        medida >= capacidad4 && medida < capacidad5 ? "Estanque casi lleno" :
                                                medida == capacidad5 ? "Estanque lleno" : "Ingrese un valor válido";

        System.out.println(mensaje);
    }
}
