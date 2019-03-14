import java.util.*;


public class University {

    private ArrayList<College> universityColleges;
    public University(){
        this.universityColleges = new ArrayList<>();
    }

    public void addCollege(String name, String id, int studentsEnrolled, int currentLecturers, int roomsInCollege){
        College MyCollege = new College(name, id, studentsEnrolled, currentLecturers, roomsInCollege);
        universityColleges.add(MyCollege);
    }

    public void updateAccommodationCapacity(){
        for(College MyCollege : universityColleges) {
            MyCollege.updateAccommodationCapacity();
        }
    }

    public void updateLecturerContracts(int index){
        College MyCollege = this.universityColleges.get(index);
        MyCollege.updateLecturerContracts();
    }

    public void studyCompleted(String id, int students) {
        for (College MyCollege : universityColleges) {
            if (MyCollege.getId().equals(id)) {
                MyCollege.studyCompleted(students);
            }
        }
    }

    public int getCount(){
        return this.universityColleges.size();
    }

    public String displayItem(int index){
        String strValue = "\n";
        strValue += displayItem(index, Attribute.NAME_ID)+ "\n";
        strValue += displayItem(index, Attribute.ROOMS_CAPACITY)+ "\n";
        strValue += displayItem(index, Attribute.STUDENT_LECTURER)+ "";
        return strValue;
    }

    public String displayItem(int index, Attribute selAttribute){
        College myCollege = this.universityColleges.get(index);
        String sInfo = "";

        switch (selAttribute) {
            case NAME_ID:
                sInfo = "NAME: " + myCollege.getName();
                sInfo += ", ID: " + myCollege.getId();
                break;
            case ROOMS_CAPACITY:
                sInfo = "ROOMS: " + myCollege.getRooms();

                if (myCollege.getAccommodationCapacity() <= 0) {
                    sInfo += ",  ACCOMMODATION CAPACITY:" + " ***NOT SET*** ";
                } else {
                    sInfo += ",  ACCOMMODATION CAPACITY: " + myCollege.getAccommodationCapacity() ;
                }

                break;
            case STUDENT_LECTURER:
                sInfo = "STUDENTS: " + myCollege.getStudents();
                sInfo += ", LECTURERS: " + myCollege.getLecturers();
                break;
        }

        return sInfo;
    }
}
