/**
 *
 */
package citypulse.commons.contextual_filtering.contextual_event_request;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Thu-Le Pham
 * @date 29 Sep 2015
 */
public class FilteringFactor {
	/**
	 * Filtering factor name
	 */
	FilteringFactorName name;

	/**
	 *
	 */
	Set<FilteringFactorValue> values = new HashSet<FilteringFactorValue>();

	/**
	 *
	 * @param name
	 * @param values
	 */
	public FilteringFactor(FilteringFactorName name,
			Set<FilteringFactorValue> values) {
		super();
		this.name = name;
		this.values = values;
	}

	public FilteringFactorName getName() {
		return name;
	}

	public void setName(FilteringFactorName name) {
		this.name = name;
	}

	public Set<FilteringFactorValue> getValues() {
		return values;
	}

	public void setValues(Set<FilteringFactorValue> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "FilteringFactor [name=" + name + ", values=" + values + "]";
	}



}
