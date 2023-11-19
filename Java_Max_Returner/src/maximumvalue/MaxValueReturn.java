package maximumvalue;

public class MaxValueReturn {
    public static int max(int val1, int val2, int val3) {
        if (val1 >= val2 && val1 >= val3) {
            return val1;
        } else if (val2 >= val1 && val2 >= val3) {
            return val2;
        } else {
            return val3;
        }
    }

    public static void main(String[] args) {
        int n = max(700, 500, 500);
        System.out.println("Maximum value: " + n);
    }
}