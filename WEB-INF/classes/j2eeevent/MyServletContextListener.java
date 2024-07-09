package j2eeevent;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_ORANGE = "\u001B[38;5;208m"; // オレンジ色はカスタムカラー
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_INDIGO = "\u001B[38;5;54m"; // インディゴ色はカスタムカラー
    private static final String ANSI_VIOLET = "\u001B[35m";

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String message = "開始開始開始開始開始開始開始開始開始開始開始開始開始開始開始開始開始開始開始開始開始";
        System.out.println(createRainbowText(message));
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        String message = "終了終了終了終了終了終了終了終了終了終了終了終了終了終了終了終了終了終了終了終了終了";
        System.out.println(createRainbowText(message));
    }

    private String createRainbowText(String text) {
        StringBuilder rainbowText = new StringBuilder();
        String[] colors = {ANSI_RED, ANSI_ORANGE, ANSI_YELLOW, ANSI_GREEN, ANSI_BLUE, ANSI_INDIGO, ANSI_VIOLET};

        for (int i = 0; i < text.length(); i++) {
            String color = colors[i % colors.length];
            rainbowText.append(color).append(text.charAt(i));
        }

        rainbowText.append(ANSI_RESET);
        return rainbowText.toString();
    }
}
