package com.demo.subscription.handler;

import com.demo.subscription.model.Message;
import com.demo.subscription.model.MessageType;
import com.demo.subscription.model.SubscriptionMessage;

public interface SubscriptionHandler {
	
	
		
		public SubscriptionMessage createSubscriptionHandler(SubscriptionMessage subMessage, MessageType messageType);
		
		public  SubscriptionMessage readSubscriptionHandler (String subscriptionID);
				
		public SubscriptionMessage updateSubscriptionHandler(SubscriptionMessage subMessage ) ;
		
		public void postMessageHandler(SubscriptionMessage subMessage, Message message ) ;
		

}
