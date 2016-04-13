/**
 *
 */
package citypulse.commons.reasoning_request;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Stefano Germano
 *
 */
public class Answers {

	private List<Answer> answers;

	/**
	 *
	 */
	public Answers() {
		answers = new LinkedList<>();
	}

	public void addAnswer(final Answer answer) {
		answers.add(answer);
	}

	public List<Answer> getAnswers() {
		return Collections.unmodifiableList(answers);
	}

	public void setAnswers(final List<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Answers [answers=" + answers + "]";
	}

}
