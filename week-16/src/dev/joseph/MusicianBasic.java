package dev.joseph;

public class MusicianBasic {

    private String name;
    private String instrument;

    public MusicianBasic(String musicianName) {
        this.name = musicianName;
        this.instrument = "";
    }

    public void addInstrument(String instrumentName) {
        this.instrument = instrumentName;
    }

    public void removeInstrument() {
        this.instrument = "";
    }

    public String info() {
        return String.format(
                "Musician: %s \n Instrument: %s",
                this.name, this.instrument
        );
    }


}
