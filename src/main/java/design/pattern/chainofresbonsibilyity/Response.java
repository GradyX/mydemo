package design.pattern.chainofresbonsibilyity;

public class Response {

    private boolean result;

    private String postscript;
    
    private String approverName;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript;
    }

    public String getApproverName() {
        return approverName;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName;
    }
    
}
