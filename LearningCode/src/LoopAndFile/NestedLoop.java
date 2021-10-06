package LoopAndFile;

public class NestedLoop {
    public static void main(String[] args) {
        int count1, count2;
        count1 = 0;
        while (count1 < 10){
            count2 = 0;
            while (count2 < 22){
                System.out.println("草你妈");
                count2++;
            }
            count1++;
        }
    }
}