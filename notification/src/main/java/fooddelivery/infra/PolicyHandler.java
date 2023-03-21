package fooddelivery.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fooddelivery.config.kafka.KafkaProcessor;
import fooddelivery.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FoodPicked'"
    )
    public void wheneverFoodPicked_UserNoti(@Payload FoodPicked foodPicked) {
        FoodPicked event = foodPicked;
        System.out.println(
            "\n\n##### listener UserNoti : " + foodPicked + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StatusChanged'"
    )
    public void wheneverStatusChanged_UserNoti(
        @Payload StatusChanged statusChanged
    ) {
        StatusChanged event = statusChanged;
        System.out.println(
            "\n\n##### listener UserNoti : " + statusChanged + "\n\n"
        );
        // Sample Logic //

    }
}
