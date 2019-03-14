public class Test {

    public static void main(String[] args) {
        System.out.println("******STEP 1 OBJECT CREATION************");
        University myUniversity = new University();

        System.out.println("******STEP 2 ADD COLLEGES************");
        myUniversity.addCollege("Boyle College", "BC", 31, 11, 12);
        myUniversity.addCollege("Sussex College", "SX", 14,4, 3);
        display(myUniversity);

        System.out.println("\n******STEP 3 SET ACCOMMODATION CAPACITY (WARD*3)************");
        myUniversity.updateAccommodationCapacity();

        display(myUniversity);

        System.out.println("\n******STEP 4 RE UPDATE LECTURER CONTRACTS COLLEGE 1 (+1)************");
        display(myUniversity,0);
        myUniversity.updateLecturerContracts(0);
        display(myUniversity,0);

        System.out.println("\n** STEP 5 FINISHED STUDY: 5 from BC **");
        display(myUniversity,0);

        myUniversity.studyCompleted("BC", 5);
        display(myUniversity,0);
    }

    public static void display(University myUniversity, int index) {
        System.out.println(myUniversity.displayItem(index));
    }

    public static void display(University myUniversity) {
        for (int i = 0;i<myUniversity.getCount(); i++) {
            System.out.println(myUniversity.displayItem(i));
        }
    }
}
