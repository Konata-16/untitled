package practice.reviews.reviews3.review28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review28_Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("宛先を入力＞");
        String to = br.readLine();

        System.out.print("件名を入力＞");
        String subject = br.readLine();

        System.out.print("本文を入力＞");
        String body = br.readLine();

        Review28_Email email = new Review28_Email();

        if (subject.equals("")) {
            email.send(to, body);
        } else {
            email.send(to, subject, body);
        }
    }
}

