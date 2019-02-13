package dev.joseph.cv;

import java.util.ArrayList;
import java.util.Arrays;

public class CVAdvanced {

    private String studentName;
    private ArrayList<String> skills;

    public CVAdvanced(String name, String initialSkill) {
        this.studentName = name;
        this.skills = new ArrayList<>();
        this.skills.add(initialSkill);
    }

    public void addSkill(String skillName) {
        this.skills.add(skillName);
    }

    public void removeSkill(String skillName) {
        this.skills.remove(skillName);
    }

    public String info() {
        String result = "";

        //--- Add student name.
        result += "Student: " + this.studentName + "\n";

        //--- Loop over instruments.
        result += "Skills:\n";
        if (this.skills.size() > 0) {
            for (String skill : this.skills) {
                result += skill + "\n";
            }
        } else {
            result += "None";
        }

        return result;
    }
}
