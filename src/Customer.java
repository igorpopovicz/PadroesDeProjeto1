public class Customer {
    public static final int RENAULT = 1;
    public static final int VOLKSWAGEN = 2;
    
    private String gradeRequest;
    private int company;

    public Customer(String gradeRequest, int company) {
        this.gradeRequest = gradeRequest;
        this.company = company;
    }

    public int getCompany() {
        return this.company;
    }

    public String getGradeRequest() {
        return this.gradeRequest;
    }
}
