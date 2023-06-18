package Observerpattern.Observer;

import Observerpattern.Obserable.StockObserable;
public class MobileAlertObserver implements NotificationAlertObserver {

    String phoneNumber;
    StockObserable obserable;

    public MobileAlertObserver(String phoneNumber, StockObserable obserable) {
        this.phoneNumber = phoneNumber;
        this.obserable = obserable;
    }

    @Override
    public void update() {
        sendSMS(phoneNumber, "Product in stock");
    }

    public void sendSMS(String phoneNumber, String message) {
        System.out.println("SMS sent to :" + phoneNumber);
        // send SMS logic
    }
}
