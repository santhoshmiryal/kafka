package Kafka.partition;

import java.util.Map;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

public class MessagePartitioner implements Partitioner {

	public void configure(Map<String, ?> arg0) {
		// TODO Auto-generated method stub

	}

	public void close() {
		// TODO Auto-generated method stub

	}

	public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {
		int partition=3;
		String msgKey = (String) key;
		if (msgKey.equals("message-1")) {
			return partition = 0;
		} else if (msgKey.equals("message-2")) {
			return partition = 1;
		} else if (msgKey.equals("message-3")) {
			return partition = 2;
		}
		return partition = 3;

	}

}
