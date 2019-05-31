package design.pattern.chainofresbonsibilyity;

public abstract class Approver {
    
    private String approverName;
    
    public abstract Response approval(Request request);
    
    protected Approver superior;

    public String getApproverName() {
        return approverName;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName;
    }
    
    public void setSuperior(Approver superior) {
        this.superior = superior;
    }
    
}
