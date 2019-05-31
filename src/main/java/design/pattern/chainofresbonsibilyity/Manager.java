package design.pattern.chainofresbonsibilyity;

public class Manager extends Approver {

    @Override
    public Response approval(Request request) {
        if(request.getFate() >= 3 && request.getFate() <= 10) {
            return new Response();
        }
        else {
            return superior.approval(request);
        }
    }

}
