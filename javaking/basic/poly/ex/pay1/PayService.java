package javaking.basic.poly.ex.pay1;

public class PayService {

    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" +
                amount);
        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if(result){
            System.out.println("결제 성공");
        }else {
            System.out.println("결제 실패");
        }

    }
}
