package org.mattpayne.web.w1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


// https://www.baeldung.com/jackson-object-mapper-tutorial
public class JsonPracticeTest {

	@Test
	public void test() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Car car = new Car("yellow", "renault");
		objectMapper.writeValue(new File("target/car.json"), car);
		Car car2 = objectMapper.readValue(new File("target/car.json"), Car.class);  
		assertEquals(car.getColor(), car2.getColor());
		assertEquals(car.getType(), car2.getType());
	}

}
