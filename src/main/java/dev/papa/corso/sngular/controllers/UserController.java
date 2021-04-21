/**
 * 
 */
package dev.papa.corso.sngular.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import dev.papa.corso.sngular.producers.UserProducer;

/**
 * @author corsodad
 *
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	private final UserProducer producer;

    @Autowired
    UserController(UserProducer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
    }

}
