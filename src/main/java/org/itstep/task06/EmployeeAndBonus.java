package org.itstep.task06;

import org.itstep.task05.EmployeeAndOffshore;

public class EmployeeAndBonus extends EmployeeAndOffshore {

    private double workHours = 0;

    public EmployeeAndBonus(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);
    }

    public EmployeeAndBonus(String fullName, String paymentType, double payment, double workHours) {
        super(fullName, paymentType, payment);
        this.workHours = workHours;
    }

    public EmployeeAndBonus(String fullName, String paymentType, double payment, boolean hasChild, double workHours) {
        super(fullName, paymentType, payment, hasChild);
        this.workHours = workHours;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        if (workHours > 200 && !isInOffshore()) {
            double premium = getPayment() + getPayment() * 20 / 100;
            return String.format("%-8s | %-9s | %-11s | %.1f грн",
                    getFullName(), getTax(), premium,
                    getPaymentWithTax(premium));
        }
        return super.toString();
    }
}
