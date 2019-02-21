package Kafka.Kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class MessageSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties props=new Properties();
		props.setProperty("bootstrap.servers", "localhost:9092");
		props.setProperty("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.setProperty("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		
		KafkaProducer<String, String> producer=new KafkaProducer<String, String>(props);
		String topicName="test-cluster-topic1";
		for(int i=0;i<10;i++) {
		//	if(i>0 && i <10) {
		ProducerRecord<String, String> record=
				new ProducerRecord<String, String>(topicName, "message-" + i ,"SANTOSH++" );
		producer.send(record);
		//}
	//		if(i>10 && i <20) {
//				ProducerRecord<String, String> record=
//						new ProducerRecord<String, String>(topicName, "message-2" + i,"This is a test PART2" );
//				producer.send(record);}
//			if(i>20 && i <30) {
//				ProducerRecord<String, String> record=
//						new ProducerRecord<String, String>(topicName, "message-3" + i ,"This is a test PART3" );
//				producer.send(record);}
//		
		}
		producer.close();
	}

}
	
