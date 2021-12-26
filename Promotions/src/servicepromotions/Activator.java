package servicepromotions;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistration;
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		 final ServicePromotions promotions = new ServicePromotionsImp();
	        this.serviceRegistration = bundleContext.registerService(ServicePromotions.class.getName(), (Object)promotions, null);
	System.out.println("Promotion service start");
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		this.serviceRegistration.unregister();
		System.out.println("Promotion service stop");
	}

}
