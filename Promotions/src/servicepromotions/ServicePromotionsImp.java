package servicepromotions;

import java.util.Scanner;

public class ServicePromotionsImp implements ServicePromotions{

	@Override
	public void promotions() {
		// TODO Auto-generated method stub
		 final Scanner scan = new Scanner(System.in);
	        int select;
	        do {
	            System.out.println("Promotions: \n1.Offers\n2.Discounts\n3.Packages\n99.Exit\nInput number:");
	            select = scan.nextInt();
	            switch (select) {
	                case 1: {
	                    System.out.println(this.offers());
	                    continue;
	                }
	                case 2: {
	                    System.out.println(this.discounts());
	                    continue;
	                }
	                case 3: {
	                    System.out.println(this.packages());
	                    continue;
	                }
	                case 99: {
	                    continue;
	                }
	                default: {
	                    System.out.println("Invalid input\n");
	                    continue;
	                }
	            }
	        } while (select != 99);
	}

	@Override
	public String offers() {
		// TODO Auto-generated method stub
		return "50% off for Kids Clothings";
	}

	@Override
	public String packages() {
		// TODO Auto-generated method stub
		return "1.Buy More than 10 clothes for New Year - Get ready!! Starting from April first\n";
	}

	@Override
	public String discounts() {
		// TODO Auto-generated method stub
		return "20% off for over 10 000 bils\n";
	}
	
}
