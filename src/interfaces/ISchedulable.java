package interfaces;

import java.util.Date;

/**
 * Schedulable interface
 */
public interface ISchedulable {
    /**
     * Schedule method
     *
     * @param date Schedule date
     * @param time Schedule time
     */
    void schedule(Date date, String time);
}
