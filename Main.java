import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Здравствуйте, введите размерность вашего ввектора.");
        int the_size = Integer.parseInt(scan.nextLine());

        if (the_size == 3) {
            System.out.println("Введите координаты вектора");

            int[] vector3D = new int[3];

            vector3D[0] = Integer.parseInt(scan.nextLine());
            vector3D[1] = Integer.parseInt(scan.nextLine());
            vector3D[2] = Integer.parseInt(scan.nextLine());

            System.out.println("есть 5 методов с трехмерным вектором, введите цифру метода: " + "\n" + "1 - сложение векторов" + "\n" + "2 - вычитание векторов" + "\n" + "3 - скалярное произведение векторов" + "\n" + "4 - сравнение векторов по координатам" + "\n" + "5 - строковое представление векторов");

            int mated = Integer.parseInt(scan.nextLine());
            if (mated == 1) {
                System.out.println(Arrays.toString(Vector3D.addition3D(vector3D)));
            } else if (mated == 2) {
                System.out.println(Arrays.toString(Vector3D.subtraction3D(vector3D)));
            } else if (mated == 3) {
                System.out.println(Arrays.toString(Vector3D.scalar_product3D(vector3D)));
            } else if (mated == 4) {
                if (Vector3D.comparison_by_coordinates3D(vector3D) == true){
                    System.out.println("векторы равны");
                } else {
                    System.out.println("векторы не равны");
                }
            } else if (mated == 5) {
                System.out.println(Vector3D.string_representation3D(vector3D));
            }

        } else if (the_size == 5) {
            System.out.println("Введите координаты вектора");

            int[] vector5D = new int[5];

            vector5D[0] = Integer.parseInt(scan.nextLine());
            vector5D[1] = Integer.parseInt(scan.nextLine());
            vector5D[2] = Integer.parseInt(scan.nextLine());
            vector5D[3] = Integer.parseInt(scan.nextLine());
            vector5D[4] = Integer.parseInt(scan.nextLine());

            System.out.println("есть 5 методов с пятимерным вектором, введите цифру метода: " + "\n" + "1 - сложение векторов" + "\n" + "2 - вычитание векторов" + "\n" + "3 - скалярное произведение векторов" + "\n" + "4 - сравнение векторов по координатам" + "\n" + "5 - строковое представление векторов");

            int mated = Integer.parseInt(scan.nextLine());
            if (mated == 1) {
                System.out.println(Arrays.toString(Vector5D.addition5D(vector5D)));
            } else if (mated == 2) {
                System.out.println(Arrays.toString(Vector5D.subtraction5D(vector5D)));
            } else if (mated == 3) {
                System.out.println(Arrays.toString(Vector5D.scalar_product3D(vector5D)));
            } else if (mated == 4) {
                if (Vector5D.comparison_by_coordinates3D(vector5D) == true){
                    System.out.println("векторы равны");
                } else {
                    System.out.println("векторы не равны");
                }
            } else if (mated == 5) {
                System.out.println(Vector5D.string_representation3D(vector5D));
            }


        } else {

            System.out.println("Введите координаты вектора");

            int[] vectorND = new int[the_size];

            for (int i = 0; i < the_size; i++) {

                vectorND[i] = Integer.parseInt(scan.nextLine());
            }

            System.out.println("есть 5 методов с N-ым вектором, введите цифру метода: " + "\n" + "1 - сложение векторов" + "\n" + "2 - вычитание векторов" + "\n" + "3 - скалярное произведение векторов" + "\n" + "4 - сравнение векторов по координатам" + "\n" + "5 - строковое представление векторов");

            int mated = Integer.parseInt(scan.nextLine());
            if (mated == 1) {
                System.out.println(Arrays.toString(VectorND.additionND(vectorND, the_size)));
            } else if (mated == 2) {
                System.out.println(Arrays.toString(VectorND.subtractionND(vectorND, the_size)));
            } else if (mated == 3) {
                System.out.println(Arrays.toString(VectorND.scalar_productND(vectorND, the_size)));
            } else if (mated == 4) {
                if (VectorND.comparison_by_coordinatesND(vectorND, the_size) == true){
                    System.out.println("векторы равны");
                } else {
                    System.out.println("векторы не равны");
                }
            } else if (mated == 5) {
                System.out.println(VectorND.string_representationND(vectorND));
            }
        }
    }
}
