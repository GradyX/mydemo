package design.pattern.proxy;

public class NikeClothFactory implements ClothFactory {

	@Override
	public void productCloth() {
		System.out.println("Nike product factory");
	}

}


class ProxyClothFactroy implements ClothFactory {
	
	private ClothFactory clothFactory;
	
	ProxyClothFactroy(ClothFactory clothFactory) {
		this.clothFactory = clothFactory;
	}

	@Override
	public void productCloth() {
		System.out.println("Proxy product factory, 收取手续费：1000元");
		clothFactory.productCloth();
	}
	
}