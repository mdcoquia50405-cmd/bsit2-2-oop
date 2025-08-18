public class Main {
    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();


        String studentName = "John Smith";
        double average = calculator.calculateAverage(85.5, 92.0, 78.5, 90.0);
        String letterGrade = calculator.getLetterGrade(average);

        System.out.println("first displayResult");
        calculator.displayResult(studentName, average);

        System.out.println("\nUsing second displayResult");
        calculator.displayResult(studentName, average, letterGrade);
    }
}


