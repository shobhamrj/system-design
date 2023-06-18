package Observerpattern.Observer;

import Observerpattern.Obserable.StockObserable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String emailId;
    StockObserable obserable;

    public EmailAlertObserver(String emailId, StockObserable obserable) {
        this.emailId = emailId;
        this.obserable = obserable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product in stock");
    }

    public void sendEmail(String emailId, String message) {
        System.out.println("email sent to :" + emailId);
        // send email logic
    }
}
