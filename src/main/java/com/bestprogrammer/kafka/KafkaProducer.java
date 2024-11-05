package com.bestprogrammer.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	
	/*@Value("${spring.kafka.topic.name}")
    private String topicName;*/
	
    private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);
    
    private KafkaTemplate<String, String> kafkaTemplate;

	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
	
		this.kafkaTemplate = kafkaTemplate;
		
		//System.out.println("topicName==========.>"+topicName);
	}
    
	 public void sendMessage(String message){
		 System.out.println("kafkaTemplate===============>"+kafkaTemplate);
		// System.out.println("topicName1111111111==========.>"+topicName);
	        log.info(String.format("Message sent  %s", message));
	        kafkaTemplate.send("bestprogrammer", message);
	    }

	
	

}
