package az.ingress.task1.Lab;

public class CreditApp {

    private int age;
    private int employmentMonths;
    private double salary;
    private double requestedAmount;
    private int creditScore;

    private boolean blacklisted;
    private boolean sanctioned;

    public CreditApp(int age, int employmentMonths, double salary, double requestedAmount, int creditScore, boolean blacklisted, boolean sanctioned) {
        this.age = age;
        this.employmentMonths = employmentMonths;
        this.salary = salary;
        this.requestedAmount = requestedAmount;
        this.creditScore = creditScore;
        this.blacklisted = blacklisted;
        this.sanctioned = sanctioned;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmploymentMonths() {
        return employmentMonths;
    }

    public void setEmploymentMonths(int employmentMonths) {
        this.employmentMonths = employmentMonths;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(double requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public boolean isBlacklisted() {
        return blacklisted;
    }

    public void setBlacklisted(boolean blacklisted) {
        this.blacklisted = blacklisted;
    }

    public boolean isSanctioned() {
        return sanctioned;
    }

    public void setSanctioned(boolean sanctioned) {
        this.sanctioned = sanctioned;
    }
}
