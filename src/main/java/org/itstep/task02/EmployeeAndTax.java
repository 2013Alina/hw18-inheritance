package org.itstep.task02;

import org.itstep.PaymentTypes;
import org.itstep.task01.Employee;

public class EmployeeAndTax extends Employee {
    private int tax;

    public EmployeeAndTax(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);
        setPaymentType(paymentType);
    }

    public int getTax() {
        return tax;
    }

    @Override
    public void setPaymentType(String paymentType) {
        if (paymentType.equals(PaymentTypes.HOURLY)) {
            tax = 20;
        }
        if (paymentType.equals(PaymentTypes.RATE)) {
            tax = 15;
        }
        if (paymentType.equals(PaymentTypes.JOB_PRICE)) {
            tax = 15;
        }
    }

    public double getPaymentWithTax(double payment) {
        double sum;
        sum = (payment * (100 - tax)) / 100;
        return sum;
    }

    @Override
    public String toString() {
        return String.format("%-8s | %-9s | %-11s | %.1f грн ",
                getFullName(), tax, getPayment(), getPaymentWithTax(getPayment()));
    }
}
