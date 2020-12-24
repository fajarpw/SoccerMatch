package org.aplas.soccermatch;

public class LogItem {

    private String name, time, player;

    public LogItem(String name, String time, String player) {
        this.name = name;
        this.time = time;
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
}
