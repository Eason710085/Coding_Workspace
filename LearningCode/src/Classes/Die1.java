package Classes;
import java.util.Random;
public class Die1 {
    /**
     * The face value of this die
     */
    private int faceValue;


    /**
     * The number of die objects that have been made
     */
    private static int count = 0;

    /**
     * Constructs this die with a default face value of 1.
     */

    /**
     * A random face value.
     */
    private int randomFaceValue;

    public Die1(){
        this.faceValue = 1;
        count++;
    }

    /**
     * Constructs this die with a specific face value.
     * @param faceValue A face value of this die
     */
    public Die1(int faceValue){
        this.faceValue = faceValue;
        count++;
    }


    /**
     * Changes the face value of this die.
     * @param faceValue A face value of a die
     */
    public void setFaceValue(int faceValue){
        this.faceValue = faceValue;
    }


    /**
     * Returns the face value of this die.
     * @return Face value of this die
     */
    public int getFaceValue(){
        return this.faceValue;
    }

    /**
     * Returns the number of die objects.
     * @return The number of die objects
     */
    public static int getCount(){
        return count;
    }

    /**
     * Changes the face value of this die to be a random value
     * from 1 to 6.
     */
    public void roll(){
        Random generator = new Random();
        //int randomFaceValue;// needed locally in this method only.
        //Change this face value to be a random value from 1 to 6.
        // - get a random value from 1 to 6
        randomFaceValue = generator.nextInt(6) + 1;
        // - change this face value to the random value
        this.faceValue = randomFaceValue;
    }

    /**
     * Returns a string representation of this die.
     *  - The type of this object
     *  - instance variables
     * @return A string representation of this die
     */
    public String toString(){
        //- The type of this object
        //- instance variables
        return this.getClass().getSimpleName() + "\tFace value: " + this.faceValue;
    }


    /**
     * Indicates if this die is equals to some other object.
     * This die is equal to some other object if the other object is
     * a die  and has the same face value.
     * @param obj A reference to some other object
     * @return A boolean value specifying if this die is equal to
     *         some other object
     */
    public boolean equals(Object obj){
        //If obj references an object that is not a Die object.
        if(!(obj instanceof Die1)){
            return false;
        }
        //If obj references a Die object.
        Die1 other = (Die1)obj;
        return this.faceValue == other.faceValue;

    }

}
