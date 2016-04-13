package citypulse.commons.contextual_filtering.city_event_ontology;

import it.unical.mat.embasp.mapper.Predicate;
import it.unical.mat.embasp.mapper.Term;
import citypulse.commons.contextual_filtering.contextual_event_request.Place;

/**
 * @author Thu-Le Pham
 *
 */
@Predicate("city_event")
public class CityEvent {

	/*
	 *
	 */
	@Term(1)
	String eventId;

	/*
	 * event catalog
	 */
	@Term(2)
	EventCategory eventCategory;

	/*
	 *
	 */
	EventType eventType;

	/*
	 *
	 */
	@Term(3)
	EventSource eventSource;

	/*
	 *
	 */
	int eventLevel;

	/*
	 *
	 */
	Place eventPlace;

	/*
	 *
	 */
	long eventTime;



	/*
	 *
	 */
	int contextualCriticality = -1;

	public CityEvent() {
		super();
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public EventCategory getEventCategory() {
		return eventCategory;
	}

	public void setEventCategory(EventCategory eventCategory) {
		this.eventCategory = eventCategory;
	}

	public EventSource getEventSource() {
		return eventSource;
	}

	public void setEventSource(EventSource eventSource) {
		this.eventSource = eventSource;
	}

	public long getEventTime() {
		return eventTime;
	}

	public void setEventTime(long eventTime) {
		this.eventTime = eventTime;
	}

	public int getEventLevel() {
		return eventLevel;
	}

	public void setEventLevel(int eventLevel) {
		this.eventLevel = eventLevel;
	}

	public Place getEventPlace() {
		return eventPlace;
	}

	public void setEventPlace(Place eventPlace) {
		this.eventPlace = eventPlace;
	}

	public int getContextualCriticality() {
		return contextualCriticality;
	}

	public void setContextualCriticality(int contextualCriticality) {
		this.contextualCriticality = contextualCriticality;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	@Override
	public String toString() {
		return "CityEvent [eventId=" + eventId + ", eventCategory="
				+ eventCategory + ", eventType=" + eventType + ", eventSource="
				+ eventSource + ", eventLevel=" + eventLevel + ", eventPlace="
				+ eventPlace + ", eventTime=" + eventTime
				+ ", contextualCriticality=" + contextualCriticality + "]";
	}


}
