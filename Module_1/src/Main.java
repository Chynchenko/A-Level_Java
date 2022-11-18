import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write the length of array from 10 to 100");
        int x = in.nextInt();
        if (x < 10) {
            System.out.print("The length of array must be >= 10");
        } else {
            System.out.printf("The length of array is %d \n", x);
        }
        int[] myArray = new int[x];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = ((int) (Math.random() * 201) - 100);
        }
        System.out.println(Arrays.toString(myArray));

        System.out.print("Write 1 if you want choose increase ang 2 if you want choose decrease");
        int y = in.nextInt();

        if (y == 1) {
            Arrays.sort(myArray);
            System.out.println(Arrays.toString(myArray));
        }
        else if (y == 2) {
            for (int i = 0; i < myArray.length; i++) {
                for (int j = myArray.length - 1; j > i; j--) {
                    if (myArray[j] > myArray[j - 1]) {
                        int temp = myArray[j];
                        myArray[j] = myArray[j - 1];
                        myArray[j - 1] = temp;
                    }
                }
            }
                System.out.println(Arrays.toString(myArray));
                in.close();
            }
        else {
            System.out.print("Write only 1 or 2");
        }

            in.close();
        System.out.print("The array with every third element in cube: ");
            for (int i = 0; i < myArray.length; i++) {
                if ((i+1)%3==0) {
                    myArray[i] = myArray[i] * myArray[i] * myArray[i];
                }
            }
            System.out.println(Arrays.toString(myArray));


        }
    }