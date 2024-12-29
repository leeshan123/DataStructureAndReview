package javaking.basic.poly.ex.pay0;

public class EmailSender implements Sender {
    @Override
    public void sendMessage(String s) {
        System.out.println("메일을 발송합니다: " + s);
    }
}
