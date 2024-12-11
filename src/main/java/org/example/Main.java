package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi bots = new TelegramBotsApi(DefaultBotSession.class);
        bots.registerBot(new MyBot());
        System.out.println("Bot started");
    }
}