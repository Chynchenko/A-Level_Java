import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1
        int[]array = new int[12];
        for (int i = 0; i< array.length; i++){
            array[i] = ((int)(Math.random()*31)-15);
            System.out.println(array[i]);
        }
        int max = array[0];
        int indexOfMax = 0;
        for(int i = 0; i<array.length; i++) {
            int arr = array[i];
            if (max < arr) {
                max = arr;
                indexOfMax = i;
            }
        }
            System.out.println(indexOfMax);

        //Task 2
        int[]array1 = new int[8];
        for (int j = 0; j< array1.length; j++){
            array1[j] = (1+(int)(Math.random()*9));
            System.out.print(array1[j]);
        }
        System.out.println();
        for (int j=0;j<array1.length;j++){
            if(j%2==1){
                array1[j]=0;
            }
            System.out.println(Arrays.toString(array1));
        }

        //Task 3
        int[]array2 = new int[4];
        for (int i = 0; i< array2.length; i++) {
            array2[i] = (10 + (int) (Math.random() * 90));
            System.out.println(Arrays.toString(array2));
        }
        boolean increase = true;
        for (int i = 1; i<array2.length;i++){
            if(array2[i]<=array2[i-1]){
                increase = false;
                break;
            }
        }
        if(increase){
            System.out.println("Array increase");
        }
        else {
            System.out.println("Array decrease");
        }

        //Task 4
        int [] arr1 = new int[5];
        int [] arr2 = new int[5];
        for (int i=0;i<5;i++){
            arr1[i] = (int)(Math.random()*6);
            arr2[i] = (int)(Math.random()*6);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        double aver1 = 0;
        double aver2 = 0;

        for (int i=0;i<5;i++){
            aver1 += arr1[i];
            aver2 += arr2[i];
        }
        aver1/=5;
        aver2/=5;

        if (aver1 > aver2){
            System.out.println("Average of the first array is bigger");
        }
        else{
            System.out.println("Average of the second array is bigger");
        }



    }
        }
