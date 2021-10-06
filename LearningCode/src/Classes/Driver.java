package Classes;
/**
 * test the design of Die
 * @author wanshunjie
 *
 */
public class Driver {

    public static void main(String[] args) {
        //default face value 1
        Die1 firstDie = new Die1();
        //System,out.println(firstDie);
        Die1 secondDie = new Die1();
        int firstDieFaceValue;
        String str = new String ("hello");

        //firstDie.setFaceValue(6)
        firstDieFaceValue = firstDie.getFaceValue();

        //roll the die
        firstDie.roll();
        firstDieFaceValue = firstDie.getFaceValue();

        firstDie.setFaceValue(3);

        System.out.println(firstDie);
        System.out.println(secondDie.toString());
        //System.out.println(firstDie.toString());
        System.out.println(firstDieFaceValue);
        System.out.println(firstDie.equals(secondDie));
        System.out.println(firstDie.equals(str));

    }

}