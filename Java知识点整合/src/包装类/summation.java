package 包装类;

public class summation {
    public static void main(String[] args) {
        String str [] = {"1","2","42","423"};
        int sum  = 0;
        for (int i = 0; i <str.length ; i++) {
           int myInt = Integer.parseInt(str[i]);
           sum = sum+myInt;
        }
        System.out.println(sum);
    }
}
