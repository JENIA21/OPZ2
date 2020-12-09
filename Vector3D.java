import java.util.Arrays;
import java.util.Scanner;

public class Vector3D {

    private static final Scanner scan = new Scanner(System.in);

    public static int[] addition3D(int[] vector3D){

        int[] vector3D2 = new int[3];

        System.out.println("Введите координаты вектора");

        vector3D2[0] = Integer.parseInt(scan.nextLine());
        vector3D2[1] = Integer.parseInt(scan.nextLine());
        vector3D2[2] = Integer.parseInt(scan.nextLine());

        vector3D[0] = vector3D[0] + vector3D2[0];
        vector3D[1] = vector3D[1] + vector3D2[1];
        vector3D[2] = vector3D[2] + vector3D2[2];

        return vector3D;
    }

    public static int[] subtraction3D(int[] vector3D){
        int[] vector3D2 = new int[3];

        System.out.println("Введите координаты вектора");

        vector3D2[0] = Integer.parseInt(scan.nextLine());
        vector3D2[1] = Integer.parseInt(scan.nextLine());
        vector3D2[2] = Integer.parseInt(scan.nextLine());

        vector3D[0] = vector3D[0] - vector3D2[0];
        vector3D[1] = vector3D[1] - vector3D2[1];
        vector3D[2] = vector3D[2] - vector3D2[2];

        return vector3D;

    }

    public static int[] scalar_product3D(int[] vector3D){
        int[] vector3D2 = new int[3];

        System.out.println("Введите координаты вектора");

        vector3D2[0] = Integer.parseInt(scan.nextLine());
        vector3D2[1] = Integer.parseInt(scan.nextLine());
        vector3D2[2] = Integer.parseInt(scan.nextLine());

        vector3D[0] = vector3D[0] * vector3D2[0];
        vector3D[1] = vector3D[1] * vector3D2[1];
        vector3D[2] = vector3D[2] * vector3D2[2];

        return vector3D;

    }

    public static boolean comparison_by_coordinates3D(int[] vector3D){

        int[] vector3D2 = new int[3];

        System.out.println("Введите координаты вектора");

        vector3D2[0] = Integer.parseInt(scan.nextLine());
        vector3D2[1] = Integer.parseInt(scan.nextLine());
        vector3D2[2] = Integer.parseInt(scan.nextLine());

        boolean answer = Arrays.equals(vector3D2,vector3D);

        return answer;

    }

    public static String string_representation3D(int[] vector3D){

        String line = Arrays.toString(vector3D);

        return line;
    }
}
