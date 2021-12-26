package aboutus;

import java.util.Scanner;

public class ServiceAboutUsImp implements ServiceAboutUs{

	@Override
	public void aboutUsService() {
		// TODO Auto-generated method stub
		int answer = 0;
        final Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter 99 to exit.");
            System.out.println("1- About Us");
            System.out.println("2- Our History");
            System.out.println("3- Contact Us");
            System.out.println("Enter The Service Number?");
            answer = scan.nextInt();
            switch (answer) {
                case 99: {
                    continue;
                }
                case 1: {
                    System.out.println("Online clothing dilivery system.We are a well known company for selling clothes for Decades.");
                    continue;
                }
                case 2: {
                    System.out.println("We established our company in 2007 and praveen fernando started this company");
                    continue;
                }
                case 3: {
                    System.out.println("Telephone = 0118372592|E-Mail = clothes@gmail.com|Website = www.clothesstore.com");
                    continue;
                }
                default: {
                    System.out.println("Invalid character");
                    continue;
                }
            }
        } while (answer != 99);
	}

}
