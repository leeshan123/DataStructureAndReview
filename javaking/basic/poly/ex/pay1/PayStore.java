package javaking.basic.poly.ex.pay1;

public class PayStore {

    public static Pay findPay(String option){
        if(option.equals("kakao")){
            return new KakaoPay();
        }else if(option.equals("naver")){
            return new NaverPay();
        }else {
            return new DefaultPay();
        }
    }

}
