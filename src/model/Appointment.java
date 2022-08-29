package model;

import java.util.Date;

/**
 * Appointment object
 */
public class Appointment {
    /**
     * Id autoincremental control
     */
    private static int nextId = 0;    

    /**
     * Appointment id
     */
    private int id;
    /**
     * Appointment related patient
     */
    private Patient patient;
    /**
     * Appointment related specialist
     */
    private UserSpecialist specialist;
    /**
     * Appointment date
     */
    private Date date;
    /**
     * Appointment time
     */
    private String time;

    /**
     * New appointment instance
     */
    Appointment() {
        initId();
    }

    /**
     * Init the appointment id
     */
    private void initId() {
        nextId++;
        this.id = nextId;
    }
    
    /**
     * Get appointment id
     *
     * @return Appointment id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Get appointment related patient
     *
     * @return Appointment related patient
     */
    public Patient getPatient() {
        return this.patient;
    }

    /**
     * Set appointment related patient
     *
     * @param patient Appointment related patient
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * Get appointment related specialist
     *
     * @return Appointment related specialist
     */
    public UserSpecialist getSpecialist() {
        return this.specialist;
    }

    /**
     * Set appointment related specialist
     *
     * @param specialist Appointment related specialist
     */
    public void setSpecialist(UserSpecialist specialist) {
        this.specialist = specialist;
    }

    /**
     * Get appointment date
     *
     * @return Appointment date
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Set appointment date
     *
     * @param date Appointment date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Get appointment time
     *
     * @return Appointment time
     */
    public String getTime() {
        return this.time;
    }

    /**
     * Set appointment time
     *
     * @param time Appointment time
     */
    public void setTime(String time) {
        this.time = time;
    }
}
