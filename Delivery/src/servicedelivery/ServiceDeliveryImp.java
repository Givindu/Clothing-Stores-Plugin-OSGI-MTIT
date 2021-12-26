package servicedelivery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServiceDeliveryImp implements ServiceDelivery{

	@Override
	public void deliveryService() {
		// TODO Auto-generated method stub
		int answer = 0;
        do {
            final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Give a number to view delivery details of the current area :");
            System.out.println("Colombo : 1\n");
            System.out.println("Wattala : 2\n");
            System.out.println("Negombo : 3\n");
            System.out.println("Exit : 99\n");
            System.out.println("Enter Number:");
            try {
            	answer = Integer.parseInt(in.readLine());
            }
            catch (NumberFormatException e) {
                e.printStackTrace();
            }
            catch (IOException e2) {
                e2.printStackTrace();
            }
            switch (answer) {
                case 1: {
                    System.out.println("Contact No:  077 511 9576\n We will deliver around Colombo 10 such as Kollupitiya, Bambalapitiya, Fort etc\n Note: Orders within 5km from the select outlet will be delivered.\n\n\n ");
                    
                    continue;
                }
                case 2: {
                    System.out.println("Contact No:  077 685 7653\n We will deliver around Wattala such as Paliyagoda, Hunupitiya, Elakanda etc\n Note: Orders within 5km from the select outlet will be delivered.\n\n\n ");
                    continue;
                }
                case 3: {
                    System.out.println("Contact No:  077 265 1234\n We will deliver around Negombo such as Katunayaka, Pamunugama, Seeduwa etc\n Note: Orders within 5km from the select outlet will be delivered.\n\n\n ");
                    continue;
                }
                case 99: {
                    continue;
                }
                default: {
                    System.out.println("The number you entered is invalid!!!");
                    continue;
                }
            }
        } while (answer != 99);
	}

}
