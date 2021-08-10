package com.orweb.main.Threads;

import java.util.regex.PatternSyntaxException;

import com.orweb.main.logic.Methods.WagnerWhitin;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WagnerWhitinThread extends Thread {

    private static final Logger LOGGER = LoggerFactory.getLogger(WagnerWhitinThread.class);
    private WebSocketSession webSocketSession;
    private TextMessage message;

    public WagnerWhitinThread(WebSocketSession webSocketSession, TextMessage message) {
        this.webSocketSession = webSocketSession;
        this.message = message;
    }

    public void run() {
        String txt = message.getPayload();
        LOGGER.info("message im WagnerWhitinThread" + txt);
        String[] str = txt.split(";");
        WagnerWhitin instance = new WagnerWhitin();
        instance.setAnzahlPerioden(Integer.parseInt(str[0]));
        instance.setRuestkosten(Integer.parseInt(str[1])); // = bestellkostensatz
        instance.setPeriodenbedarf(parseStringArrayToIntArray(str[2].split(" ")));
        instance.setLagerkosten(parseStringArrayToDoubleArray(str[3].split(" ")));
        instance.start();
    }

    private int[] parseStringArrayToIntArray(String[] strArray) {
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            LOGGER.info("Runde: " + i);
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        return intArray;
    }

    private double[] parseStringArrayToDoubleArray(String[] strArray) {
        double[] doubleArray;
        doubleArray = new double[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            LOGGER.info("Runde: " + i);
            doubleArray[i] = Integer.parseInt(strArray[i]);
        }
        return doubleArray;
    }
}
