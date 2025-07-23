package practice.chpter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("数あてゲーム");
        int ans = (int) (Math.random() * 10);
        for (int i = 0; i < 5; i++) {
            System.out.print("0~9の数字を入力してください");
            int num = Integer.parseInt(br.readLine());
            if (num == ans) {
                System.out.println("アタリ！");
            } else {
                System.out.println("違います");
            }
            System.out.print("ゲームを終了します");

        }
    }
}
