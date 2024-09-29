import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {

    @Test
    void addStudent() {
        Classroom classroom = new Classroom();
        assertDoesNotThrow(() -> classroom.addStudent("John Doe"));
    }

    @Test
    void removeStudent() {
        Classroom classroom = new Classroom();
        assertDoesNotThrow(() -> classroom.removeStudent("Jane Doe"));
    }

    @Test
    void markAttendance() {
        Classroom classroom = new Classroom();
        assertDoesNotThrow(() -> classroom.markAttendance("John Doe"));
    }

    @Test
    void getNumberOfStudents() {
        Classroom classroom = new Classroom();
        assertEquals(30, classroom.getNumberOfStudents());
    }

    @Test
    void getClassAverage() {
        Classroom classroom = new Classroom();
        assertEquals(85.5, classroom.getClassAverage());
    }
}
