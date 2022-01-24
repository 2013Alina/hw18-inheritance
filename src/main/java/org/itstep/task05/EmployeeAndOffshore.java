package org.itstep.task05;

import org.itstep.task04.EmployeeAndTugrik;

public class EmployeeAndOffshore extends EmployeeAndTugrik {

    private boolean inOffshore = false;

    public EmployeeAndOffshore(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);

    }

    public EmployeeAndOffshore(String fullName, String paymentType, double payment, boolean hasChild) {
        super(fullName, paymentType, payment, hasChild);

    }

    public EmployeeAndOffshore(String fullName, String paymentType, double payment, boolean hasChild, boolean inOffshore) {
        super(fullName, paymentType, payment, hasChild);
        this.inOffshore = inOffshore;

    }

    public boolean isInOffshore() {
        return inOffshore;
    }

    public void setInOffshore(boolean inOffshore) {
        this.inOffshore = inOffshore;
    }

    @Override
    public String toString() {
        if (inOffshore) {
            int tax = 0;
            setTax(tax);
            return super.toString();
        }
        return super.toString();
    }
}
