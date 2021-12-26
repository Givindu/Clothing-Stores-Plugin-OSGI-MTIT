package categories;

import java.util.Scanner;

public class ServiceCategoriesImp implements ServiceCategories{

	private Products products;
	
	@Override
	public void displayCategories() {
		// TODO Auto-generated method stub
		Integer answer = 0;
        final Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Available categories\n");
            System.out.println(" 1 -  Shirts");
            System.out.println(" 2 -  T-Shirts");
            System.out.println(" 3 -  Trousers");
            System.out.println(" 4 -  Shorts");
            System.out.println("Enter 99 to exit.");
            System.out.println("Enter category number to view price details: ");
            answer = scan.nextInt();
            if (answer == 99) {
                break;
            }
            this.getPriceFromIndex(answer);
        } while (answer != 99);
	}

	 private void getPriceFromIndex(final Integer menuIndex) {
	        this.products = new Products();
	        switch (menuIndex) {
	            case 1: {
	                this.products.setProductName("Shirt 1");
	                this.products.setProductprice(500.00);
	                this.products.setProductSize("M");
	                this.products.setAvailability(10);
	                this.products.setProductDescription("New Shirt");
	                this.printDetails();
	                break;
	            }
	            case 2: {
	            	this.products.setProductName("T-Shirt 1");
	            	this.products.setProductprice(1000.00);
	            	this.products.setProductSize("L");
	            	this.products.setAvailability(05);
	            	this.products.setProductDescription("New T-Shirt");
	            	this.printDetails();
	            	break;
	            }
	            case 3: {
	            	this.products.setProductName("Trouser 1");
	            	this.products.setProductprice(3000.00);
	            	this.products.setProductSize("M");
	            	this.products.setAvailability(15);
	            	this.products.setProductDescription("New Trouser");
	            	this.printDetails();
	            	break;
	            }
	            case 4: {
	            	this.products.setProductName("Short 1");
	            	this.products.setProductprice(500.00);
	            	this.products.setProductSize("M");
	            	this.products.setAvailability(10);
	            	this.products.setProductDescription("New Short");
	            	this.printDetails();
	            	break;
	            }
	            default: {
	                System.out.println("Invalid number. Please enter number from the category.\n");
	                break;
	            }
	        }
	    }
	    
	    private void printDetails() {
	        System.out.println("\n-------------------------------------\n");
	        System.out.println(products.getProductName());
	        System.out.println("Price : Rs." + products.getProductprice() + "/=");
	        System.out.println("Size: Rs." + products.getProductSize() + "/=");
	        System.out.println("Description : Rs." + products.getProductDescription() + "/=" + "\n");
	        System.out.println("-------------------------------------\n");
	    }
}
