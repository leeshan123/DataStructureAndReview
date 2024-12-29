package javaking.basic.poly.ex.pay0;

public class SmsSneder implements Sender {
    @Override
    public void sendMessage(String s) {
        System.out.println("SMS를 발송합니다: " + s);
    }
}
