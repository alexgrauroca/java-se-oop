/**
 * Patient object
 */
public class Patient {
    /**
     * Id autoincremental control
     */
    private static int nextId = 0;
    /**
     * Patient id
     */
    private int id;
    /**
     * Patient name
     */
    private String name;
    /**
     * Patient email
     */
    private String email;
    /**
     * Patient address
     */
    private String address;
    /**
     * Patient phone number
     */
    private String phoneNumber;
    /**
     * Patient birthday
     */
    private String birthday;
    /**
     * Patient weight
     */
    private double weight;
    /**
     * Patient height
     */
    private double height;
    /**
     * Patient blood
     */
    private String blood;

    /**
     * New patient instance
     *
     * @param name Patient name
     * @param email Patient email
     */
    Patient(String name, String email) {
        initId();
        
        this.name = name;
        this.email = email;
    }

    /**
     * Init the patient id
     */
    private void initId() {
        nextId++;
        this.id = nextId;
    }

    /**
     * Get patient id
     *
     * @return
     */
    public int getId() {
        return this.id;
    }

    /**
     * Get patient name
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set patient name
     *
     * @param name Patient name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get patient email
     *
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Set patient email
     *
     * @param email Patient email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get patient address
     *
     * @return
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Set patient address
     *
     * @param address Patient address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get patient phone number
     *
     * @return
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set patient phone number
     *
     * @param phoneNumber Patient phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Get patient birthday
     *
     * @return
     */
    public String getBirthday() {
        return this.birthday;
    }

    /**
     * Set patient birthday
     *
     * @param birthday Patient birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * Get patient weight
     *
     * @return
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Set patient weight
     *
     * @param weight Patient weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Get patient height
     *
     * @return
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Set patient height
     *
     * @param height Patient height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Get patient blood
     *
     * @return
     */
    public String getBlood() {
        return this.blood;
    }

    /**
     * Set patient blood
     *
     * @param blood Patient blood
     */
    public void setBlood(String blood) {
        this.blood = blood;
    }
}
