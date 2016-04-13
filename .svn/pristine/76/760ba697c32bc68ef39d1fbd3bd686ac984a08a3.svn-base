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

import it.unical.mat.embasp.mapper.Predicate;
import it.unical.mat.embasp.mapper.Term;

/**
 * @author Stefano Germano
 *
 */
@Predicate("preference")
public class FunctionalPreference {

	/**
	 *
	 */
	@Term(1)
	private int order;

	/**
	 *
	 */
	@Term(2)
	private FunctionalPreferenceOperation operation;

	/**
	 *
	 */
	@Term(3)
	private FunctionalConstraintName value;

	/**
	 * @param order
	 * @param operation
	 * @param value
	 */
	public FunctionalPreference(final int order,
			final FunctionalPreferenceOperation operation,
			final FunctionalConstraintName value) {
		super();
		this.order = order;
		this.operation = operation;
		this.value = value;
	}

	/**
	 * @return
	 */
	public FunctionalPreferenceOperation getOperation() {
		return operation;
	}

	/**
	 * @return
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * @return
	 */
	public FunctionalConstraintName getValue() {
		return value;
	}

	/**
	 * @param operation
	 */
	public void setOperation(final FunctionalPreferenceOperation operation) {
		this.operation = operation;
	}

	/**
	 * @param order
	 */
	public void setOrder(final int order) {
		this.order = order;
	}

	/**
	 * @param value
	 */
	public void setValue(final FunctionalConstraintName value) {
		this.value = value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FunctionalPreference [order=" + order + ", operation="
				+ operation + ", value=" + value + "]";
	}

}
