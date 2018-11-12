
package ec.edu.espe.barbershopproject.model;

/**
 *
 * @author Bryan Zurita
 */
public class Customer {
    private String fullName;
    private String identityCardNumber;
    private String phoneNumber;
    private String address;
    //private Service services;
    private Bill payment;

    public Customer(String fullName, String identityCardNumber, String phoneNumber, String address, /*Service services*/ Bill payment) {
        this.fullName = fullName;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        //this.services = services;
        this.payment = payment;
    }
    
    public void selectSeervice (/*Service service*/){
        
        
    }
    
    public void receiveService (/*Customer customer, Employee employee, Service service*/){
        
        
    }
    
    public void pay (Bill bill){
        
        
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the identityCardNumber
     */
    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    /**
     * @param identityCardNumber the identityCardNumber to set
     */
    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the payment
     */
    public Bill getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(Bill payment) {
        this.payment = payment;
    }
    
    
}
