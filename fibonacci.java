import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        long numero1 = 0;
        long numero2 = 1;
        long suma;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese limite");
        int limite = scanner.nextInt();
        for (int i = 1; i <= limite; i++) {
            System.out.println(numero1 + " ");
            suma = numero1 + numero2;
            numero1 = numero2;
            numero2 = suma;
        }
    }
}