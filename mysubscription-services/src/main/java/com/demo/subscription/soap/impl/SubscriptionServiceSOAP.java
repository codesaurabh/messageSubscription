package com.demo.subscription.soap.impl;

import javax.jws.WebService;

import com.demo.subscription.api.MessagesubscriptionService;
import com.demo.subscription.model.Message;
import com.demo.subscription.model.MessageType;
import com.demo.subscription.model.SubscriptionMessage;

@WebService
public class SubscriptionServiceSOAP implements MessagesubscriptionService {

	@Override
	public SubscriptionMessage createSubscription(SubscriptionMessage subMessage, MessageType messageType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubscriptionMessage readSubscription(String subscriptionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubscriptionMessage updateSubscription(SubscriptionMessage subMessage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void postMessage(SubscriptionMessage subMessage, Message message) {
		// TODO Auto-generated method stub

	}

}
