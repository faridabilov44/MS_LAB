package az.ingress.task1.Lab;

public class SanctionCheck implements CreditCheck {
    @Override
    public boolean checkCredit(CreditApp credit) {
        return false;
    }
}
