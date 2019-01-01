package com.neat.data.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

@SuppressWarnings("unused")
public class GeneralBooleanSerializer extends JsonSerializer<Boolean> {
    @Override
    public void serialize(Boolean bool, JsonGenerator generator, SerializerProvider provider) throws IOException {
        generator.writeString(bool ? "true" : "false");
    }
}
