/**
 * User object
 */
public class User {
    /**
     * Id autoincremental control
     */
    private static int nextId = 0;    

    /**
     * User id
     */
    private int id;
    /**
     * User name
     */
    private String name;
    /**
     * User email
     */
    private String email;
    /**
     * User address
     */
    private String address;
    /**
     * User phone number
     */
    private String phoneNumber;

    /**
     * New user instance
     *
     * @param name User name
     * @param email User email
     */
    User(String name, String email) {
        initId();
        
        this.name = name;
        this.email = email;
    }

    /**
     * Init the user id
     */
    private void initId() {
        nextId++;
        this.id = nextId;
    }

    @Override
    public String toString() {
        return "User: " + this.name + ", Email: " + this.email + "\nAddress: " + this.address + ". Phone: " + this.phoneNumber;
    }
    
    /**
     * Get user id
     *
     * @return User id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Get user name
     *
     * @return User name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set user name
     *
     * @param name User name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get user email
     *
     * @return User email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Set user email
     *
     * @param email User email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get user address
     *
     * @return User address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Set user address
     *
     * @param address User address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get user phone number
     *
     * @return User phone number
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set user phone number
     *
     * @param phoneNumber User phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
