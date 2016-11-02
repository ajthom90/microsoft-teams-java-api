package com.andrewthom.microsoft.teams.api;

import org.json.JSONObject;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class IncomingWebhookRequest {
	private Webhook webhookDetails;

	public IncomingWebhookRequest(Webhook webhookDetails) {
		this.webhookDetails = webhookDetails;
	}
	
	public void sendMessage(String text) throws UnirestException {
		String url = webhookDetails.getUrl();
		JSONObject object = new JSONObject();
		object.put("text", text);
		Unirest.post(url).header("Content-Type", "application/json").body(object).asString();
	}
}
