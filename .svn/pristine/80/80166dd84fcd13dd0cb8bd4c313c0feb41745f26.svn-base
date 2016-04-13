package citypulse.commons.reasoning_request.concrete;

import java.io.IOException;

import citypulse.commons.reasoning_request.functional_requirements.FunctionalConstraintValue;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class FunctionalConstraintValueAdapter extends
TypeAdapter<FunctionalConstraintValue> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.gson.TypeAdapter#read(com.google.gson.stream.JsonReader)
	 */
	@Override
	public FunctionalConstraintValue read(final JsonReader jsonReader)
			throws IOException {

		if (jsonReader.peek() == JsonToken.NULL) {
			jsonReader.nextNull();
			return null;
		}

		final String value = jsonReader.nextString();
		System.out.println("FunctionalConstraintValueAdapter:" + value);
		try {
			final int parseInt = Integer.parseInt(value);
			return new IntegerFunctionalConstraintValue(parseInt);
		} catch (final NumberFormatException e) {
			try {
				final float parseFloat = Float.parseFloat(value);
				return new FloatFunctionalConstraintValue(parseFloat);
			} catch (final NumberFormatException e1) {
				System.out.println("NumberFormatException");
				// To add more when we have more
				return null;
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.gson.TypeAdapter#write(com.google.gson.stream.JsonWriter,
	 * java.lang.Object)
	 */
	@Override
	public void write(final JsonWriter jsonWriter,
			final FunctionalConstraintValue functionalConstraintValue)
			throws IOException {

		if (functionalConstraintValue == null) {
			jsonWriter.nullValue();
			return;
		}

		jsonWriter.value(functionalConstraintValue.getValue().toString());

	}
}