public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ellyza Mae Ybañez", 21, "BSIT", 91.0, 89.0, 80.0);
        Student s2 = new Student("Kurt John Ong", 20, "BSBA", 96.0, 90.0, 75.0);
        Student s3 = new Student("Xyriel Angelo Ang", 23, "BSIT", 76.0, 77.0, 79.0);

        Student[] students = {s1, s2, s3};
        int passingCount = 0;

        for (Student s : students) {
            System.out.println("\nStudent Information:");
            s.displayInfo();
            double average = s.calculateAverage();
            System.out.printf("Average: %.2f\n", average);
            String letterGrade = s.getLetterGrade();
            System.out.println("Letter Grade: " + letterGrade);

            if (s.isPassing()) {
                System.out.println("Status: PASSED");
                passingCount++;
            } else {
                System.out.println("Status: FAILED");
            }
        }

        System.out.println("\nSummary: " + passingCount + " out of " + students.length + " students are passing.");
    }
}
