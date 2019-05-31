package design.pattern.chainofresbonsibilyity;

public class Director extends Approver {

    public Response approval(Request request) {
        if(request.getFate() < 3) {
            return new Response();
        }
        else {
            return superior.approval(request);
        }
    }

}
