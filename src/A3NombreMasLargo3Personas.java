import javax.swing.*;

public class A3NombreMasLargo3Personas {
    public static void main(String[] args) {

        int sumaNombre1 = 0; int sumaNombre2 = 0; int sumaNombre3 = 0;

        String nombre1 = JOptionPane.showInputDialog("Ingrese primer nombre completo:");
        String nombre2 = JOptionPane.showInputDialog("Ingrese el segundo nombre completo:");
        String nombre3 = JOptionPane.showInputDialog("Ingrese el tercer nombre completo:");

        String[] nombre1Split = nombre1.split(" ");
        String[] nombre2Split = nombre2.split(" ");
        String[] nombre3Split = nombre3.split(" ");

        for (int j = 0; j < nombre1Split.length; j++){
            sumaNombre1 += nombre1Split[j].length();
        }

        for (int j = 0; j < nombre2Split.length; j++){
            sumaNombre2 += nombre2Split[j].length();
        }

        for (int j = 0; j < nombre3Split.length; j++){
            sumaNombre3 += nombre3Split[j].length();
        }

        if (sumaNombre1 > sumaNombre2 && sumaNombre1 > sumaNombre3){
            System.out.println(nombre1 + " tiene el nombre más largo.");
        } else if (sumaNombre2 > sumaNombre1 && sumaNombre2 > sumaNombre3) {
            System.out.println(nombre2 + " tiene el nombre más largo.");
        } else {
            System.out.println(nombre3 + " tiene el nombre más largo.");
        }

    }
}