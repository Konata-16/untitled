package practice.chpter2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Practice3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください＞");
        String name = br.readLine();
        System.out.print("あなたの年齢を入力してください＞");
        String ageString = br.readLine();
        int age = Integer.parseInt(ageString);
        int fortune  = (int) (Math.random() * 4);
        fortune++;
        System.out.println("占いの結果が出ました!");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.print("1:大吉　2: 中吉　3:吉　4:凶");
    }
}