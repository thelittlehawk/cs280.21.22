package ba.edu.ssst;

public class Customer extends Object implements IContract {
    private String fullName;
    private int startYear;

    public Customer(String fullName, int startYear) {
        this.fullName = fullName;
        this.startYear = startYear;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    @Override
    public int length() {
        return 2021 - this.startYear;
    }
}
