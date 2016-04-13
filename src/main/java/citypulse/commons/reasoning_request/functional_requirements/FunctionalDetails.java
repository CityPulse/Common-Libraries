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
package citypulse.commons.reasoning_request.functional_requirements;

/**
 * @author Stefano Germano
 *
 */
public class FunctionalDetails {

	/**
	 *
	 */
	private FunctionalParameters functionalParameters;

	/**
	 *
	 */
	private FunctionalConstraints functionalConstraints;

	/**
	 *
	 */
	private FunctionalPreferences functionalPreferences;

	/**
	 * @param functionalParameters
	 * @param functionalConstraints
	 * @param functionalPreferences
	 */
	public FunctionalDetails(final FunctionalParameters functionalParameters,
			final FunctionalConstraints functionalConstraints,
			final FunctionalPreferences functionalPreferences) {
		super();
		this.functionalParameters = functionalParameters;
		this.functionalConstraints = functionalConstraints;
		this.functionalPreferences = functionalPreferences;
	}

	/**
	 * @return
	 */
	public FunctionalConstraints getFunctionalConstraints() {
		return functionalConstraints;
	}

	/**
	 * @return
	 */
	public FunctionalParameters getFunctionalParameters() {
		return functionalParameters;
	}

	/**
	 * @return
	 */
	public FunctionalPreferences getFunctionalPreferences() {
		return functionalPreferences;
	}

	/**
	 * @param functionalConstraints
	 */
	public void setFunctionalConstraints(
			FunctionalConstraints functionalConstraints) {
		this.functionalConstraints = functionalConstraints;
	}

	/**
	 * @param functionalParameters
	 */
	public void setFunctionalParameters(
			FunctionalParameters functionalParameters) {
		this.functionalParameters = functionalParameters;
	}

	/**
	 * @param functionalPreferences
	 */
	public void setFunctionalPreferences(
			FunctionalPreferences functionalPreferences) {
		this.functionalPreferences = functionalPreferences;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FunctionalDetails [functionalParameters="
				+ functionalParameters + ", functionalConstraints="
				+ functionalConstraints + ", functionalPreferences="
				+ functionalPreferences + "]";
	}

}