package dev.joseph;

import dev.joseph.cv.CVAdvanced;
import dev.joseph.cv.CVBasic;
import dev.joseph.musician.MusicianAdvanced;
import dev.joseph.musician.MusicianBasic;

public class Main {

    public static void main(String[] args) {
        secondExercise();
    }

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

    private static void secondExercise() {
        CVBasic cvBasic = new CVBasic("Frank N Steinisch", "Networking");
        System.out.println(cvBasic.info());

        cvBasic.removeSkill();
        System.out.println(cvBasic.info());

        cvBasic.addSkill("Programming");
        System.out.println(cvBasic.info());

        System.out.println(" ");

        CVAdvanced cvAdvanced = new CVAdvanced("Frank N Steinisch", "Networking");
        System.out.println(cvAdvanced.info());
        
        cvAdvanced.addSkill("C++");
        System.out.println(cvAdvanced.info());

        cvAdvanced.removeSkill("C++");
        System.out.println(cvAdvanced.info());

        cvAdvanced.removeSkill("Networking");
        System.out.println(cvAdvanced.info());
    }
}
