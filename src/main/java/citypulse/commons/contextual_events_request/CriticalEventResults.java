package citypulse.commons.contextual_events_request;

import java.util.ArrayList;
import java.util.List;

public class CriticalEventResults {
	private List<ContextualEvent> contextualEvents;

	public CriticalEventResults() {
		setContextualEvents(new ArrayList<ContextualEvent>());
	}

	public CriticalEventResults(List<ContextualEvent> contextualEvents) {
		super();
		this.setContextualEvents(contextualEvents);
	}

	public List<ContextualEvent> getContextualEvents() {
		return contextualEvents;
	}

	public void setContextualEvents(List<ContextualEvent> contextualEvents) {
		this.contextualEvents = contextualEvents;
	}

	public void addEvent(ContextualEvent ce) {
		this.contextualEvents.add(ce);
	}
}
