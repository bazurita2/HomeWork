
package ec.edu.espe.barbershopproject.model;

/**
 *
 * @author Bryan Zurita
 */
public class Location {
    private String mainStreetName;
    private String secondaryStreetName;
    private String references;
    private String postalCode;

    public Location(String mainStreetName, String secondaryStreetName, String references, String postalCode) {
        this.mainStreetName = mainStreetName;
        this.secondaryStreetName = secondaryStreetName;
        this.references = references;
        this.postalCode = postalCode;
    }

    /**
     * @return the mainStreetName
     */
    public String getMainStreetName() {
        return mainStreetName;
    }

    /**
     * @param mainStreetName the mainStreetName to set
     */
    public void setMainStreetName(String mainStreetName) {
        this.mainStreetName = mainStreetName;
    }

    /**
     * @return the secondaryStreetName
     */
    public String getSecondaryStreetName() {
        return secondaryStreetName;
    }

    /**
     * @param secondaryStreetName the secondaryStreetName to set
     */
    public void setSecondaryStreetName(String secondaryStreetName) {
        this.secondaryStreetName = secondaryStreetName;
    }

    /**
     * @return the references
     */
    public String getReferences() {
        return references;
    }

    /**
     * @param references the references to set
     */
    public void setReferences(String references) {
        this.references = references;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
}
