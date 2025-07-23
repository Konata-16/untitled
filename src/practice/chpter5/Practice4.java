package practice.chpter5;

public class Practice4 {
    public static void main(String[] args) {
        double bottom = 10.0;
        double height = 5.0;
        double redius = 5.0;
        double area = calcTriangleAlea(bottom, height);
        System.out.println("三角形の底辺の長さが" + bottom + "cm、" + "高さが" + height + "cmの場合、面積は" + area + "平方cm");
        area = calcCircleArea(redius);
        System.out.println("円の面積は"+area+"平方cm");
    }

    public static double calcTriangleAlea(double bottom, double height) {

        return bottom * height / 2;

    }

    public static double calcCircleArea(double redius) {
        return redius * redius*3.14;
    }
}
