package citypulse.commons.contextual_events_request;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import citypulse.commons.data.Coordinate;

@XmlRootElement
public class EventRequest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	List<Coordinate> area;

	public EventRequest(List<Coordinate> area) {
		super();
		this.area = area;
	}

	public EventRequest() {
		super();
	}

	public List<Coordinate> getArea() {
		return area;
	}

	public void setArea(List<Coordinate> area) {
		this.area = area;
	} 
	
	
}
