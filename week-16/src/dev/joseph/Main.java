package dev.joseph;

import dev.joseph.musician.MusicianAdvanced;
import dev.joseph.musician.MusicianBasic;

public class Main {

    public static void main(String[] args) {
        firstExercise();
    }

    //--- Test for exercise 1.
    private static void firstExercise() {
        MusicianBasic musicianBasic = new MusicianBasic("Frank Zappa");
        System.out.println(musicianBasic.info());

        //--- Add guitar and print info.
        musicianBasic.addInstrument("guitar");
        System.out.println(musicianBasic.info());

        //--- Remove instrument and print info.
        musicianBasic.removeInstrument();
        System.out.println(musicianBasic.info());

        System.out.println(" ");

        //--- Advanced version.
        MusicianAdvanced musicianAdvanced = new MusicianAdvanced("Frank Zappa");
        System.out.println(musicianAdvanced.info());

        musicianAdvanced.addInstrument("guitar");
        System.out.println(musicianAdvanced.info());

        musicianAdvanced.addInstrument("drums");
        System.out.println(musicianAdvanced.info());

        musicianAdvanced.removeInstrument("guitar");
        System.out.println(musicianAdvanced.info());

        musicianAdvanced.removeInstrument("drums");
        System.out.println(musicianAdvanced.info());
    }
}
