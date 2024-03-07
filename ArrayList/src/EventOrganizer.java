import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.InputMismatchException; 
import java.util.Date;  

public class EventOrganizer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  
  
        System.out.print("Enter event ID: ");  
        String eventID = scanner.nextLine();  
  
        System.out.print("Enter event name: ");  
        String eventName = scanner.nextLine();  
  
        System.out.print("Enter event venue: ");  
        String eventVenue = scanner.nextLine();  
  
        System.out.print("Enter event date (YYYY-MM-DD): ");  
        String dateStr = scanner.nextLine();  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
        Date eventDate = null;  
        try {  
            eventDate = sdf.parse(dateStr);  
        } catch (ParseException e) {  
            System.out.println("Invalid date format. Please use YYYY-MM-DD.");  
            return;  
        }  
  
        Event event = new Event(eventID, eventName, eventVenue, eventDate);  
  
        boolean exit = false;  
        while (!exit) {  
            System.out.println("\nEvent Organizer Menu");  
            System.out.println("1. Add Attendee");  
            System.out.println("2. Remove Attendee");  
            System.out.println("3. Update Attendee");  
            System.out.println("4. Find Attendee");  
            System.out.println("5. Display Event Details");  
            System.out.println("6. Exit");  
  
            System.out.print("Enter your choice: ");  
            int choice = scanner.nextInt();  
            scanner.nextLine(); // Consume newline left-over  
  
            switch (choice) {  
                case 1:  
                    System.out.print("Enter attendee name: ");  
                    String attendeeName = scanner.nextLine();  
                    event.addAttendee(attendeeName);  
                    System.out.println("Attendee added successfully.");  
                    break;  
  
                case 2:  
                    System.out.print("Enter attendee name to remove: ");  
                    String removeName = scanner.nextLine();  
                    event.removeAttendee(removeName);  
                    System.out.println("Attendee removed successfully.");  
                    break;  
  
                case 3:  
                    System.out.print("Enter old attendee name: ");  
                    String oldName = scanner.nextLine();  
                    System.out.print("Enter new attendee name: ");  
                    String newName = scanner.nextLine();  
                    event.updateAttendee(oldName, newName);  
                    System.out.println("Attendee updated successfully.");  
                    break;  
  
                case 4:  
                    System.out.print("Enter attendee name to find: ");  
                    String findName = scanner.nextLine();  
                    String result = event.findAttendee(findName);  
                    System.out.println(result);  
                    break;  
  
                case 5:  
                    System.out.println(event.toString());  
                    break;  
  
                case 6:  
                    exit = true;  
                    break;  
  
                default:  
                    System.out.println("Invalid choice. Please try again.");  
            }  
        }  
  
        scanner.close();  
    }  
}
    
