public class College {

    private String name;
    private String id;
    private double accommodationCapacity;
    private int rooms;

    private int students;
    private double lecturers;

    public College(String name, String id, int studentsEnrolled, int currentLecturers, int roomsInCollege){
        this.name = name;
        this.id = id;
        this.rooms = roomsInCollege;
        this.students = studentsEnrolled;
        this.lecturers = currentLecturers;
    }

    public String getName() { return name; }
    public String getId() { return id;}
    public int getStudents() { return students;}
    public double getLecturers() { return lecturers;}
    public double getRooms() { return rooms;}
    public double getAccommodationCapacity() { return accommodationCapacity; }

    public void updateAccommodationCapacity() {
        int diff = (rooms * 7) + (students / 3);
        accommodationCapacity = diff / 3;
    }

    public void studyCompleted(int studentsGraduating){
        this.students -= studentsGraduating;
    }

    public void updateLecturerContracts() {
        if ((lecturers + 1) <= students) {
            lecturers += 1;
        }
    }

}
