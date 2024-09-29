public class Classroom {

    public void addStudent(String studentName) {
        System.out.println("Student added: " + studentName);
    }

    public void removeStudent(String studentName) {
        System.out.println("Student removed: " + studentName);
    }

    public void markAttendance(String studentName) {
        System.out.println("Attendance marked for: " + studentName);
    }

    public int getNumberOfStudents() {
        return 30;  // Placeholder value
    }

    public void startClass() {
        System.out.println("Class started.");
    }

    public void endClass() {
        System.out.println("Class ended.");
    }

    public void assignHomework(String homework) {
        System.out.println("Homework assigned: " + homework);
    }

    public void gradeHomework(String studentName, int grade) {
        System.out.println("Grade " + grade + " assigned to " + studentName);
    }

    public void scheduleTest(String testDate) {
        System.out.println("Test scheduled on: " + testDate);
    }

    public double getClassAverage() {
        return 85.5;  // Placeholder value
    }
}

