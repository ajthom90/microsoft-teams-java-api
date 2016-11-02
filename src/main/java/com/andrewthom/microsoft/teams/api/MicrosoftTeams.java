package com.andrewthom.microsoft.teams.api;

public class MicrosoftTeams {
	public static IncomingWebhookRequest forUrl(Webhook webhook) {
		return new IncomingWebhookRequest(webhook);
	}
}
