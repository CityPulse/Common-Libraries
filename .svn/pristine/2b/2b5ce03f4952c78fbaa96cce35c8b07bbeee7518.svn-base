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
public class Area extends Place {

	/**
	 *
	 */
	List<Coordinate> area;

	/**
	 * @param
	 */
	public Area() {
		super(PlaceType.AREA);
		area = new ArrayList<Coordinate>();
	}

	/**
	 *
	 * @param area
	 */
	public Area(List<Coordinate> area) {
		super(PlaceType.AREA);
		this.area = area;
	}

	public List<Coordinate> getArea() {
		return area;
	}

	public void setArea(List<Coordinate> area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Area [area=" + area + "]";
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
		// TODO define centre coordinate
		return this.area.get(0);
	}

}
