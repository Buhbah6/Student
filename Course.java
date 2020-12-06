package student;

/**
 * Course object
 * @author Anthony Nadeau
 */
public class Course {
    String courseName;
    double credit;
    double examScore;
    double assignmentScore;
    
    /**
     * Default constructor
     */
    public Course() {
        this.courseName  = null;
        this.credit = 0;
        this.examScore = 0;
        this.assignmentScore = 0;
    }
    
    /**
     * Constructor with course name and credit 
     * @param courseName is the name of the course
     * @param credit the amount of credits you get from the course
     */
    public Course(String courseName, double credit) {
        this.courseName = courseName;
        this.credit = credit;
    }
    
    /**
     * Constructor with all 4 data members
     * @param courseName name of the course
     * @param credit the amount of credits associated with the course
     * @param examScore the score earned on the exam
     * @param assignmentScore the score earned from the assignment
     */
    public Course(String courseName, double credit, double examScore, double assignmentScore) {
        this.courseName = courseName;
        this.credit = credit;
        this.examScore = examScore;
        this.assignmentScore = assignmentScore;
    }
    
    /**
     * Copy Constructor
     * @param course course object
     */
    public Course(Course course) {
        this.courseName = course.courseName;
        this.credit = course.credit;
        this.examScore = course.examScore;
        this.assignmentScore = course.assignmentScore;
    }
    
    /**
     * Calculates the final score
     * @return the final score
     */
    public double calcFinalScore() {
        double examWeight = 0.6;
        double assignmentWeight = 0.4;
        return (examScore * examWeight) + (assignmentScore * assignmentWeight);  
    }
    
    /**
     * Checks to see if the course was passed or not
     * @return true or false, if the course was passed or not
     */
    public boolean isPassed() {
        double finalScore = calcFinalScore();
        return finalScore >= 60;
    }
    
    /**
     * Compares the data members of two objects
     * @param course the course object
     * @return true or false, if the objects are equal to each other.
     */
    public boolean equals(Course course) {
        return this.assignmentScore == course.assignmentScore &&
                this.courseName.equals(course.courseName) &&
                this.credit == course.credit &&
                this.examScore == course.examScore;
    }
    
    /**
     * Converts the data members of the object to a string.
     * @return the data members of the object as a string
     */
    @Override
    public String toString() {
        String str = "";        
        str += String.format("%-20s: %s\n", "Course Name", courseName);
        str += String.format("%-20s: %.1f\n", "Credit", credit);
        str += String.format("%-20s: %.1f\n", "Exam Score", examScore);
        str += String.format("%-20s: %.1f\n", "Assignment Score", assignmentScore);
        str += String.format("%-20s: %.1f\n", "Final Score", calcFinalScore());
        return str;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getExamScore() {
        return examScore;
    }

    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }

    public double getAssignmentScore() {
        return assignmentScore;
    }

    public void setAssignmentScore(double assignmentScore) {
        this.assignmentScore = assignmentScore;
    } 
}