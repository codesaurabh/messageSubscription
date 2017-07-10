package com.demo.subscription.handler.thread.impl;

import com.demo.subscription.model.Message;
import com.demo.subscription.model.MessageType;
import com.demo.subscription.model.SubscriptionMessage;

public class SubscriptionHandler implements com.demo.subscription.handler.SubscriptionHandler, Runnable {

	@Override
	public SubscriptionMessage createsubscriptionHandler(SubscriptionMessage subMessage, MessageType messageType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		// to manage subscription events
		
		// This will call respective handlers
		
	}

	@Override
	public SubscriptionMessage readSubscriptionHandler(String subscriptionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubscriptionMessage updateSubscriptionHandler(SubscriptionMessage subMessage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void postMessageHandler(SubscriptionMessage subMessage, Message message) {
		// TODO Auto-generated method stub
		
	}

}
