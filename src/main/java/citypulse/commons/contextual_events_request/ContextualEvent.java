package citypulse.commons.contextual_events_request;

import java.io.Serializable;
import java.util.UUID;

import citypulse.commons.data.Coordinate;


/*
 * @author: Thu-Le Pham
 * This class defines an event in Contextual Filtering Component
 */
public class ContextualEvent implements Serializable {

	private String ceID = UUID.randomUUID().toString();
	private String ceType = "";
	private String ceName = "";
	private long ceTime;
	private Coordinate ceCoordinate;
	private int ceLevel;

	private int ceWeight = -1;

	public ContextualEvent() {
		super();
	}

	public ContextualEvent(String id, String type, String name, long time,
			Coordinate coordinate, int ceLevel) {
		this.ceID = id;
		this.ceType = type;
		this.ceName = name;
		this.ceTime = time;
		this.ceCoordinate = coordinate;
		this.ceLevel=ceLevel;
	}

	public ContextualEvent(String ceType, String ceName, long ceTime,
			Coordinate ceCoordinate, int ceLevel) {
		super();
		this.ceType = ceType;
		this.ceName = ceName;
		this.ceTime = ceTime;
		this.ceCoordinate = ceCoordinate;
		this.ceLevel=ceLevel;
	}

	public ContextualEvent(ContextualEvent e) {
		this.ceID = e.ceID;
		this.ceType = e.ceType;
		this.ceName = e.ceName;
		this.ceTime = e.ceTime;
		this.ceCoordinate = new Coordinate(e.ceCoordinate.getLongitude(), e
				.getCeCoordinate().getLatitude());
		this.ceWeight = e.ceWeight;
		this.ceLevel=e.ceLevel;
	}

	public String getCeID() {
		return ceID;
	}

	public void setCeID(String ceID) {
		this.ceID = ceID;
	}

	public String getCeName() {
		return ceName;
	}

	public void setCeName(String ceName) {
		this.ceName = ceName;
	}

	public long getCeTime() {
		return ceTime;
	}

	public void setCeTime(long ceTime) {
		this.ceTime = ceTime;
	}

	public Coordinate getCeCoordinate() {
		return ceCoordinate;
	}

	public void setCeCoordinate(Coordinate ceCoordinate) {
		this.ceCoordinate = ceCoordinate;
	}

	public int getCeWeight() {
		return ceWeight;
	}

	public void setCeWeight(int ceWeight) {
		this.ceWeight = ceWeight;
	}

	public String getCeType() {
		return ceType;
	}

	public void setCeType(String ceType) {
		this.ceType = ceType;
	}

	public int getCeLevel() {
		return ceLevel;
	}

	public void setCeLevel(int ceLevel) {
		this.ceLevel = ceLevel;
	}

	public String parseToAspFacts(){
		final StringBuilder asp = new StringBuilder();
		asp.append("contextual_event(").append("\"").append(this.ceID)
				.append("\"").append(",")
				.append("\"").append(this.ceType).append("\"").append(",")
				.append("\"").append(this.ceName).append("\"")
				.append(",").append(this.ceLevel)
				.append(",").append(this.ceTime).append(",").append("\"")
				.append(this.ceCoordinate.toString()).append("\"").append(").");
		return asp.toString();
	}

	@Override
	public String toString() {
		final String t = String
				.format("Event[id = %s; type = %s; name = %s; level = %d; coor = %s; weight = %d]\n",
						this.ceID, this.ceType, this.ceName, this.ceLevel,
						this.ceCoordinate.toString(), this.ceWeight);
		return t;
	}

}
