package org.itstep.task04;

import org.itstep.task02.EmployeeAndTax;

public class EmployeeAndTugrik extends EmployeeAndTax {
    private boolean hasChild;
    private double tugrikExchange = 0.0;

    public EmployeeAndTugrik(String fullName, String paymentType, double payment, boolean hasChild) {
        super(fullName, paymentType, payment);
        this.hasChild = hasChild;
    }
    public EmployeeAndTugrik(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);
    }

    public double getTugrikExchange() {
        return tugrikExchange;
    }

    public void setTugrikExchange(double exchangeRates){
        tugrikExchange = getPaymentWithTax(getPayment())/exchangeRates;

    }

    public boolean isHasChild() {
        return hasChild;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }

    @Override
    public String toString() {
        if(tugrikExchange > 0){
            return String.format("%-8s | %-9s | %-11s | %.1f грн / %.1f",
                    getFullName(), getTax(), getPayment(),getPaymentWithTax(getPayment()), getTugrikExchange());
        }
        return String.format("%-8s | %-9s | %-11s | %.1f грн ",
                getFullName(), getTax(), getPayment(),getPaymentWithTax(getPayment()));
    }
}
