package studentreport;

public class Student_Report extends Student {

    public Student_Report(int studentNumber, double testResult, double assignmentResult, double examResult) {
        super(studentNumber, testResult, assignmentResult, examResult);
    }

    @Override
    public void print_report() {
        double testWeight = testResult * 0.25;
        double assignmentWeight = assignmentResult * 0.25;
        double examWeight = examResult * 0.50;
        double finalResult = testWeight + assignmentWeight + examWeight;

        System.out.println("*****************************");
        System.out.println("STUDENT REPORT");
        System.out.println("*****************************");
        System.out.println("STUDENT NUMBER: " + studentNumber);
        System.out.println("TEST WEIGHTING: " + testWeight);
        System.out.println("ASSIGNMENT WEIGHTING: " + assignmentWeight);
        System.out.println("EXAM WEIGHTING: " + examWeight);
        System.out.println("FINAL RESULT: " + finalResult + "%");
        System.out.println("*****************************");
    }

}
    