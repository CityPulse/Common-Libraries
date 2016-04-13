/**
 *
 */
package citypulse.commons.contextual_filtering.contextual_event_request;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Thu-Le Pham
 * @date 30 Sep 2015
 */
public class RankingFactor {

	/**
	 *
	 */
	RankingFactorType type;

	/**
	 *
	 */
	Set<RankingElement> rankingElements = new HashSet<RankingElement>();

	public RankingFactor(RankingFactorType type,
			Set<RankingElement> rankingElements) {
		super();
		this.type = type;
		this.rankingElements = rankingElements;
	}

	public RankingFactorType getType() {
		return type;
	}

	public void setType(RankingFactorType type) {
		this.type = type;
	}

	public Set<RankingElement> getRankingElements() {
		return rankingElements;
	}

	public void setRankingElements(Set<RankingElement> rankingElements) {
		this.rankingElements = rankingElements;
	}

	@Override
	public String toString() {
		return "RankingFactor [type=" + type + ", rankingElements="
				+ rankingElements + "]";
	}

}
