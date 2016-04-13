package citypulse.commons.contextual_filtering.city_event_ontology;

import java.util.ArrayList;
import java.util.List;

public class CriticalEventResults {
	private List<CityEvent> contextualEvents;

	public CriticalEventResults() {
		setContextualEvents(new ArrayList<CityEvent>());
	}

	public CriticalEventResults(List<CityEvent> contextualEvents) {
		super();
		this.setContextualEvents(contextualEvents);
	}

	public List<CityEvent> getContextualEvents() {
		return contextualEvents;
	}

	public void setContextualEvents(List<CityEvent> contextualEvents) {
		this.contextualEvents = contextualEvents;
	}

	public void addEvent(CityEvent ce) {
		this.contextualEvents.add(ce);
	}

	@Override
	public String toString() {
		return "CriticalEventResults [contextualEvents=" + contextualEvents
				+ "]";
	}

}
