package dddfooddelivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import dddfooddelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import dddfooddelivery.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired NotificationRepository notificationRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderAccepted'")
    public void wheneverOrderAccepted_Notify(@Payload OrderAccepted orderAccepted){

        OrderAccepted event = orderAccepted;
        System.out.println("\n\n##### listener Notify : " + orderAccepted + "\n\n");


        // Comments // 
		//주문상태가 변경될때 마다 카톡으로 알림 발송
		// 

        // Sample Logic //
        Notification.notify(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookStarted'")
    public void wheneverCookStarted_Notify(@Payload CookStarted cookStarted){

        CookStarted event = cookStarted;
        System.out.println("\n\n##### listener Notify : " + cookStarted + "\n\n");


        // Comments // 
		//주문상태가 변경될때 마다 카톡으로 알림 발송
		// 

        // Sample Logic //
        Notification.notify(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookFinished'")
    public void wheneverCookFinished_Notify(@Payload CookFinished cookFinished){

        CookFinished event = cookFinished;
        System.out.println("\n\n##### listener Notify : " + cookFinished + "\n\n");


        // Comments // 
		//주문상태가 변경될때 마다 카톡으로 알림 발송
		// 

        // Sample Logic //
        Notification.notify(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderRejected'")
    public void wheneverOrderRejected_Notify(@Payload OrderRejected orderRejected){

        OrderRejected event = orderRejected;
        System.out.println("\n\n##### listener Notify : " + orderRejected + "\n\n");


        // Comments // 
		//주문상태가 변경될때 마다 카톡으로 알림 발송
		// 

        // Sample Logic //
        Notification.notify(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Picked'")
    public void wheneverPicked_Notify(@Payload Picked picked){

        Picked event = picked;
        System.out.println("\n\n##### listener Notify : " + picked + "\n\n");


        // Comments // 
		//주문상태가 변경될때 마다 카톡으로 알림 발송
		// 

        // Sample Logic //
        Notification.notify(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Delivered'")
    public void wheneverDelivered_Notify(@Payload Delivered delivered){

        Delivered event = delivered;
        System.out.println("\n\n##### listener Notify : " + delivered + "\n\n");


        // Comments // 
		//주문상태가 변경될때 마다 카톡으로 알림 발송
		// 

        // Sample Logic //
        Notification.notify(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderPlaced'")
    public void wheneverOrderPlaced_Notify(@Payload OrderPlaced orderPlaced){

        OrderPlaced event = orderPlaced;
        System.out.println("\n\n##### listener Notify : " + orderPlaced + "\n\n");


        // Comments // 
		//주문상태가 변경될때 마다 카톡으로 알림 발송
		// 

        // Sample Logic //
        Notification.notify(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCanceled'")
    public void wheneverOrderCanceled_Notify(@Payload OrderCanceled orderCanceled){

        OrderCanceled event = orderCanceled;
        System.out.println("\n\n##### listener Notify : " + orderCanceled + "\n\n");


        // Comments // 
		//주문상태가 변경될때 마다 카톡으로 알림 발송
		// 

        // Sample Logic //
        Notification.notify(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Paid'")
    public void wheneverPaid_Notify(@Payload Paid paid){

        Paid event = paid;
        System.out.println("\n\n##### listener Notify : " + paid + "\n\n");


        // Comments // 
		//주문상태가 변경될때 마다 카톡으로 알림 발송
		// 

        // Sample Logic //
        Notification.notify(event);
        

        

    }

}


