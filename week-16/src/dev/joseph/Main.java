package dev.joseph;

public class Main {

    public static void main(String[] args) {
        runMusicianBasicTest();
    }

    //--- Test for exercise 1.
    private static void runMusicianBasicTest() {
        MusicianBasic musicianBasic = new MusicianBasic("Frank Zappa");
        System.out.println(musicianBasic.info());

        //--- Add guitar and print info.
        musicianBasic.addInstrument("guitar");
        System.out.println(musicianBasic.info());

        //--- Remove instrument and print info.
        musicianBasic.removeInstrument();
        System.out.println(musicianBasic.info());
    }
}
