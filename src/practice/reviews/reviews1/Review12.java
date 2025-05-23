package practice.reviews.reviews1;

import java.io.*;

public class Review12 {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("年齢を入力してください＞");
        int age =Integer.parseInt(br.readLine());
        if(0<=age && age<=17){
            System.out.println("未成年");
        } else if (age<=64) {
            System.out.println("成人");
        }else if (age>64){
            System.out.println("高齢者");
        }else{
            System.out.println("無効な年齢です。");
        }

    }
}
