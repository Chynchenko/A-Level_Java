public class Main {
    public static void main(String[] args) {
        //Task 1
        String f = "Hello world!";
        char first = f.charAt(0);
        System.out.println(first);
        char last = f.charAt(f.length() - 1);
        System.out.println(last);

        //Task 2
        String str1 = "Java Exercises";
        String str2 = "Java Exercise";
        System.out.println(str1.endsWith("se"));
        System.out.println(str2.endsWith("se"));

        //Task 3
        String a1 = "Stephen Edwin King";
        System.out.println(a1.contains("Walter Winchel"));
        System.out.println(a1.contains("Edwin"));

        //Task 4
        String a = "Stephen Edwin King";
        String b = "Walter Winchell";
        String c = "stephen edwin king";
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.equalsIgnoreCase(c));

        //Task 5
        String d = "Red is favorite color";
        String e = "Orange is also my favorite color";
        String t = "Red";
        boolean result1 = d.regionMatches(0,t,0,3);
        System.out.println(result1);
        boolean result2 = e.regionMatches(0,t,0,3);
        System.out.println(result2);
    }
}

