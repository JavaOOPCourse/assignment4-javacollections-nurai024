package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        appointments.clear();

        appointments.add("Appointment: Math advisor - 10:00");
        appointments.add("Appointment: CS advisor - 11:30");
        appointments.add("Appointment: English advisor - 13:00");

        // urgent in the beginning
        appointments.addFirst("URGENT Appointment: Dean office - 09:00");
    }

    public void cancelLast() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments to cancel.");
            return;
        }
        String removed = appointments.removeLast();
        System.out.println("Canceled last appointment: " + removed);
    }

    public void showFirstAndLast() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
            return;
        }
        System.out.println("First appointment: " + appointments.getFirst());
        System.out.println("Last appointment: " + appointments.getLast());
    }

    public void printAppointments() {
        System.out.println("=== Appointments ===");
        Iterator<String> it = appointments.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}