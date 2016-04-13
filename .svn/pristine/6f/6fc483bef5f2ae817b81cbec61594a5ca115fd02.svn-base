/**
 *
 */
package citypulse.commons.contextual_filtering.contextual_event_request;

import citypulse.commons.data.Coordinate;

import com.google.gson.Gson;

/**
 * @author Thu-Le Pham
 * @date 1 Oct 2015
 */
public class Point extends Place {

	/**
	 *
	 */
	Coordinate point;

	/**
	 * @param type
	 */
	public Point() {
		super(PlaceType.POINT);
	}

	/**
	 *
	 * @param point
	 */
	public Point(Coordinate point) {
		super(PlaceType.POINT);
		this.point = point;
	}

	public Point(final double longitude, final double latitude) {
		super(PlaceType.POINT);
		this.point = new Coordinate(longitude, latitude);
	}

	public Coordinate getPoint() {
		return point;
	}

	public void setPoint(Coordinate point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Point [point=" + point + "]";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.insight_centre.urq.citypulse.wp5.contextual_filter.city_event_ontology
	 * .Place#toJSON()
	 */
	@Override
	public String toJSON() {
		return new Gson().toJson(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.insight_centre.urq.citypulse.wp5.contextual_filter.city_event_ontology
	 * .Place#getCentreCoordinate()
	 */
	@Override
	public Coordinate getCentreCoordinate() {
		return this.point;
	}

}
