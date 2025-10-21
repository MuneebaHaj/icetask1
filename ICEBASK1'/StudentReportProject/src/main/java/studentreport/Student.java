package studentreport;

public abstract class Student implements iReport {
    protected int studentNumber;
    protected double testResult;
    protected double assignmentResult;
    protected double examResult;

    // Constructor
    public Student(int studentNumber, double testResult, double assignmentResult, double examResult) {
        this.studentNumber = studentNumber;
        this.testResult = testResult;
        this.assignmentResult = assignmentResult;
        this.examResult = examResult;
    }

    // Get methods
    public int getStudentNumber() { return studentNumber; }
    public double getTestResult() { return testResult; }
    public double getAssignmentResult() { return assignmentResult; }
    public double getExamResult() { return examResult; }
}