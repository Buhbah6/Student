package student;

/**
 * Student object
 * @author Anthony Nadeau
 */
public class Student {
    private String name;
    private String gender;
    private String email;
    private Course course1;
    private Course course2;
    private Course course3;

    public Student() {
        this.name = null;
        this.gender = null;
        this.email = null;
        this.course1 = new Course();
        this.course2 = new Course();
        this.course3 = new Course();
    }

    public Student(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public Student(String name, String gender, String email, Course course1, 
            Course course2, Course course3) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }
    
    public Student(Student student) {
        this.name = student.name;
        this.gender = student.gender;
        this.email = student.email;
        this.course1 = student.course1;
        this.course2 = student.course2;
        this.course3 = student.course3;
    }
    
    public int calcPassedCourseNum() {
        int passedCourses = 0;
        if (course1.isPassed())
            passedCourses++;
        if (course2.isPassed())
            passedCourses++;
        if (course3.isPassed())
            passedCourses++;
        return passedCourses;
    }
    
    public double calcTotalCredit() {
        double totalCredits = 0;
        if (course1.isPassed())
            totalCredits += course1.credit;
        if (course2.isPassed())
            totalCredits += course2.credit;
        if (course3.isPassed())
            totalCredits += course3.credit;
        return totalCredits;        
    }
    
    public boolean isEmailValid() {
        char at = '@';
        char dot = '.';
        return email.indexOf(at) != -1 && email.indexOf(dot) != -1 && 
                email.indexOf(dot) > email.indexOf(at) && email.indexOf(at) != 0
                && email.indexOf(dot) > email.indexOf(at) + 1 &&
                email.indexOf(dot) != email.length() - 1 && email.length() <= 320;
    }
    
    public boolean equals(Student student) {
        return this.name.equals(student.name) &&
                this.gender.equals(student.gender) &&
                this.email.equals(student.email) &&
                this.course1 == student.course1 &&
                this.course2 == student.course2 &&
                this.course3 == student.course3;
    }
    
    @Override
    public String toString() {
        String str = "";
        str += String.format("%-15s: %s\n", "Name", name);
        str += String.format("%-15s: %s\n", "Gender", gender);
        str += String.format("%-15s: %s\n\n", "Email", email);
        str += String.format("%-16s %-25s %-10s %s\n", "Course", "Name", 
                "Credit", "Score");
        str += "-----------------------------------------------------------\n";
        str += String.format("%-15s: %-25s %-10s %.1f\n", "Course 1", course1.courseName, 
                course1.credit, course1.calcFinalScore());
        str += String.format("%-15s: %-25s %-10s %.1f\n", "Course 2", course2.courseName, 
                course2.credit, course2.calcFinalScore());
        str += String.format("%-15s: %-25s %-10s %.1f\n", "Course 3", course3.courseName, 
                course3.credit, course3.calcFinalScore());
        str += String.format("%-15s: %d\n", "Passed Courses", calcPassedCourseNum());
        str += String.format("%-15s: %.1f\n", "Total Credits", calcTotalCredit());
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course getCourse1() {
        return course1;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public Course getCourse2() {
        return course2;
    }

    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    public Course getCourse3() {
        return course3;
    }

    public void setCourse3(Course course3) {
        this.course3 = course3;
    } 
}