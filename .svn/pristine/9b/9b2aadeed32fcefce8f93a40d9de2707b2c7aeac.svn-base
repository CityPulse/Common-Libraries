package citypulse.commons.event_request;

import java.util.List;

import citypulse.commons.data.Coordinate;

public class DataFederationRequest {
	/**
	 * QoS constraint from user/application, default settings will be used if not specified
	 */
	private QosVector constraint;

	/**
	 * indicate if the query is a one-shot query or continous one
	 */
	private boolean continuous;

	/**
	 * specify the queried route, query results will be sensor readings found aroud the route.
	 */
	private List<Coordinate> route;

	/**
	 * specify the queried properties;
	 */
	private List<DataFederationPropertyType> propertyTypes;

	/**
	 * specify the Qos weights, will be set equally for all qos parameters if not specified.
	 */
	private WeightVector weight;

	/**
	 * @author feng
	 * 
	 *         list of property types
	 */
	public enum DataFederationPropertyType {
		air_quality, parking_availability, parking_cost, average_speed;
	}

	public DataFederationRequest(List<DataFederationPropertyType> propertyTypes, List<Coordinate> route,
			boolean continuous, QosVector constraint, WeightVector weight) {
		super();
		this.propertyTypes = propertyTypes;
		this.route = route;
		this.continuous = continuous;
		this.constraint = constraint;
		this.weight = weight;
	}

	public QosVector getConstraint() {
		return constraint;
	}

	public List<Coordinate> getCoordinates() {
		return route;
	}

	public List<DataFederationPropertyType> getPropertyTypes() {
		return propertyTypes;
	}

	public WeightVector getWeight() {
		return weight;
	}

	public boolean isContinuous() {
		return continuous;
	}

	public void setConstraint(QosVector constraint) {
		this.constraint = constraint;
	}

	public void setContinuous(boolean continuous) {
		this.continuous = continuous;
	}

	public void setCoordinates(List<Coordinate> route) {
		this.route = route;
	}

	public void setPropertyTypes(List<DataFederationPropertyType> propertyTypes) {
		this.propertyTypes = propertyTypes;
	}

	public void setWeight(WeightVector weight) {
		this.weight = weight;
	}

}
