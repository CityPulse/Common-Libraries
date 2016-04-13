/**
 *
 */
package citypulse.commons.contextual_filtering.user_context_ontology;

import citypulse.commons.data.Coordinate;

/**
 * @author Thu-Le Pham
 * @date 12 Oct 2015
 */
public class UserGPSCoordinate {
	/**
	 *
	 */
	String messageType = "UserGPSCoordinate";

	/**
	 *
	 */
	Coordinate userCoordinate;

	/**
	 *
	 * @param userCoordinate
	 */
	public UserGPSCoordinate(Coordinate userCoordinate) {
		super();
		this.userCoordinate = userCoordinate;
	}

	/**
	 *
	 * @param longitude
	 * @param latitude
	 */
	public UserGPSCoordinate(final double longitude, final double latitude) {
		super();
		this.userCoordinate = new Coordinate(longitude, latitude);
	}

	public Coordinate getUserCoordinate() {
		return userCoordinate;
	}

	public void setUserCoordinate(Coordinate userCoordinate) {
		this.userCoordinate = userCoordinate;
	}

	@Override
	public String toString() {
		return "UserGPSCoordinate [messageType=" + messageType
				+ ", userCoordinate=" + userCoordinate + "]";
	}

}
