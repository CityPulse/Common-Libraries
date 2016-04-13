/*******************************************************************************
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 Stefano Germano - Insight Centre for Data Analytics NUIG
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *******************************************************************************/
package citypulse.commons.reasoning_request.concrete;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import citypulse.commons.data.Coordinate;
import citypulse.commons.reasoning_request.ARType;
import citypulse.commons.reasoning_request.Answer;

import com.google.gson.Gson;

/**
 * @author Thu-Le Pham
 * @author Stefano Germano
 *
 */
public class AnswerTravelPlanner extends Answer {
	/**
	 *
	 */
	private int id;
	/**
	 *
	 */
	private List<Coordinate> route = new LinkedList<>();

	/**
	 * meters
	 */
	private long length;

	/**
	 *
	 */
	private long number_of_seconds;

	/**
	 *
	 */
	public AnswerTravelPlanner() {
		super(ARType.TRAVEL_PLANNER);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arType
	 */
	public AnswerTravelPlanner(final ARType arType) {
		this();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param route
	 * @param length
	 * @param number_of_seconds
	 */
	public AnswerTravelPlanner(final int id, final List<Coordinate> route,
			final long length, final long number_of_seconds) {
		this();
		this.id = id;
		this.route = route;
		this.length = length;
		this.number_of_seconds = number_of_seconds;
	}

	/**
	 * @param route
	 * @param length
	 * @param number_of_seconds
	 */
	public AnswerTravelPlanner(final List<Coordinate> route, final long length,
			final long number_of_seconds) {
		this();
		this.id = 0;
		this.route = route;
		this.length = length;
		this.number_of_seconds = number_of_seconds;
	}

	/**
	 * @param coordinate
	 */
	public void addCoordinate(final Coordinate coordinate) {
		route.add(coordinate);

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see citypulse.commons.reasoning_request.Answer#fromJSON()
	 */
	@Override
	public String fromJSON() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return
	 */
	public long getLength() {
		return length;
	}

	/**
	 * @return
	 */
	public long getNumber_of_seconds() {
		return number_of_seconds;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see citypulse.commons.application_request.Answer#parseToAspFacts()
	 */
	/**
	 * @return
	 */
	public List<Coordinate> getRoute() {
		return Collections.unmodifiableList(route);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see citypulse.commons.application_request.Answer#parseToAspFacts()
	 */
	@Override
	public String parseToAspFacts() {
		final StringBuilder asp = new StringBuilder();
		for (int i = 0; i < route.size(); i++) {
			final Coordinate node = route.get(i);
			asp.append("path_node(").append("\"").append(node.toString())
			.append("\",").append(i + 1).append(").\n");
		}
		asp.append("#const n = ").append(route.size()).append(".");
		return asp.toString();
	}

	/**
	 * @param length
	 */
	public void setLength(final long length) {
		this.length = length;
	}

	/**
	 * @param number_of_seconds
	 */
	public void setNumber_of_seconds(final long number_of_seconds) {
		this.number_of_seconds = number_of_seconds;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see citypulse.commons.application_request.Answer#toJSON()
	 */
	/**
	 * @param route
	 */
	public void setRoute(final List<Coordinate> route) {
		this.route = route;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see citypulse.commons.reasoning_request.Answer#toJSON()
	 */
	@Override
	public String toJSON() {
		return new Gson().toJson(this);
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AnswerTravelPlanner [id=" + id + ", route=" + route
				+ ", length=" + length + ", number_of_seconds="
				+ number_of_seconds + "]";
	}

}
