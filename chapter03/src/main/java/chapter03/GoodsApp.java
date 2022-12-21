package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		camera.printInfo();
		
		// 정보은닉(데이터보호)
		camera.setPrice(-1);
		
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		
		camera.setPrice(400000);
		System.out.println(camera.calcDiscountPrice(0));
	}

}
