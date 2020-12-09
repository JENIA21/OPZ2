import java.util.Arrays;
import java.util.Scanner;

public class Vector5D {

    private static final Scanner scan = new Scanner(System.in);

    public static int[] addition5D(int[] vector5D){

        int[] vector5D2 = new int[5];

        System.out.println("Введите координаты вектора");

        vector5D2[0] = Integer.parseInt(scan.nextLine());
        vector5D2[1] = Integer.parseInt(scan.nextLine());
        vector5D2[2] = Integer.parseInt(scan.nextLine());
        vector5D2[3] = Integer.parseInt(scan.nextLine());
        vector5D2[4] = Integer.parseInt(scan.nextLine());

        vector5D[0] = vector5D[0] + vector5D2[0];
        vector5D[1] = vector5D[1] + vector5D2[1];
        vector5D[2] = vector5D[2] + vector5D2[2];
        vector5D[3] = vector5D[3] + vector5D2[3];
        vector5D[4] = vector5D[4] + vector5D2[4];

        return vector5D;
    }

    public static int[] subtraction5D(int[] vector5D){
        int[] vector5D2 = new int[5];

        System.out.println("Введите координаты вектора");

        vector5D2[0] = Integer.parseInt(scan.nextLine());
        vector5D2[1] = Integer.parseInt(scan.nextLine());
        vector5D2[2] = Integer.parseInt(scan.nextLine());
        vector5D2[3] = Integer.parseInt(scan.nextLine());
        vector5D2[4] = Integer.parseInt(scan.nextLine());

        vector5D[0] = vector5D[0] - vector5D2[0];
        vector5D[1] = vector5D[1] - vector5D2[1];
        vector5D[2] = vector5D[2] - vector5D2[2];
        vector5D[3] = vector5D[3] - vector5D2[3];
        vector5D[4] = vector5D[4] - vector5D2[4];

        return vector5D;

    }

    public static int[] scalar_product3D(int[] vector5D){
        int[] vector5D2 = new int[5];

        System.out.println("Введите координаты вектора");

        vector5D2[0] = Integer.parseInt(scan.nextLine());
        vector5D2[1] = Integer.parseInt(scan.nextLine());
        vector5D2[2] = Integer.parseInt(scan.nextLine());
        vector5D2[3] = Integer.parseInt(scan.nextLine());
        vector5D2[4] = Integer.parseInt(scan.nextLine());

        vector5D[0] = vector5D[0] * vector5D2[0];
        vector5D[1] = vector5D[1] * vector5D2[1];
        vector5D[2] = vector5D[2] * vector5D2[2];
        vector5D[3] = vector5D[3] * vector5D2[3];
        vector5D[4] = vector5D[4] * vector5D2[4];

        return vector5D;

    }

    public static boolean comparison_by_coordinates3D(int[] vector5D){

        int[] vector5D2 = new int[5];

        System.out.println("Введите координаты вектора");

        vector5D2[0] = Integer.parseInt(scan.nextLine());
        vector5D2[1] = Integer.parseInt(scan.nextLine());
        vector5D2[2] = Integer.parseInt(scan.nextLine());
        vector5D2[3] = Integer.parseInt(scan.nextLine());
        vector5D2[4] = Integer.parseInt(scan.nextLine());

        boolean answer = Arrays.equals(vector5D2,vector5D);

        return answer;

    }

    public static String string_representation3D(int[] vector5D){

        String line = Arrays.toString(vector5D);

        return line;
    }
}
