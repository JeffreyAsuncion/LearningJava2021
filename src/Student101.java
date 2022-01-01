public class Student101 {
    public static void main(String[] args) {
        int studentAge = 45;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;

        String studentFirstName = "Jeffrey";
        String studentLastName = "Asuncion";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);


        System.out.println(" Student's Age : " + studentAge);
        System.out.println(" Student's GPA : " + studentGPA);
        System.out.println("Has Attendance : " + hasPerfectAttendance);
        System.out.println("Student's Name : " + studentFirstName + " " + studentLastName);
        System.out.println("Student's 1st  : " + studentFirstInitial);
        System.out.println("Student's Last : " + studentLastInitial);
    }
}