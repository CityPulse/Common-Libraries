/**
 *
 */
package citypulse.commons.contextual_filtering.contextual_event_request;

import citypulse.commons.data.Coordinate;


/**
 * @author Thu-Le Pham
 * @date 1 Oct 2015
 */
public abstract class Place {

	/**
	 *
	 */
	PlaceType type;

	/**
	 *
	 */
	String placeId = "";

	/**
	 *
	 * @param type
	 */
	public Place(PlaceType type) {
		super();
		this.type = type;
	}

	public Place(PlaceType type, String placeId) {
		super();
		this.type = type;
		this.placeId = placeId;
	}

	public PlaceType getPlaceType() {
		return type;
	}

	public PlaceType getType() {
		return type;
	}

	public void setType(PlaceType type) {
		this.type = type;
	}

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	/**
	 * @return
	 */
	public abstract String toJSON();

	/**
	 *
	 * @return
	 */
	public abstract Coordinate getCentreCoordinate();

}
