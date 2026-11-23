package az.ingress.task1.Lab;

import java.util.List;

public class CreditAppController {
    private final List<CreditCheck> checkList;

    public CreditAppController(List<CreditCheck> checkList) {
        this.checkList = checkList;
    }

    public boolean process(CreditApp application) {

        for (CreditCheck check : checkList) {

            if (!check.checkCredit(application)) {
                return false;
            }
        }

        return true;
    }
}
