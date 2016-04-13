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
public class ContextualEventRequest {

	/**
	 * Message type
	 */
	String messageType = "ContextualEventRequest";

	/**
	 *
	 * place of interest
	 */
	Place place;

	/**
	 * Filtering factors
	 */
	Set<FilteringFactor> filteringFactors = new HashSet<FilteringFactor>();

	/**
	 * Ranking Factor
	 */
	RankingFactor rankingFactor;

	/**
	 *
	 */
	public ContextualEventRequest() {
		super();
	}

	/**
	 *
	 * @param place
	 * @param filteringFactors
	 * @param rankingFactor
	 */
	public ContextualEventRequest(Place place,
			Set<FilteringFactor> filteringFactors, RankingFactor rankingFactor) {
		super();
		this.place = place;
		this.filteringFactors = filteringFactors;
		this.rankingFactor = rankingFactor;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public Set<FilteringFactor> getFilteringFactors() {
		return filteringFactors;
	}

	public void setFilteringFactors(Set<FilteringFactor> filteringFactors) {
		this.filteringFactors = filteringFactors;
	}

	public RankingFactor getRankingFactor() {
		return rankingFactor;
	}

	public void setRankingFactor(RankingFactor rankingFactor) {
		this.rankingFactor = rankingFactor;
	}

	@Override
	public String toString() {
		return "ContextualEventRequest [place=" + place + ", filteringFactors="
				+ filteringFactors + ", rankingFactor=" + rankingFactor + "]";
	}

}
