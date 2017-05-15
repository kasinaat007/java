package tutorial;
public class EmployeeDetails{
	public static void main(String[] args) {
		String firstName = "James";
		String lastName = "Gosling";
		boolean gender = true; /* true = male,false = female */
		String dateOfBirth = "24-06-1965";
		int basicPay = 80000;
		float homeRentAllowance = basicPay * 0.30f;
		float dailyAllowance = basicPay * 0.20f;
		float travelAllowance = basicPay * 0.10f;
		float providenFund = basicPay * 0.10f;
		float netPay = basicPay +
						 homeRentAllowance
						 + dailyAllowance
						  + travelAllowance- providentFund;
		System.out.println("First Name\t    :    "+firstName);
		System.out.println("Last Name\t    :    "+lastName);
		System.out.println("Gender\t\t    :    "+(gender == true ? "Male" : "Female"));
		System.out.println("Date of Birth\t    :    "+dateOfBirth);
		System.out.println("Basic Pay\t    :    Rs."+basicPay);
		System.out.println("Home Rent Allowance :  \t Rs."+homeRentAllowance);
		System.out.println("Daily Allowance\t    :    Rs."+dailyAllowance);
		System.out.println("Travel Allowance    :\t Rs."+travelAllowance);
		System.out.println("Provident Fund      :\t Rs."+providentFund);
		System.out.println("Net pay\t\t    :    Rs."+netPay);
	}
}