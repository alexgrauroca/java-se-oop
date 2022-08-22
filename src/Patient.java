/**
 * Patient object
 */
public class Patient {
    /**
     * Id autoincremental control
     */
    static int nextId = 0;
    /**
     * Patient id
     */
    int id;
    /**
     * Patient name
     */
    String name;
    /**
     * Patient email
     */
    String email;
    /**
     * Patient address
     */
    String address;
    /**
     * Patient phone number
     */
    String phoneNumber;
    /**
     * Patient birthday
     */
    String birthday;
    /**
     * Patient weight
     */
    double weight;
    /**
     * Patient height
     */
    double height;
    /**
     * Patient blood
     */
    String blood;

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
}
