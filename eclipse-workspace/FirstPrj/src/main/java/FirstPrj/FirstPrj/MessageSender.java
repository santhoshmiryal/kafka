package FirstPrj.FirstPrj;

import java.util.Properties;

public class MessageSender {
	
   public static void main(String args[]) {
	Properties props=new Properties();
	props.setProperty("bootstrp.servers", "localhost:9092");
	props.setProperty("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
	props.setProperty("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
	
   
	
	
   }
	 

}
