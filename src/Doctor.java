import java.util.ArrayList;
import java.util.Date;

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
     * List of doctor available appointments
     */
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

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
     * Add new available appointment to the doctor
     *
     * @param date Available appointment date
     * @param time Available appointment time
     */
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
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

    /**
     * Get doctor available appointments list
     *
     * @return Doctor available appointements list
     */
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }
        
    private static class AvailableAppointment {
        /**
         * Id autoincremental control
         */
        private static int nextId = 0;
        /**
         * Available appointment id
         */
        private int id;
        /**
         * Available appointment date
         */
        private Date date;
        /**
         * Available appointment time
         */
        private String time;

        /**
         * New available appointment instance
         *
         * @param date Available appointment date
         * @param time Available appointment time
         */
        public AvailableAppointment(Date date, String time) {
            initId();
            this.date = date;
            this.time = time;
        }

        /**
         * Init the doctor id
         */
        private void initId() {
            nextId++;
            this.id = nextId;
        }

        /**
         * Get available appointment id
         *
         * @return Available appointment id
         */
        public int getId() {
            return id;
        }

        /**
         * Get available appointment date
         *
         * @return Available appointment date
         */
        public Date getDate() {
            return date;
        }

        /**
         * Set available appointment date
         *
         * @param date Available appointment date
         */
        public void setDate(Date date) {
            this.date = date;
        }

        /**
         * Get available appointment time
         *
         * @return Available appointment time
         */
        public String getTime() {
            return time;
        }

        /**
         * Set available appointment time
         *
         * @param time Available appointment time
         */
        public void setTime(String time) {
            this.time = time;
        }
    }
}
