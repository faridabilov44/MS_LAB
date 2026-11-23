package az.ingress.task1.Lab;

public class BlacklistCheck implements CreditCheck{
    @Override
    public boolean checkCredit(CreditApp credit) {
        return false;
    }
}
