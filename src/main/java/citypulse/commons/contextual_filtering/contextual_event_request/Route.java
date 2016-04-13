/**
 *
 */
package citypulse.commons.contextual_filtering.contextual_event_request;

import java.util.ArrayList;
import java.util.List;

import citypulse.commons.data.Coordinate;

import com.google.gson.Gson;

/**
 * @author Thu-Le Pham
 * @date 1 Oct 2015
 */
public class Route extends Place {

	/**
	 *
	 */
	List<Coordinate> route;

	/**
	 *
	 */
	long length;

	/**
	 * @param
	 */
	public Route() {
		super(PlaceType.ROUTE);
		route = new ArrayList<Coordinate>();
	}

	/**
	 *
	 * @param route
	 */
	public Route(List<Coordinate> route) {
		super(PlaceType.ROUTE);
		this.route = route;
	}

	public Route(String routeId, List<Coordinate> route, long length) {
		super(PlaceType.ROUTE, routeId);
		this.route = route;
		this.length = length;
	}

	public List<Coordinate> getRoute() {
		return route;
	}

	public void setRoute(List<Coordinate> route) {
		this.route = route;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Route [type=" + type + ", placeId=" + placeId + ", route="
				+ route + ", length=" + length + "]";
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
		// TODO: define what is center coordinate
		return this.route.get(0);
	}

}
