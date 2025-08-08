public class Main {
    public static void main(String[] args) {
        // Create 3 Student objects
        Student s1 = new Student("Alice", 20, "BSIT", 85, 90, 88);
        Student s2 = new Student("Bob", 21, "BSCS", 75, 70, 68);
        Student s3 = new Student("Charlie", 19, "BSIS", 92, 89, 94);

        Student[] students = {s1, s2, s3};

        int passingCount = 0;


        for (Student s : students) {
            s.displayInfo();
            double avg = s.calculateAverage();
            String letterGrade = s.getLetterGrade();
            boolean passing = s.isPassing();

            System.out.printf("Average: %.2f\n", avg);
            System.out.println("Letter Grade: " + letterGrade);
            System.out.println("Status: " + (passing ? "PASSING" : "FAILING"));
            System.out.println("-----");

            if (passing) {
                passingCount++;
            }
        }


        System.out.println("Total Students Passing: " + passingCount);
    }
}
