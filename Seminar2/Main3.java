package Seminar2;

/*
 Обработайте возможные исключительные ситуации.
 "Битые" значения в исходном массиве считайте нулями.
 Можно внести в код правки, которые считаете необходимыми.
 */
public class Main3 {

    public static int ex2(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String item = arr[i][j];
                if (item.matches("[0-9]+")) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String[][] arr = new String[][] {{"1","a","3"},{"0","o","4"}};
        System.out.println(ex2(arr));
    }

    private static boolean checkText(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) < '0' || text.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
