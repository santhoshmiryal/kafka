package com.boa.client.deserializer;

import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

import com.boa.client.json.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeDeserializer implements Deserializer<Employee> {

	public void close() {
		// TODO Auto-generated method stub

	}

	public void configure(Map<String, ?> arg0, boolean arg1) {
		// TODO Auto-generated method stub

	}

	public Employee deserialize(String arg0, byte[] arg1) {
		Employee emp = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			emp = mapper.readValue(arg1, Employee.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;
	}

}
