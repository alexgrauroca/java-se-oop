package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * UserSpecialist object
 */
public class UserSpecialist extends User {
    /**
     * UserSpecialist speciality
     */
    private String speciality;
    /**
     * List of user specialist available appointments
     */
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    /**
     * New user specialist instance
     *
     * @param name UserSpecialist name
     * @param email UserSpecialist email
     * @param speciality UserSpecialist speciality
     */
    UserSpecialist(String name, String email, String speciality) {
        super(name, email);
        this.speciality = speciality;
    }

    /**
     * Add new available appointment to the user specialist
     *
     * @param date Available appointment date
     * @param time Available appointment time
     */
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new UserSpecialist.AvailableAppointment(date, time));
    }

    /**
     * Get user specialist speciality
     *
     * @return UserSpecialist speciality
     */
    public String getSpeciality() {
        return this.speciality;
    }

    /**
     * Set user specialist speciality
     *
     * @param speciality UserSpecialist speciality
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * Get user specialist available appointments list
     *
     * @return UserSpecialist available appointements list
     */
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + this.speciality + "\nAvailable: " + this.availableAppointments.toString();
    }
    /**
     * UserSpecialist available appointment object
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
         * Init the user specialist id
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
