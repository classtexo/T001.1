package com.java.lessons.t001.staticabstract;
import com.java.lessons.t001.staticabstract.lib.eventsRegister;
import com.java.lessons.t001.staticabstract.lib.IFaceEventsHandling;

/*
    aplikace "static" - class event obsahuje static counter, tim padem je v ramci tridy unikatni pocitadlo. Zustava ve tride
    a nikoliv ve vytvorenych objektech event.
    
    aplikace Interface - pro praci s udalostmi. Definuje seznam vyzadovanych metod pro praci s eventem
    
    aplikace overloading - metoda "updateEvent" je definovana vicekrat  pro mozne varianty fieldu udalosti.
                           napr. update name/description, status,...apod.
    
    aplikace "private" -  variable class event, private metoda event.processCompletion ktera je uzavrena
                          a pouze interni pravidla v tride umozni "Close" eventu.
 
*/

public class main {

	public static void main(String[] args) {
		
		System.out.println("Experiment Interface/Abstract/Throw...");
		
		IFaceEventsHandling eReg = new eventsRegister();
		
		eReg.updateEvent(eReg.addEvent(), "Event #0", "Zalozit tridy");
		eReg.updateEvent(eReg.addEvent(), "Event #1", "Vyzkouset Interface");
		eReg.updateEvent(eReg.addEvent(), "Event #2", "Vyzkouset Abstract");
		eReg.updateEvent(eReg.addEvent(), "Event #3", "Vyzkouset Throw Error");
		
		eReg.updateEvent(2, "finished");
		eReg.updateEvent(3, "finished");
		
		// Doprcic! to si nemuzu nad ramec IFace dodefinovat vlastni metody?
		// eReg.showEvents();
		// Najit si DownCasting / UpCasting
		
		System.out.println("Status event    : " + eReg.getEventStatus(2));
		System.out.println("Events count    : " + eReg.eventsCount());
		System.out.println("Events closed   : " + eReg.eventsCount("closed"));
		
	}

}
