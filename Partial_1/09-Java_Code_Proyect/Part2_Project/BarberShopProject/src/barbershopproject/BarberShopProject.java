
package barbershopproject;

import ec.edu.espe.barbershopproject.model.Customer;
import ec.edu.espe.barbershopproject.model.Schedule;
import ec.edu.espe.barbershopproject.model.Bill;
import ec.edu.espe.barbershopproject.model.Location;

/**
 *
 * @author Bryan Zurita
 */
public class BarberShopProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer customer = new Customer("Daniel Criollo","1723654388","0998889479",vent);
        customer.selectSeervice();
        customer.receiveService();
        customer.pay(bill);
        Schedule schedule = new Schedule(12.3,23.3,4,2);
        schedule.comply();
        Bill bill = new Bill();
        bill.addProductOrService();
        Location location = new Location();
    }
    
}
