/**
 * Doctor object
 */
public class Doctor {
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
     */
    Doctor() {
        System.out.println("Building a doctor object");
    }

    /**
     * New doctor instance
     *
     * @param name
     */
    Doctor(String name) {
        System.out.println("The doctor name is: " + name);
    }

    /**
     * Print the doctor name
     */
    public void showName() {
        System.out.println(name);
    }
}
