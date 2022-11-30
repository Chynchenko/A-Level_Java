public class Main {
    public static void main(String[] args) {

        //Task 1
        double side1 = 3;
        double side2 = 3.5;
        double side3 = 5;
        if ((side1+side2)<side3) {
            System.out.println(0);
        }
        else {
            double area = Math.sqrt(((side1 + side2 + side3) / 2) * ((side1 + side2 + side3) / 2 - side1) * ((side1 + side2 + side3) / 2 - side2) * ((side1 + side2 + side3) / 2 - side3));
            System.out.println(area);
        }

        //Task 2
        double a = Math.random();
        System.out.println(a);
        double b = Math.random();
        System.out.println(b);
        double c = Math.random();
        System.out.println(c);
        double y = a < b?(a < c ? a : c):(b < c ? b:c);
        System.out.println(y);

        //Task 3
        double x = Math.random();
        System.out.println(x);
        if (x%2 == 0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
        }
    }

