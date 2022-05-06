package org.experimentalplayers.demosimp.services;

import com.pengrad.telegrambot.TelegramBot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoSimpBot {

	private final TelegramBot bot;

	public DemoSimpBot(@Value("${env.TG_TOKEN}") String token) {

		bot = new TelegramBot(token);

	}

}
