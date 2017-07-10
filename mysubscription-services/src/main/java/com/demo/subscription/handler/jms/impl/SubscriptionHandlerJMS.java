package com.demo.subscription.handler.jms.impl;

import javax.jms.MessageListener;

import com.demo.subscription.handler.SubscriptionHandler;
import com.demo.subscription.model.Message;
import com.demo.subscription.model.MessageType;
import com.demo.subscription.model.SubscriptionMessage;



public class SubscriptionHandlerJMS implements SubscriptionHandler,MessageListener  {

	@Override
	public SubscriptionMessage createsubscriptionHandler(SubscriptionMessage subMessage, MessageType messageType) {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public void onMessage(javax.jms.Message arg0) {
		// process handlers 
	}

}
