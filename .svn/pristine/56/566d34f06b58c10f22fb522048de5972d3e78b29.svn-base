package citypulse.commons.reasoning_request.concrete;

import java.io.IOException;

import citypulse.commons.reasoning_request.functional_requirements.FunctionalParameterValue;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class FunctionalParameterValueAdapter extends
		TypeAdapter<FunctionalParameterValue> {

	/*
	 * (non-Javadoc)
	 *
	 * @see com.google.gson.TypeAdapter#read(com.google.gson.stream.JsonReader)
	 */
	@Override
	public FunctionalParameterValue read(final JsonReader jsonReader)
			throws IOException {

		if (jsonReader.peek() == JsonToken.NULL) {
			jsonReader.nextNull();
			return null;
		}

		final String value = jsonReader.nextString();
		System.out.println("FunctionalParameterValueAdapter: " + value);
		// To add more when we have more
		return new StringFunctionalParameterValue(value);

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.google.gson.TypeAdapter#write(com.google.gson.stream.JsonWriter,
	 * java.lang.Object)
	 */
	@Override
	public void write(final JsonWriter jsonWriter,
			final FunctionalParameterValue functionalParameterValue)
					throws IOException {

		if (functionalParameterValue == null) {
			jsonWriter.nullValue();
			return;
		}

		jsonWriter.value(functionalParameterValue.getValue().toString());

	}
}