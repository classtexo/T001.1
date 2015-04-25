package com.java.lessons.t001.staticabstract.lib;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;




public class eventsRegister implements IFaceEventsHandling {
   private List<event> collectionEvents;
   private static int eventsCount;
   private static int eventId;
   
   public eventsRegister() {
	   List<event> collectionEvents = new ArrayList<event>(); 
	   this.collectionEvents = collectionEvents;
	   eventsCount = 0;
	   eventId = -1;
   }
   
   public int addEvent() {
	   eventId++;
	   event newEvent = new event(eventId); 
	   newEvent.setName("?");
	   newEvent.setFrom(new Date(0));
	   this.collectionEvents.add((event) newEvent);
	   eventsCount++;
	   return  eventId;
   }
 
public void updateEvent(int id, Date fromDate) {
    event swapRecord = new event(); 
    swapRecord.id = id;
    swapRecord.setFrom(fromDate);
    updateRecord(swapRecord);
}
public void updateEvent(int id, String eventStatus) {
    event swapRecord = new event(); 
    swapRecord.id=id;
    swapRecord.setEventStatus(eventStatus);
    //if (eventStatus.equals("finished")) swapRecord.isClosed = true;
    updateRecord(swapRecord);
}
public void updateEvent(int id, String name, String description) {
    event swapRecord = new event(); 
    swapRecord.id=id;
    swapRecord.setName(name);
    swapRecord.setDescription(description);
    updateRecord(swapRecord);
}

protected void updateRecord(event swap) {
	event origRecord = new event();
	origRecord = this.collectionEvents.get(swap.id);
	if (swap.getFrom() != null )        {origRecord.setFrom(swap.getFrom());}
	if (swap.getName() != null )        {origRecord.setName(swap.getName());}
	if (swap.getDescription() != null ) {origRecord.setDescription(swap.getDescription());}
	if (swap.getEventStatus() != null ) {origRecord.setEventStatus(swap.getEventStatus());}
	if (swap.getIsClosed() ) {origRecord.setIsClosed(true);}
	this.collectionEvents.set(swap.id,origRecord);
}

public String getEventStatus(int id) {
	event theRecord = new event();
	theRecord = collectionEvents.get(id);
	return theRecord.getEventStatus();
}

public int eventsCount() {
return collectionEvents.size();
}

public int eventsCount(String eventStatus) {
 int iCount=0;	
 for (event evRecord : collectionEvents) {
	  if (evRecord.getEventStatus().equals(eventStatus)) iCount++;
 }
	return iCount;
}


//toto neni dobre reseni viz metoda event.toStrin() co je dopsana po korekci s Davidem
public void showEvents() {
	 System.out.println("\n=======================================================================================\n");
	 for (event evRecord : this.collectionEvents) {
		  System.out.println("Event     ID" + evRecord.id);
		  System.out.println("          " + evRecord.getName());
		  System.out.println("          " + evRecord.getDescription());
		  System.out.println("     date " + evRecord.getFrom());
		  System.out.println("   status " + evRecord.getEventStatus());
		  System.out.println("");
	 }
	 System.out.println("=======================================================================================\n");
}
   
}
