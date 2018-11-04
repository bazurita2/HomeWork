
package ec.edu.espe.barbershopproject.model;

/**
 *
 * @author Bryan Zurita
 */
public class Bill {
    private String billCode;
    private Customer customer;
    private Location location;
    //private Service services;
    //private Product products;
    private final float iva;

    public Bill(String billCode, Customer customer, Location location, /*Service services, Product products, */float iva) {
        this.billCode = billCode;
        this.customer = customer;
        this.location = location;
        //this.services = services;
        //this.products = products;
        this.iva = iva;
    }
    
    public void addProductOrService (/*Product product, Service service*/){
        
        
    }

    /**
     * @return the billCode
     */
    public String getBillCode() {
        return billCode;
    }

    /**
     * @param billCode the billCode to set
     */
    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * @return the iva
     */
    public float getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(float iva) {
        this.iva = iva;
    }
    
    
}
