package masterclass.java.S09.interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone dannysPhone;
        dannysPhone = new DeskPhone(444448888);
        dannysPhone.powerOn();
        dannysPhone.dial(444822888);
        dannysPhone.callPhone(444448888);
        dannysPhone.answer();


        dannysPhone = new MobilePhone(799945886);
        dannysPhone.powerOn();
        dannysPhone.callPhone(44444);
        dannysPhone.answer();
    }
}
