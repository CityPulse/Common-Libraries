package citypulse.commons.reasoning_request.concrete;

import java.io.IOException;

import citypulse.commons.reasoning_request.Answer;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class AnswerAdapter extends TypeAdapter<Answer> {

	/*
	 * (non-Javadoc)
	 *
	 * @see com.google.gson.TypeAdapter#read(com.google.gson.stream.JsonReader)
	 */
	@Override
	public Answer read(final JsonReader jsonReader) throws IOException {

		if (jsonReader.peek() == JsonToken.NULL) {
			jsonReader.nextNull();
			return null;
		}

		// System.out.println(getClass().getName());

		final String value = jsonReader.nextString();
		// System.out.println("AnswerAdapter: " + value);

		// FIXME Temporary solution
		if (value.contains("\"arType\":\"TRAVEL_PLANNER\""))
			return new Gson().fromJson(value, AnswerTravelPlanner.class);
		else if (value.contains("\"arType\":\"PARKING_SPACES\""))
			return new Gson().fromJson(value, AnswerParkingSpaces.class);

		return null;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.google.gson.TypeAdapter#write(com.google.gson.stream.JsonWriter,
	 * java.lang.Object)
	 */
	@Override
	public void write(final JsonWriter jsonWriter, final Answer answer)
			throws IOException {

		if (answer == null) {
			jsonWriter.nullValue();
			return;
		}

		jsonWriter.value(answer.toJSON());

	}

}