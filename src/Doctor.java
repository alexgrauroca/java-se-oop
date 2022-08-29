import java.util.ArrayList;
import java.util.Date;

/**
 * Doctor object
 */
public class Doctor extends User {
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
        super(name, email);
        this.speciality = speciality;
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
        System.out.println(this.getName());
    }

    /**
     * Get doctor speciality
     *
     * @return Doctor speciality
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

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + this.speciality + "\nAvailable: " + this.availableAppointments.toString();
    }
    /**
     * Doctor available appointment object
     */
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
    
        @Override
        public String toString() {
            return "\nAvailable appointment\nDate: " + this.date + ", Time: " + this.time + "\n";
        }
    }
}
