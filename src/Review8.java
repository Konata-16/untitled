public class Review8 {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        a = (int) b;
        a = (int) 10000L;
        b = (double) 10000L;
        b = (int) a;

        float f = 5.94f;
        short s = 10;
}
}
