package practise;

public class ThreeNumbers {
    static int addThreeNumbers (int a, int b, int c) {
        return a + b + c;
    }

    static float addThreeNumbers (float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int intValue1 = Integer.parseInt(args[0]);
        int intValue2 = Integer.parseInt(args[1]);
        int intValue3 = Integer.parseInt(args[2]);
        int res = addThreeNumbers(intValue1, intValue2, intValue3);

        System.out.println(res);
    }
}
