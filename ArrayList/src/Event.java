import java.util.ArrayList;  
import java.util.Date;  
 
 
  
class Event {  
    private String eventID;  
    private String eventName;  
    private String eventVenue;  
    private Date eventDate;  
    private ArrayList<String> eventAttendees;  
  
    public Event(String eventID, String eventName, String eventVenue, Date eventDate) {  
        this.eventID = eventID;  
        this.eventName = eventName;  
        this.eventVenue = eventVenue;  
        this.eventDate = eventDate;  
        this.eventAttendees = new ArrayList<>();  
    }  
  
    public String getEventID() {  
        return eventID;  
    }  
  
    public void setEventID(String eventID) {  
        this.eventID = eventID;  
    }  
  
    public String getEventName() {  
        return eventName;  
    }  
  
    public void setEventName(String eventName) {  
        this.eventName = eventName;  
    }  
  
    public String getEventVenue() {  
        return eventVenue;  
    }  
  
    public void setEventVenue(String eventVenue) {  
        this.eventVenue = eventVenue;  
    }  
  
    public Date getEventDate() {  
        return eventDate;  
    }  
  
    public void setEventDate(Date eventDate) {  
        this.eventDate = eventDate;  
    }  
  
    public ArrayList<String> getEventAttendees() {  
        return eventAttendees;  
    }  
  
    public void setEventAttendees(ArrayList<String> eventAttendees) {  
        this.eventAttendees = eventAttendees;  
    }  
  
    public void addAttendee(String attendeeName) {  
        eventAttendees.add(attendeeName);  
    }  
  
    public void removeAttendee(String attendeeName) {  
        eventAttendees.remove(attendeeName);  
    }  
  
    public void updateAttendee(String oldName, String newName) {  
        int index = eventAttendees.indexOf(oldName);  
        if (index != -1) {  
            eventAttendees.set(index, newName);  
        }  
    }  
  
    public String findAttendee(String attendeeName) {  
        int index = eventAttendees.indexOf(attendeeName);  
        if (index != -1) {  
            return "Attendee found.";  
        } else {  
            return "Attendee not found.";  
        }  
    }  
  
    public int getTotalAttendees() {  
        return eventAttendees.size();  
    }  
  
    @Override  
    public String toString() {  
        return "Event ID: " + eventID + "\n" +  
               "Event Name: " + eventName + "\n" +  
               "Event Venue: " + eventVenue + "\n" +  
               "Event Date: " + eventDate.toString() + "\n" +  
               "Attendees: " + eventAttendees.toString() + "\n" +  
               "Total Attendees: " + getTotalAttendees();  
    }  
} 
    