package com.demo.subscription.rs.impl;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.demo.subscription.api.MessagesubscriptionService;
import com.demo.subscription.model.Message;
import com.demo.subscription.model.MessageType;
import com.demo.subscription.model.SubscriptionMessage;


@Path("/MessagesubscriptionService/")
@Produces("text/xml")
public class SubscriptionServiceRest implements MessagesubscriptionService {

	@Override
	@POST
    @Path("/createSubscription/")
	public SubscriptionMessage createSubscription( @PathParam("SubscriptionMessage") SubscriptionMessage subMessage,  @PathParam("MessageType") MessageType messageType) {
		
		return null;
	}

	@Override
	@POST
    @Path("/readSubscription/")
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
