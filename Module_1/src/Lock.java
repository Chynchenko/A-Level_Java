import java.util.Arrays;

public class Lock {
    private final int[] myArray;

    public Lock(int[] myArray) {
        this.myArray = myArray;
    }

    public int[] getArray() {
        if (myArray == null) {
            return null;
        } else {
            return myArray.clone();
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(myArray));
    }

}
