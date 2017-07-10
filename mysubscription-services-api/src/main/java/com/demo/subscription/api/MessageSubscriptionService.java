/**
 * 
 */
package com.demo.subscription.api;

import com.demo.subscription.model.Message;
import com.demo.subscription.model.MessageType;
import com.demo.subscription.model.SubscriptionMessage;

/**
 * 
 *
 */
public interface MessageSubscriptionService {
	
	
	
	public SubscriptionMessage createSubscription (SubscriptionMessage subMessage, MessageType messageType);
	
	
	public  SubscriptionMessage readSubscription (String subscriptionID);
	
	
	public SubscriptionMessage updateSubscription(SubscriptionMessage subMessage ) ;
	
	public void PostMessage(SubscriptionMessage subMessage, Message message ) ;
	

}
