package practice.chpter5;

public class Practice3 {
    public static void main(String[] args) {
        String title = "メールの宛先アドレス";
        String address = "メールのタイトル";
        String text = "メールの本文";
        email(address,title);
    }
    public static void email(String title,String address, String text) {
        System.out.println(title + "に、以下のメールを送信しました。");
        System.out.println("件名:" + title);
        System.out.println("本文:" + text);
    }

        public static void email(String address, String text) {
            /*String title = "無題"; // 件名は常に「無題」
            sendEmail(address, title, text);*/

        System.out.println(address + "に、以下のメールを送信しました。" );
        System.out.println( "件名:"+"無題" );
        System.out.println( "本文:"+text );
        }
    }

