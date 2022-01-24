package org.itstep.task04;

import org.itstep.task02.EmployeeAndTax;
import org.itstep.task03.EmployeeAndChild;

public class EmployeeAndTugrik extends EmployeeAndChild {

    private double tugrikExchange = 0.0;

    public EmployeeAndTugrik(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);
    }

    public EmployeeAndTugrik(String fullName, String paymentType, double payment, boolean hasChild) {
        super(fullName, paymentType, payment, hasChild);
    }


    public double getTugrikExchange() {
        return tugrikExchange;
    }

    public void setTugrikExchange(double exchangeRates){
        tugrikExchange = (getPaymentWithTax(getPayment())/2)/exchangeRates;

    }

    @Override
    public String toString() {
        if(tugrikExchange > 0){
            return String.format("%-8s | %-9s | %-11s | %.1f грн / %.1f",
                    getFullName(), getTax(), getPayment(),getPaymentWithTax(getPayment())/2,
                    getTugrikExchange());
        }
        return String.format("%-8s | %-9s | %-11s | %.1f грн ",
                getFullName(), getTax(), getPayment(),getPaymentWithTax(getPayment()));
    }
}
