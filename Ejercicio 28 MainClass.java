import java.util.Scanner;
/** ... */
public class MainClass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Crea vector1 leyendo sus elementos
        double[] vector1 = Internal.loadDoubleArray(input); 

        // Crea vector2 leyendo sus elementos
        double[] vector2 = Internal.loadDoubleArray(input);

        System.out.print("Elementos a sumar: ");
        int n = input.nextInt();
        double[] vector3 = Excercise.sum(vector1, vector2, n);
        System.out.print("La suma es: ");
        Internal.showDoubleArray(vector3);
    }
}