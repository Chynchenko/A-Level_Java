public class Main {
    public static void main(String[] args) {

        //Task 1
        String a = "Stephen Edwin King";
        String b = "Walter Winchell";
        String c = "stephen edwin king";
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.equalsIgnoreCase(c));

        //Task 2
        String d = "Red is favorite color";
        String e = "Orange is also my favorite color";
        String t = "Red";
        boolean result1 = d.regionMatches(0,t,0,3);
        System.out.println(result1);
        boolean result2 = e.regionMatches(0,t,0,3);
        System.out.println(result2);
    }
}

