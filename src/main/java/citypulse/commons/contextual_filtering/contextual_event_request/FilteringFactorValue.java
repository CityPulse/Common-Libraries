/**
 *
 */
package citypulse.commons.contextual_filtering.contextual_event_request;
/**
 * @author Thu-Le Pham
 * @date 1 Oct 2015
 */
public class FilteringFactorValue {

	/**
	 *
	 */
	String value;

	/**
	 *
	 * @param value
	 */
	public FilteringFactorValue(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "FilteringFactorValue [value=" + value + "]";
	}

}
