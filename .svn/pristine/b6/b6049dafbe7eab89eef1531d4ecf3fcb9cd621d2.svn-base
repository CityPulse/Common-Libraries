/**
 *
 */
package citypulse.commons.contextual_filtering;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import citypulse.commons.contextual_filtering.city_event_ontology.EventSource;
import citypulse.commons.contextual_filtering.contextual_event_request.ContextualEventRequest;
import citypulse.commons.contextual_filtering.contextual_event_request.FilteringFactor;
import citypulse.commons.contextual_filtering.contextual_event_request.FilteringFactorName;
import citypulse.commons.contextual_filtering.contextual_event_request.FilteringFactorValue;
import citypulse.commons.contextual_filtering.contextual_event_request.Place;
import citypulse.commons.contextual_filtering.contextual_event_request.PlaceAdapter;
import citypulse.commons.contextual_filtering.contextual_event_request.Point;
import citypulse.commons.contextual_filtering.contextual_event_request.RankingElement;
import citypulse.commons.contextual_filtering.contextual_event_request.RankingElementName;
import citypulse.commons.contextual_filtering.contextual_event_request.RankingElementValue;
import citypulse.commons.contextual_filtering.contextual_event_request.RankingFactor;
import citypulse.commons.contextual_filtering.contextual_event_request.RankingFactorType;
import citypulse.commons.contextual_filtering.contextual_event_request.Route;
import citypulse.commons.data.Coordinate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Thu-Le Pham
 * @date 13 Oct 2015
 */
public class ContextualEventRequestExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(generateContextualEventRequest1());
		System.out.println(generateContextualEventRequest2());
	}

	/**
	 *
	 * @return
	 */
	private static String generateContextualEventRequest1() {
		/**
		 * ContextualEventRequest example
		 */

		/*
		 * Place of interest
		 */
		final Place place = new Point(1, 1);

		/*
		 * Filtering factors
		 */
		final Set<FilteringFactor> filteringFactors = new HashSet<FilteringFactor>();

		final Set<FilteringFactorValue> filteringFactorValueEventSource = new HashSet<FilteringFactorValue>();
		filteringFactorValueEventSource.add(new FilteringFactorValue(
				EventSource.SENSOR.toString()));
		filteringFactorValueEventSource.add(new FilteringFactorValue(
				EventSource.SOCIAL_NETWORK.toString()));
		FilteringFactor filteringFactor = new FilteringFactor(
				FilteringFactorName.EVENT_SOURCE,
				filteringFactorValueEventSource);
		filteringFactors.add(filteringFactor);

		final Set<FilteringFactorValue> filteringFactorValueCategory = new HashSet<FilteringFactorValue>();
		filteringFactorValueCategory
				.add(new FilteringFactorValue("TrafficJam"));
		filteringFactorValueCategory.add(new FilteringFactorValue(
				"PublicParking"));
		filteringFactor = new FilteringFactor(
				FilteringFactorName.EVENT_CATEGORY,
				filteringFactorValueCategory);
		filteringFactors.add(filteringFactor);

		final Set<FilteringFactorValue> filteringFactorValueActivity = new HashSet<FilteringFactorValue>();
		filteringFactorValueActivity
				.add(new FilteringFactorValue("CarCommute"));
		filteringFactorValueActivity
				.add(new FilteringFactorValue("BikeCommute"));
		filteringFactor = new FilteringFactor(FilteringFactorName.ACTIVITY,
				filteringFactorValueActivity);
		filteringFactors.add(filteringFactor);

		/*
		 * Ranking factor
		 */
		final Set<RankingElement> rankingElements = new HashSet<RankingElement>();
		rankingElements.add(new RankingElement(RankingElementName.DISTANCE,
				new RankingElementValue(70)));
		rankingElements.add(new RankingElement(RankingElementName.EVENT_LEVEL,
				new RankingElementValue(30)));

		final RankingFactor rankingFactor = new RankingFactor(
				RankingFactorType.LINEAR, rankingElements);

		/*
		 * create a ContextualEventRequest
		 */
		final ContextualEventRequest request = new ContextualEventRequest(
				place, filteringFactors, rankingFactor);

		/*
		 * Convert to Gson string
		 */
		final GsonBuilder builder = new GsonBuilder();
		builder.registerTypeAdapter(Place.class, new PlaceAdapter());
		final Gson gson = builder.create();

		final String gsonStr = gson.toJson(request);
		System.out.println("Request_gsonStr = " + gsonStr);
		return gsonStr;
	}

	/**
	 *
	 * @return
	 */
	private static String generateContextualEventRequest2() {
		/**
		 * ContextualEventRequest example
		 */

		/*
		 * Place of interest_ Route
		 */
		final List<Coordinate> coorList = new ArrayList<Coordinate>();
		coorList.add(new Coordinate(10.0997819, 56.1056684));
		coorList.add(new Coordinate(10.1397989, 56.1177777));
		coorList.add(new Coordinate(10.1624104, 56.128561));
		coorList.add(new Coordinate(10.1674363, 56.1316468));
		coorList.add(new Coordinate(10.1858257, 56.1634226));

		final Place place = new Route("route1", coorList, 1500);

		/*
		 * Filtering factors
		 */
		final Set<FilteringFactor> filteringFactors = new HashSet<FilteringFactor>();

		final Set<FilteringFactorValue> filteringFactorValueEventSource = new HashSet<FilteringFactorValue>();
		filteringFactorValueEventSource.add(new FilteringFactorValue(
				EventSource.SENSOR.toString()));
		FilteringFactor filteringFactor = new FilteringFactor(
				FilteringFactorName.EVENT_SOURCE,
				filteringFactorValueEventSource);
		filteringFactors.add(filteringFactor);

		final Set<FilteringFactorValue> filteringFactorValueCategory = new HashSet<FilteringFactorValue>();
		filteringFactorValueCategory
				.add(new FilteringFactorValue("TrafficJam"));
		filteringFactor = new FilteringFactor(
				FilteringFactorName.EVENT_CATEGORY,
				filteringFactorValueCategory);
		filteringFactors.add(filteringFactor);

		final Set<FilteringFactorValue> filteringFactorValueActivity = new HashSet<FilteringFactorValue>();
		filteringFactorValueActivity
				.add(new FilteringFactorValue("CarCommute"));
		filteringFactor = new FilteringFactor(FilteringFactorName.ACTIVITY,
				filteringFactorValueActivity);
		filteringFactors.add(filteringFactor);

		/*
		 * Ranking factor
		 */
		final Set<RankingElement> rankingElements = new HashSet<RankingElement>();
		rankingElements.add(new RankingElement(RankingElementName.DISTANCE,
				new RankingElementValue(70)));
		rankingElements.add(new RankingElement(RankingElementName.EVENT_LEVEL,
				new RankingElementValue(30)));

		final RankingFactor rankingFactor = new RankingFactor(
				RankingFactorType.LINEAR, rankingElements);

		/*
		 * create a ContextualEventRequest
		 */
		final ContextualEventRequest request = new ContextualEventRequest(
				place, filteringFactors, rankingFactor);

		/*
		 * Convert to Gson string
		 */
		final GsonBuilder builder = new GsonBuilder();
		builder.registerTypeAdapter(Place.class, new PlaceAdapter());
		final Gson gson = builder.create();

		final String gsonStr = gson.toJson(request);
		System.out.println("Request_gsonStr = " + gsonStr);
		return gsonStr;
	}

}
