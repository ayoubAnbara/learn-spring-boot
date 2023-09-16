
package com.anbara.learnspringboot.awsSQS;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Ayoub ANBARA
 */

@RestController
public class SQSController {
    Logger logger = LoggerFactory.getLogger(SQSController.class);
    @SqsListener("myqueue_standard")
    public void loadMessageFromSQS(String message) {
        logger.info("message from SQS Queue {}", message);
    }
}

