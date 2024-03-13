public class Main {
    public static void main(String[] args) {
        //task 1 and 2
        System.out.println("Задача 1 и 2");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int index = 0; index < a.length; index++) {
            if (index != a.length - 1) {
                System.out.print(a[index] + ", ");
            } else {
                System.out.println(a[index]);
            }
        }
        double[] b = {1.57, 7.654, 9.986};
        for (int index = 0; index < b.length; index++) {
            if (index != b.length - 1) {
                System.out.print(b[index] + ", ");
            } else {
                System.out.println(b[index]);
            }
        }
        char[] symbol = {1128, 421, 5471};
        for (int index = 0; index < symbol.length; index++) {
            if (index != symbol.length - 1) {
                System.out.print(symbol[index] + ", ");
            } else {
                System.out.println(symbol[index]);
            }
        }
        //task 3
        System.out.println("Задача 3");
        int[] c = new int[3];
        c[0] = 1;
        c[1] = 2;
        c[2] = 3;
        for (int index = 2; index >= 0; index--) {
            if (index != 0) {
                System.out.print(c[index] + ", ");
            } else {
                System.out.println(c[index]);
            }
        }
        double[] d = {1.57, 7.654, 9.986};
        for (int index = 2; index >= 0; index--) {
            if (index != 0) {
                System.out.print(d[index] + ", ");
            } else {
                System.out.println(d[index]);
            }
        }
        char[] newSymbol = {1128, 421, 5471};
        for (int index = 2; index >= 0; index--) {
            if (index != 0) {
                System.out.print(newSymbol[index] + ", ");
            } else {
                System.out.println(newSymbol[index]);
            }
        }
        //task 4
        System.out.println("" + "Задача 4");
        for (int index = 0; index < a.length; index++) {
            if (a[index] % 2 != 0) {
                a[index] = a[index] + 1;
            }
            System.out.print(a[index] + " ");
        }
    }
}