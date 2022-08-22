/**
 * Doctor object
 */
public class Doctor {
    /**
     * Id autoincremental control
     */
    static int nextId = 0;
    /**
     * Doctor id
     */
    int id;
    /**
     * Doctor name
     */
    String name;
    /**
     * Doctor speciality
     */
    String speciality;

    /**
     * New doctor instance
     *
     * @param name Doctor name
     * @param speciality Doctor speciality
     */
    Doctor(String name, String speciality) {
        initId();
        this.name = name;
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
}
