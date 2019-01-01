package com.neat.data.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

@SuppressWarnings("unused")
public class GeneralBooleanDeserializer extends JsonDeserializer<Boolean> {
    @Override
    public Boolean deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        return (parser.getText().equals("1") || parser.getText().equals("true") || parser.getText().equals("True"));
    }
}
