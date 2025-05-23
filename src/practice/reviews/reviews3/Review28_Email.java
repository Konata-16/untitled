package practice.reviews.reviews3;

public class Review28_Email {
    public void send(String to, String body) {
        System.out.println(to + " に以下のメールを送信しました。");
        System.out.println("件名：【なし】");
        System.out.println("本文：" + body);
    }

    public void send(String to, String subject, String body) {
        System.out.println(to + " に以下のメールを送信しました。");
        System.out.println("件名：" + subject);
        System.out.println("本文：" + body);
    }
}
