package factory;

import static org.junit.Assert.assertNotNull;

public class CourseDemo {
    public static void main(String[] args) {
        Course hldCourse = CourseFactory.getCourse("HLD");
        Course lldCourse = CourseFactory.getCourse("LLD");

        assertNotNull(hldCourse);
        System.out.print("HLD Modules: ");
        System.out.println(hldCourse.getModules());

        assertNotNull(lldCourse);
        System.out.print("LLD Modules: ");
        System.out.println(lldCourse.getModules());
    }
}
