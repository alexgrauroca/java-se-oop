package model;

/**
 * Doctor object
 */
public class Doctor extends UserSpecialist {
    /**
     * New doctor instance
     *
     * @param name Doctor name
     * @param email Doctor email
     * @param speciality Doctor speciality
     */
    Doctor(String name, String email, String speciality) {
        super(name, email, speciality);
    }
}
