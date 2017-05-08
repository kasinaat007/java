public class Solution{
	public static void main(String[] args) {
		Item item1;
		item1 = new Item();
		item1.id = "P01";
		item1.name = "soap";
		item1.maximumRetailPrice = 75.00;
		item1.discountPercentage = 10.0f;
		item1.quantity = 10;
		item1.manufactureDate = "24-06-2016";
		item1.expiryDate = "24-06-2018";
		item1.calculateDiscountPrice();
		item1.print();
	}
}