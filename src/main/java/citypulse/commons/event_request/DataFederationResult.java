package citypulse.commons.event_request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import citypulse.commons.event_request.DataFederationRequest.DataFederationPropertyType;

//import citypulse.commons.event_request.DataFederationRequest.DataFederationPropertyType;

public class DataFederationResult {
	/**
	 * Results will contain multiple values for one-shot query (one value for each sensor)
	 * 
	 * and only one value for continous query (as an aggregated average value)
	 */
	private HashMap<DataFederationPropertyType, List<String>> result;

	public DataFederationResult() {
		this.result = new HashMap<DataFederationPropertyType, List<String>>();
		// this.result.put(PropertyType.air_quality, new ArrayList<String>());
	}

	public DataFederationResult(HashMap<DataFederationPropertyType, List<String>> result) {
		super();
		this.result = result;
	}

	public HashMap<DataFederationPropertyType, List<String>> getResult() {
		return result;
	}

	public void setResult(HashMap<DataFederationPropertyType, List<String>> result) {
		this.result = result;
	}
}
