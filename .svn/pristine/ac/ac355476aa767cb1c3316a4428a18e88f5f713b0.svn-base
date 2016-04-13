package citypulse.commons.contextual_events_request;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class ContextualEventAdapter extends
 TypeAdapter<ContextualEvent> {

	/*
	 * (non-Javadoc)
	 *
	 * @see com.google.gson.TypeAdapter#read(com.google.gson.stream.JsonReader)
	 */
	@Override
	public ContextualEvent read(final JsonReader jsonReader)
			throws IOException {

		if (jsonReader.peek() == JsonToken.NULL) {
			jsonReader.nextNull();
			return null;
		}

		// System.out.println(getClass().getName());

		final String value = jsonReader.nextString();
		System.out.println("ContextualEventAdapter: " + value);

		return new Gson().fromJson(value, ContextualEvent.class);


	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.google.gson.TypeAdapter#write(com.google.gson.stream.JsonWriter,
	 * java.lang.Object)
	 */
	@Override
	public void write(final JsonWriter jsonWriter,
 final ContextualEvent answer)
			throws IOException {

		if (answer == null) {
			jsonWriter.nullValue();
			return;
		}

		jsonWriter.value(new Gson().toJson(answer));

	}

}