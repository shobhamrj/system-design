package Observerpattern.Obserable;

import Observerpattern.Observer.NotificationAlertObserver;

// LLD of notify me feature of flipkart, (via observer pattern)
public interface StockObserable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscriber();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}