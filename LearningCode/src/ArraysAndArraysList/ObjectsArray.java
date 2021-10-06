package ArraysAndArraysList;

import java.util.ArrayList;
public class ObjectsArray {

    public static void main(String[] args){
        ArrayList<Integer> values = new ArrayList<Integer>(); //LINE A
        System.out.println(values.get(4));
        values.add(1);
        values.add(2);
        values.add(34);
        values.add(new Integer(56));
        values.add(new Integer(7));
    }

    //LINE B
    public static double misteryMethod(ArrayList<Integer> misteryParameter){
        double misteryResult = 0.0;
        for(int i = 0; i < misteryParameter.size(); i++){
            misteryResult = misteryResult + misteryParameter.get(i); }
        misteryResult = misteryResult / misteryParameter.size(); return misteryResult;
    } }