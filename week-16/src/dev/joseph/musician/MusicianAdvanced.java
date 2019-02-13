package dev.joseph.musician;

import java.util.ArrayList;

public class MusicianAdvanced {

    private String name;
    private ArrayList<String> instruments;

    public MusicianAdvanced(String musicianName) {
        this.name = musicianName;
        this.instruments = new ArrayList<>();
    }

    public void addInstrument(String instrumentName) {
        this.instruments.add(instrumentName);
    }

    public void removeInstrument(String instrumentName) {
        this.instruments.remove(instrumentName);
    }

    public String info() {
        String result = "";

        //--- Add musician name.
        result += "Musician: " + this.name + "\n";

        //--- Loop over instruments.
        result += "Instruments:\n";
        if (this.instruments.size() > 0) {
            for (String instrument : this.instruments) {
                result += instrument + "\n";
            }
        } else {
            result += "None";
        }

        return result;
    }

}
