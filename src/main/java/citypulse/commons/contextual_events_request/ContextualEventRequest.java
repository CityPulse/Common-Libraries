package citypulse.commons.contextual_events_request;

import citypulse.commons.reasoning_request.Answer;
import citypulse.commons.reasoning_request.ReasoningRequest;

/*
 * @author: Thu-Le Pham
 * The request that ContextualFilter will receive from A5.3
 */
public class ContextualEventRequest {
	ReasoningRequest reasoningRequest;
	Answer answer;

	public ContextualEventRequest() {
		super();
	}

	public ContextualEventRequest(final ReasoningRequest reasoningRequest,
			final Answer answer) {
		super();
		this.reasoningRequest = reasoningRequest;
		this.answer = answer;
	}

	public Answer getAnswer() {
		return answer;
	}

	public ReasoningRequest getReasoningRequest() {
		return reasoningRequest;
	}

	public void setAnswer(final Answer answer) {
		this.answer = answer;
	}

	public void setReasoningRequest(final ReasoningRequest reasoningRequest) {
		this.reasoningRequest = reasoningRequest;
	}

	@Override
	public String toString() {
		return "ContextualEventRequest [reasoningRequest=" + reasoningRequest
				+ ", answer=" + answer + "]";
	}

}
