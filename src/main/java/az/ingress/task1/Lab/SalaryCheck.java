package az.ingress.task1.Lab;

public class SalaryCheck implements CreditCheck{
    @Override
    public boolean checkCredit(CreditApp credit) {
        return false;
    }
}
