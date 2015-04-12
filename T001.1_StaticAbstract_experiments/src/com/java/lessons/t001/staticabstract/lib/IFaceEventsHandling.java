package com.java.lessons.t001.staticabstract.lib;
import java.util.Date;

public interface IFaceEventsHandling {
	  public int    addEvent();

	  // Tady radeji vystavit pojitko do eventu , neni to tak efektivni.
	  // Navic vyzadovat implementaci po programateroch at to delaji 3x je na prd
	  
	  public void   updateEvent(int id, Date fromDate);
	  public void   updateEvent(int id, String updateVal);
	  public void   updateEvent(int id, String name, String description);
	  
	  public String getEventStatus(int id);
	  public int    eventsCount();
	  public int    eventsCount(String eventStatus);
	  
	  // chybi metoda na vyhledani eventu
	  //  
	  
	}
