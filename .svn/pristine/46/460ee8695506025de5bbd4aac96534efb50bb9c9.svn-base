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
package citypulse.commons.reasoning_request;

import citypulse.commons.reasoning_request.functional_requirements.FunctionalDetails;

/**
 * @author Stefano Germano
 *
 */
public class ReasoningRequest {

	/**
	 *
	 */
	private User user;

	/**
	 *
	 */
	private ARType arType;

	/**
	 *
	 */
	private FunctionalDetails functionalDetails;

	/**
	 * @param user
	 * @param arType
	 * @param functionalDetails
	 */
	public ReasoningRequest(final User user, final ARType arType,
			final FunctionalDetails functionalDetails) {
		super();
		this.user = user;
		this.arType = arType;
		this.functionalDetails = functionalDetails;
	}

	/**
	 * @return
	 */
	public ARType getArType() {
		return arType;
	}

	/**
	 * @return
	 */
	public FunctionalDetails getFunctionalDetails() {
		return functionalDetails;
	}

	/**
	 * @return
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param arType
	 */
	public void setArType(final ARType arType) {
		this.arType = arType;
	}

	/**
	 * @param functionalDetails
	 */
	public void setFunctionalDetails(final FunctionalDetails functionalDetails) {
		this.functionalDetails = functionalDetails;
	}

	/**
	 * @param user
	 */
	public void setUser(final User user) {
		this.user = user;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReasoningRequest [user=" + user + ", arType=" + arType
				+ ", functionalDetails=" + functionalDetails + "]";
	}

}
