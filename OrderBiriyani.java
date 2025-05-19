public class OrderBiriyani{
	public static void main(String []args){
		String foodName = "Biriyani";
		int price = 450;
		float gst = 0.18f;
		int numberOfBiriyanis = 15;
		int deliveryCharge = 50;
		int totalBiriyaniPrice = price * 15;
		System.out.println("Total Price Is:"+ totalBiriyaniPrice);
		System.out.println("GST calculator");
		float gstPrice = totalBiriyaniPrice*gst;
		System.out.println("gstPrice is:"+ gstPrice);
		float payableAmount = totalBiriyaniPrice + gstPrice+deliveryCharge;
		System.out.println("payable amount is:"+payableAmount);
		float discount = 0.15f; 
		float discountAmount = payableAmount * discount;
		System.out.println("discount amount:"+ discountAmount);
}
}