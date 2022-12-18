package edu.AnastasiiaTkachuk.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private static int generator = 1;
    private final Lock lock = new ReentrantLock();
    private int id;
    private int money;

    public Lock getLock() {
        return lock;
    }

    public Account(int money) {
        this.money = money;
        this.id = generator++;
    }
    public void add(int money){
        this.money += money;
    }
    public boolean takeOff(int money){
        if(this.money >= money){
            this.money -= money;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }
}