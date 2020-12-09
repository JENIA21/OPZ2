import java.util.Arrays;
import java.util.Scanner;

public class VectorND {

    private static final Scanner scan = new Scanner(System.in);

    public static int[] additionND(int[] vectorND, int the_size){
        int[] vectorND2 = new int[the_size];

        System.out.println("Введите координаты вектора");

        for (int i = 0; i < the_size; i++) {
            vectorND2[i] = Integer.parseInt(scan.nextLine());
        }

        for (int i = 0; i < the_size; i++){

            vectorND[i] = vectorND[i] + vectorND2[i];
        }

        return vectorND;
    }

    public static int[] subtractionND(int[] vectorND, int the_size){

        int[] vectorND2 = new int[the_size];

        System.out.println("Введите координаты вектора");

        for (int i = 0; i < the_size; i++) {
            vectorND2 [i] = Integer.parseInt(scan.nextLine());
        }

        for (int i = 0; i < the_size; i++){

            vectorND[i] = vectorND[i] - vectorND2[i];
        }

        return vectorND;
    }

    public static int[] scalar_productND(int[] vectorND, int the_size){

        int[] vectorND2 = new int[the_size];

        System.out.println("Введите координаты вектора");

        for (int i = 0; i < the_size; i++) {
            vectorND2[i] = Integer.parseInt(scan.nextLine());
        }

        for (int i = 0; i < the_size; i++){

            vectorND[i] = vectorND[i] * vectorND2[i];
        }

        return vectorND;
    }

    public static boolean comparison_by_coordinatesND(int[] vectorND, int the_size){
        int[] vectorND2 = new int[the_size];

        System.out.println("Введите координаты вектора");

        for (int i = 0; i < the_size; i++) {
            vectorND2[i] = Integer.parseInt(scan.nextLine());
        }

        boolean answer = Arrays.equals(vectorND,vectorND2);

        return answer;
    }

    public static String string_representationND(int[] vectorND){

        String line = Arrays.toString(vectorND);

        return line;
    }
}
