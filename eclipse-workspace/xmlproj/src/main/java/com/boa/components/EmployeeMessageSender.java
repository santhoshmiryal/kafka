package com.boa.components;

import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

public class EmployeeMessageSender {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		Properties props=new Properties();
		props.setProperty("bootstrap.servers", "localhost:9092");
		props.setProperty("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.setProperty("value.serializer", "com.boa.client.serializer.EmployeeSerializer");
		
		KafkaProducer<String, Employee> producer=new KafkaProducer<String, Employee>(props);
		String topicName="emp-topic";
		ProducerRecord<String, Employee> record=
 				new ProducerRecord<String, Employee>(topicName, "employee-1" ,new Employee(111,"Santu","LA"));
		
		Future<RecordMetadata> future=producer.send(record);
		RecordMetadata metadata=future.get();
		System.out.println(metadata);
 		producer.send(record);
 		
	}
//		for(int i=0;i<50;i++) {
//			if(i>0 && i <10) {
//		ProducerRecord<String, String> record=
//				new ProducerRecord<String, String>(topicName, "message-1" + i ,"This is a test PART1" );
//		producer.send(record);}
//			if(i>10 && i <20) {
//				ProducerRecord<String, String> record=
//						new ProducerRecord<String, String>(topicName, "message-2" + i,"This is a test PART2" );
//				producer.send(record);}
//			if(i>20 && i <30) {
//				ProducerRecord<String, String> record=
//						new ProducerRecord<String, String>(topicName, "message-3" + i ,"This is a test PART3" );
//				producer.send(record);}
//		
//		}

}
	
