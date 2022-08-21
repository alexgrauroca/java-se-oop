package ui;
import java.util.Scanner;

/**
 * User interface menu
 */
public class UiMenu {
    /**
     * Show main menu
     */
    public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Select an option");

        int response = 0;

        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                
                case 0:
                    System.out.println("Thanks for your visit");
                    break;
                
                default:
                    System.out.println("Please, select a correct option");
                    break;
            }
        } while(response != 0);
    }

    /**
     * Show patient menu
     */
    public static void showPatientMenu() {
        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    break;
                
                case 2:
                    System.out.println("::My appointments");
                    break;
                
                case 0:
                    showMenu();
                    break;
            
                default:
                    System.out.println("Please, select a correct option");
                    break;
            }
        } while (response != 0);
    }
}
