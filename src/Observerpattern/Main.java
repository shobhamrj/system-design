package Observerpattern;

import Observerpattern.Obserable.IphoneObserable;
import Observerpattern.Obserable.StockObserable;
import Observerpattern.Observer.EmailAlertObserver;
import Observerpattern.Observer.MobileAlertObserver;
import Observerpattern.Observer.NotificationAlertObserver;

public class Main {

    public static void main(String[] args) {
        StockObserable iphoneStockObserable = new IphoneObserable();

        NotificationAlertObserver o1 = new EmailAlertObserver("shobham.rajak@gmail.com", iphoneStockObserable);
        NotificationAlertObserver o2 = new MobileAlertObserver("7602179897", iphoneStockObserable);

        iphoneStockObserable.add(o1);
        iphoneStockObserable.add(o2);

        iphoneStockObserable.setStockCount(10);
    }
}
