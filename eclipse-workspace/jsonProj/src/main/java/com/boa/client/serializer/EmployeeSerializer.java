package com.boa.client.serializer;

 
import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;

import com.boa.client.json.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeSerializer implements Serializer<Employee>{

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void configure(Map<String, ?> arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}

	public byte[] serialize(String arg0, Employee data) {
		   // TODO Auto-generated method stub
        ObjectMapper mapper=new ObjectMapper();
        byte[] array=null;
        try {
            String jsonContent=mapper.writeValueAsString(data);
            System.out.println("coverted to json "+jsonContent);
            array=jsonContent.getBytes();
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return array;
	}

  

	 
}
