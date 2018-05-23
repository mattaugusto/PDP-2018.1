package product;

/**
 *
 * @author Matheus
 */
public class Name {
    private String name;
    private String lastName;

    public Name(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
   
    @Override
    public String toString() {
        return this.name + " " + this.lastName;
    }
}
