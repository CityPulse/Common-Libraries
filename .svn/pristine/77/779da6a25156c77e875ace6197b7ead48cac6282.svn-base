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

import citypulse.commons.data.Coordinate;
import citypulse.commons.reasoning_request.ARType;
import citypulse.commons.reasoning_request.Answer;

import com.google.gson.Gson;

/**
 * @author Stefano Germano
 *
 */
public class AnswerParkingSpaces extends Answer {

	/**
	 *
	 */
	private Coordinate position;

	/**
	 * meters
	 */
	private long availablePS;

	/**
	 *
	 */
	private long walking_distance;

	/**
	 *
	 */
	public AnswerParkingSpaces() {
		super(ARType.PARKING_SPACES);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arType
	 */
	public AnswerParkingSpaces(final ARType arType) {
		this();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param position
	 * @param availablePS
	 * @param walking_distance
	 */
	public AnswerParkingSpaces(final Coordinate position,
			final long availablePS, final long walking_distance) {
		this();
		this.position = position;
		this.availablePS = availablePS;
		this.walking_distance = walking_distance;
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
	public long getAvailablePS() {
		return availablePS;
	}

	/**
	 * @return
	 */
	public Coordinate getPosition() {
		return position;
	}

	/**
	 * @return
	 */
	public long getWalking_distance() {
		return walking_distance;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see citypulse.commons.reasoning_request.Answer#parseToAspFacts()
	 */
	@Override
	public String parseToAspFacts() {
		// TODO Auto-generated method stub
		return "";
	}

	/**
	 * @param availablePS
	 */
	public void setAvailablePS(final long availablePS) {
		this.availablePS = availablePS;
	}

	/**
	 * @param position
	 */
	public void setPosition(final Coordinate position) {
		this.position = position;
	}

	/**
	 * @param walking_distance
	 */
	public void setWalking_distance(final long walking_distance) {
		this.walking_distance = walking_distance;
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
		return "AnswerParkingSpaces [position=" + position + ", availablePS="
				+ availablePS + ", walking_distance=" + walking_distance + "]";
	}

}
