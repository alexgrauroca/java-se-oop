/**
 * Patient object
 */
public class Patient extends User {
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
        super(name, email);
    }

    /**
     * Get patient birthday
     *
     * @return Patient birthday
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
     * @return Patient weight
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
     * @return Patient height
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
     * @return Patient blood
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
