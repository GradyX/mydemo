package design.pattern.chainofresbonsibilyity;

public class President extends Approver {

    public Response approval(Request request) {
        if(request.getFate() < 30) {
            return new Response();
        }
        else {
            return new Response();
        }
    }

}
