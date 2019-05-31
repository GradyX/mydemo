package design.pattern.chainofresbonsibilyity;

import java.util.Date;

public class Request {

    private String reason;
    
    private int fate;
    
    private Date startDate;
    
    private Date endDate;
    
    private String customerName;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getFate() {
        return fate;
    }

    public void setFate(int fate) {
        this.fate = fate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
}
