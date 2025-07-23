package practice.chapter4;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        int[] moneyList = {3, 4, 9};

        System.out.print("1桁の数字を入力してください> ");
        int input = new Scanner(System.in).nextInt();

        boolean isHit = false;

        for (int money : moneyList) {
            if (money == input) {
                isHit = true;
                break;
            }
        }

        if (isHit) {
            System.out.println("アタリ！");
        }
    }
}

