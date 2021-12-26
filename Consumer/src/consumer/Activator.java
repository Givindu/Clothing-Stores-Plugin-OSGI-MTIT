package consumer;

import aboutus.ServiceAboutUs;
import categories.ServiceCategories;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import servicedelivery.ServiceDelivery;
import servicepromotions.ServicePromotions;

public class Activator implements BundleActivator {

	 ServiceReference serviceReference;
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int answer = 0;
		
        try {
            do {
                System.out.println("************************************************");
                System.out.println("Welcome to Clothing Store.\n");
                System.out.println("Choose service number to recieve our services: ");
                System.out.println(" 1 -  About Us");
                System.out.println(" 2 -  Categories");
                System.out.println(" 3 -  Promotions");
                System.out.println(" 4 -  Delivery Service");
                System.out.println("Enter 99 to exit.");
                answer = scan.nextInt();
                switch (answer) {
                    case 1: {
                        this.serviceReference = bundleContext.getServiceReference(ServiceAboutUs.class.getName());
                        final ServiceAboutUs aboutUs = (ServiceAboutUs)bundleContext.getService(this.serviceReference);
                        if (aboutUs != null) {
                        	aboutUs.aboutUsService();
                            continue;
                        }
                        continue;
                    }
                    case 2: {
                        this.serviceReference = bundleContext.getServiceReference(ServiceCategories.class.getName());
                        final ServiceCategories serviceCategories = (ServiceCategories)bundleContext.getService(this.serviceReference);
                        if (serviceCategories != null) {
                        	serviceCategories.displayCategories();
                            continue;
                        }
                        continue;
                    }
                    case 3: {
                        this.serviceReference = bundleContext.getServiceReference(ServicePromotions.class.getName());
                        final ServicePromotions servicePromotions = (ServicePromotions)bundleContext.getService(this.serviceReference);
                        if (servicePromotions != null) {
                        	servicePromotions.promotions();
                            continue;
                        }
                        continue;
                    }
                    case 4: {
                        this.serviceReference = bundleContext.getServiceReference(ServiceDelivery.class.getName());
                        final ServiceDelivery serviceDelivery = (ServiceDelivery)bundleContext.getService(this.serviceReference);
                        if (serviceDelivery != null) {
                            serviceDelivery.deliveryService();
                            continue;
                        }
                        continue;
                    }
                    case 99: {
                        continue;
                    }
                    default: {
                        System.out.println("Invalid number. Please choose a given service number.");
                        continue;
                    }
                }
            } while (answer != 99);
	}catch (Exception ex) {
        System.out.println("Exception occured. ");
    }
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Consumer exit the application");
	}

}
