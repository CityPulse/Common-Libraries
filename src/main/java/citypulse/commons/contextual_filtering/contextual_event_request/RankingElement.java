/**
 *
 */
package citypulse.commons.contextual_filtering.contextual_event_request;
/**
 * @author Thu-Le Pham
 * @date 30 Sep 2015
 */
public class RankingElement {

	/**
	 *
	 */
	RankingElementName name;

	/**
	 *
	 */
	RankingElementValue value;

	/**
	 *
	 * @param name
	 * @param value
	 */
	public RankingElement(RankingElementName name, RankingElementValue value) {
		super();
		this.name = name;
		this.value = value;
	}

	public RankingElementName getName() {
		return name;
	}

	public void setName(RankingElementName name) {
		this.name = name;
	}

	public RankingElementValue getValue() {
		return value;
	}

	public void setValue(RankingElementValue value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "RankingElement [name=" + name + ", value=" + value + "]";
	}


}
