package space.mavitech.linguagemjava.ebac.padroesdeprojetos.factory.domain;

public class Customer {

    private String gradeRequest;
    private boolean hasCompanyContrat;

    public Customer(String gradeRequest, boolean hasCompanyContrat) {
        this.gradeRequest = gradeRequest;
        this.hasCompanyContrat = hasCompanyContrat;
    }

    public boolean isHasCompanyContrat() {
        return hasCompanyContrat;
    }

    public String getGradeRequest() {
        return gradeRequest;
    }

}
