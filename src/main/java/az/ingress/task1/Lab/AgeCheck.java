package az.ingress.task1.Lab;

public class AgeCheck implements CreditCheck{
    @Override
    public boolean checkCredit(CreditApp credit) {
        return false;
    }
}
