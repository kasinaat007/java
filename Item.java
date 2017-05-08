public class Item{
		String id;
		String name;
		double maximumRetailPrice;
		float discountPercentage;
		double discountPrice;
		int quantity;
		String manufactureDate;
		String expiryDate;
		double totalPrice;

		void calculateDiscountPrice(){
			discountPrice = maximumRetailPrice * (discountPercentage / 100.0);
			totalPrice = quantity * (maximumRetailPrice - discountPrice);
		}
		void print(){
			System.out.printf("%-30s:%-10s\n","Item Id",id);
			System.out.printf("%-30s:%-10s\n","Product Name",name);
			System.out.printf("%-30s:%-10.2f\n","Maximum Price",maximumRetailPrice);
			System.out.printf("%-30s:%-10d\n","Quantity",quantity);
			System.out.printf("%-30s:%-10s\n","Manufacturing Date",manufactureDate);
			System.out.printf("%-30s:%-10s\n","Expiry Date",expiryDate);
			System.out.printf("%-30s:%-10.2f\n","Discount Percentage",discountPercentage);
			System.out.printf("%-30s:Rs.%-10.2f\n","Discount Price",discountPrice);
			System.out.printf("%-30s:Rs.%-10.2f\n","Total Price",totalPrice);
	}
}