package Task2;

public class Main {
    public static void main(String[] args) {
        String str = "четыре, пять";
        int c = str.indexOf("ч");
        int d = str.lastIndexOf("т");
        System.out.println(str.substring(c, d + 1));
    }
}
