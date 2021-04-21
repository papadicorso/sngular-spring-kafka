/**
 * 
 */
package dev.papa.corso.sngular.consumers;

import java.io.IOException;
import java.util.logging.Logger;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author corsodad
 *
 */
@Service
public class UserConsumer {
	
	Logger logger = Logger.getLogger(UserConsumer.class.getName());
	
    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }

}
