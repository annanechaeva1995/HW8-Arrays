import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1-3");

        //задание1
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        double[] b = {1.57, 7.654, 9.986};

        int[] c = {89, 66, 58, 24};

        //задание2
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i < b.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i < c.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //задание3
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 4");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i]  += 1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}