package Strategy.pay.payport;

import Strategy.pay.PayState;

public interface Payment {
    public PayState pay(String uid, double amount);
}
