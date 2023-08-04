package Seminar1;

import java.util.Arrays;

public class Answer {
    public int[] divArrays(int[] a, int[] b) {
        if (a.length == b.length) {
            int size = a.length;
            int[] c = new int[size];
            for (int i = 0; i < c.length; i++) {
                if (b[i] == 0) {
                    throw new RuntimeException("Divide by zero");
                }
                c[i] = a[i] / b[i];
            }
            return c;
        }
        int[] c = new int[1];
        return c;
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[] { 12, 8, 16 };
            b = new int[] { 4, 2, 2 };
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}
