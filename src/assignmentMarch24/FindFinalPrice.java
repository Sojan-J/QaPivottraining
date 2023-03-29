package assignmentMarch24;

public class FindFinalPrice {
	boolean promo05;
	boolean promo10;
	boolean promo20;
	
	double productPrice;
	double finalPrice;
	double discountAmount;
	
void productDiscount() {
		productPrice*=.5;
		if(promo05) {
			discountAmount=productPrice*0.05;
			
		}
		else
			
		if(promo10) {
			discountAmount=productPrice*0.10;
			
		}
		else
		if(promo20) {
			discountAmount=productPrice*0.20;
			
		}
		else
		discountAmount=0;
		finalPrice=productPrice-discountAmount;
		
		
		System.out.println("price of product after discount is :"+finalPrice);
	}


}
