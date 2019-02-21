package com.boa.emppartitioner;

import java.util.Map;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

import com.boa.components.Employee;

public class EmployeeMessagePartitioner implements Partitioner {

	public void configure(Map<String, ?> arg0) {
		// TODO Auto-generated method stub

	}

	public void close() {
		// TODO Auto-generated method stub

	}

	public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {
		int partition=3;
		Employee msgKey = (Employee) value;
		if (msgKey.getDesignation().contentEquals("Accountant")) {
			return partition = 0;
		} else if (msgKey.getDesignation().contentEquals("Developer")) {
			return partition = 1;
		} else if (msgKey.getDesignation().contentEquals("Architech")) {
			return partition = 2;
		}
		return partition = 3;

	}

}
