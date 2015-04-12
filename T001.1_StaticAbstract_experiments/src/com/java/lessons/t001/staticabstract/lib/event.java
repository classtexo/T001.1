package com.java.lessons.t001.staticabstract.lib;
import java.util.Date;

public class event {
 public int id = -1;
 private String name;
 private String description;
 private Date from;
 private String eventStatus; //created,confirmed,inprogress,finished,closed
 private boolean isClosed = false;
 private static int idInc = 0;

 public event(int eventId, String eventName, Date fromDate) {
	 this.id=eventId;
	 
	 this.id=idInc;
	 idInc++;
	 
	 this.name=eventName;
	 this.from=fromDate;
	 this.eventStatus="created";
 }

 
// Overriding - nadefinuji si vlastni ToString 
// ALT-SHIFT-S vybrat "toString"
 
@Override
public String toString() {
	return "event [id=" + id + ", name=" + name + ", description="
			+ description + ", from=" + from + ", eventStatus=" + eventStatus
			+ ", isClosed=" + isClosed + "]";
}

public event(int eventId, String eventName, Date fromDate, String eventDescription) {
	 this.id=eventId;

	 this.id=idInc;
	 idInc++;
	 
	 this.name=eventName;
	 this.from=fromDate;
	 this.description=eventDescription;
	 this.eventStatus="created";
 } 
 
 public event(int eventId) {
	 this.id=eventId;
	 
	 this.id=idInc;
	 idInc++;
	 
	 this.name="<<unknown>>";
	 this.description="<<unknown>>";
	 this.eventStatus="error";
 }  
 
 public event() {
  // idInc++;
 } 
 
// Protected = viditelne jen v package!!! 
protected void processCompletion() {
  if ( this.eventStatus.contains("finished") ) {
	   this.isClosed = true;
	   this.eventStatus = "closed";
	   System.out.println("Event " + this.id + " set to closed (auto)!");
  }
}
 
 
public String getName() {
	return this.name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Date getFrom() {
	return this.from;
}
public void setFrom(Date from) {
	this.from = from;
}

public String getEventStatus() {
	return this.eventStatus;
}
public void setEventStatus(String eventStatus) {
	this.eventStatus = eventStatus;
	this.processCompletion();
}

public boolean getIsClosed() {
	return this.isClosed;
}
public void setIsClosed(boolean booStatus) {
	this.isClosed = booStatus;
}



 
}

// dodelat vlastni error handling;
