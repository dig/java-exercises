package dev.joseph.cv;

public class CVBasic {

    private String studentName;
    private String skill;

    public CVBasic(String name, String initialSkill) {
        this.studentName = name;
        this.skill = initialSkill;
    }

    public void addSkill(String skillName) {
        if (this.skill == "") {
            this.skill = skillName;
        }
    }

    public void removeSkill() {
        this.skill = "";
    }

    public String info() {
        return String.format(
                "Student: %s\nSkill: %s",
                this.studentName, this.skill
        );
    }


}
