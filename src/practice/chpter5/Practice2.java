package practice.chpter5;

public class Practice2 {
    public static void main(String[] args) {

    email();
    }
    public static void email() {
        String title = "メールの宛先アドレス";
        String address = "メールのタイトル";
        String text = "メールの本文";

        System.out.println(title + "に、以下のメールを送信しました。" );
        System.out.println( "件名:"+title );
        System.out.println( "本文:"+text );


    }
}

