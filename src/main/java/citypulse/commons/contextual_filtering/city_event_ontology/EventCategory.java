package citypulse.commons.contextual_filtering.city_event_ontology;

/**
 * @author Thu-Le Pham
 *
 */
public class EventCategory {

	/**
	 *
	 */
	String categoryName;

	/**
	 *
	 * @param categoryName
	 */
	public EventCategory(String categoryName) {
		super();
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return categoryName;
	}
}
