package model;

/**
 * Nurse object
 */
public class Nurse extends UserSpecialist {
    /**
     * New nurse instance
     *
     * @param name Nurse name
     * @param email Nurse email
     * @param speciality Nurse speciality
     */
    Nurse(String name, String email, String speciality) {
        super(name, email, speciality);
    }
}
