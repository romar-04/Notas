import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1 = 0, nota2 = 0, nota3 = 0;
        boolean salir = false;

        while (salir == false) {
            System.out.println("______MENU_____");
            System.out.println("1. Digitar Nota 1");
            System.out.println("2. Digitar Nota 2");
            System.out.println("3. Digitar Nota 3");
            System.out.println("4. Calcular Nota Final");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese Nota 1: ");
                nota1 = scanner.nextDouble();
            } else if (opcion == 2) {
                System.out.print("Ingrese Nota 2: ");
                nota2 = scanner.nextDouble();
            } else if (opcion == 3) {
                System.out.print("Ingrese Nota 3: ");
                nota3 = scanner.nextDouble();
            } else if (opcion == 4) {
                double notaFinal = (nota1 + nota2 + nota3) / 3;
                System.out.printf("La nota final es: %.2f\n", notaFinal);
            } else if (opcion == 5) {
                salir = true;
                System.out.println("Hasta luego");
            } else {
                System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
