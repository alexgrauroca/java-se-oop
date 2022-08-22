/**
 * Doctor object
 */
public class Doctor {
    /**
     * Id autoincremental control
     */
    private static int nextId = 0;
    /**
     * Doctor id
     */
    private int id;
    /**
     * Doctor name
     */
    private String name;
    /**
     * Doctor email
     */
    private String email;
    /**
     * Doctor speciality
     */
    private String speciality;

    /**
     * New doctor instance
     *
     * @param name Doctor name
     * @param email Doctor email
     * @param speciality Doctor speciality
     */
    Doctor(String name, String email, String speciality) {
        initId();
        this.name = name;
        this.email = email;
        this.speciality = speciality;
    }

    /**
     * Init the doctor id
     */
    private void initId() {
        nextId++;
        this.id = nextId;
    }

    /**
     * Print the doctor name
     */
    public void showName() {
        System.out.println(name);
    }

    /**
     * Get doctor id
     *
     * @return
     */
    public int getId() {
        return this.id;
    }

    /**
     * Get doctor name
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set doctor name
     *
     * @param name Doctor name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get doctor email
     *
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Set doctor email
     *
     * @param email Doctor email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get doctor speciality
     *
     * @return
     */
    public String getSpeciality() {
        return this.speciality;
    }

    /**
     * Set doctor speciality
     *
     * @param speciality Doctor speciality
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

}
