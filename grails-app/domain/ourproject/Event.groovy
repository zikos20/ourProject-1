package ourproject

import java.awt.Image
import javax.xml.ws.wsaddressing.W3CEndpointReference.Address

class Event {
	
	String title
	EventCategory eventCategory
	Date dateOFevent
	String description
	Double fee
	String contactInfo
	Image imageOFevent
	Address locationOFevent	
	
    static constraints = {
    }
}
