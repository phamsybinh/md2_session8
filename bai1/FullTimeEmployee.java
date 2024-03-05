package BTVN.bai1;

public class FullTimeEmployee extends Employee{
    @Override
    public double calculateSalary() {
        return 8*getPaymentPerHour();
    }

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
}
