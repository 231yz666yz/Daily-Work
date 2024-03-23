public class MusicConcertEvent extends Event{  
    private boolean merchandiseRequired;  
    private double merchandiseCost;  
    private double musicConcertEventCost;
  
    public MusicConcertEvent(String eventID,String eventName,String eventLocation,String pointOfContact,int totalParticipants,int totalEventDays,double merchandiseCost) {  
        super(eventID,eventName,eventLocation,pointOfContact,totalParticipants,totalEventDays,totalEventDays);
        this.merchandiseCost = merchandiseCost;  
    }  
  
    public boolean isMerchandiseRequired(){
        return merchandiseRequired;
    }
    public void setMerchandiseRequired(boolean merchandiseRequired){
        this.merchandiseRequired=merchandiseRequired;
    }
    public double getMerchandiseCost(){
        return merchandiseCost;
    }
    public void setMerchandiseCost(double merchandiseCost){
        this.merchandiseCost=merchandiseCost;
    }
    public double getMusicConcertEventCost(){
        return musicConcertEventCost;
    }
    public void setMusicConcertEventCost(double musicConcertEventCost){
        this.musicConcertEventCost=musicConcertEventCost;
    }
    public void calculateEventCost(){
        musicConcertEventCost=getEventCost()+(getMerchandiseCost()*getTotalParticipants()*getTotalEventDays());
    }

    @Override  
    public String toString() {  
        return "Conference Event details:"+"\n"+
        "Event ID:"+getEventID()+"\n"+
        "Event Name:"+getEventName()+"\n"+
        "Event Location:"+getEventLocation()+"\n"+
        "Total Participants:"+getTotalParticipants()+"\n"+
        "Total MusicConcert Cost:"+musicConcertEventCost;
    }  
        
}  
