/**
 *
 */
package citypulse.commons.contextual_filtering.contextual_event_request;
/**
 * @author Thu-Le Pham
 * @date 1 Oct 2015
 */
public class RankingElementValue {
	/**
	 *
	 */
	int value;

	/**
	 *
	 * @param value
	 */
	public RankingElementValue(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "RankingElementValue [value=" + value + "]";
	}

}
