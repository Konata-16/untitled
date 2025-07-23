package practice.chpter4;

public class Practice2 {
    public static void main(String[] args) {
        int[] moneyList = {121902, 8302, 55100};

        System.out.println("for文での出力:");
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(moneyList[i]);
        }
        System.out.println("\n拡張for文での出力:");
        for (int money : moneyList) {
            System.out.println(money);
        }
    }
}
