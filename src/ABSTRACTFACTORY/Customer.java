package ABSTRACTFACTORY;
public class Customer {
    
    private String gradeRequest;
    private String company;

    public Customer(String gradeRequest, String company) {
        this.gradeRequest = gradeRequest;
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }

    public String getGradeRequest() {
        return this.gradeRequest;
    }
}
