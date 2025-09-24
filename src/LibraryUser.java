interface LibraryUser {
    String getUserType();
    void borrowMedia(Media media);
    void returnMedia(Media media);
    int getMaxBorrowLimit();
}

class Student implements LibraryUser {
    private String name, studentId;

    public Student(String name, String studentId) {
        this.name = name; this.studentId = studentId;
    }
    public String getUserType() { return "Student"; }
    public int getMaxBorrowLimit() { return 3; }

    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            System.out.println(name + " (Student) borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available");
        }
    }

    public void returnMedia(Media media) {
        media.returnItem();
    }
}

class Teacher implements LibraryUser {
    private String name, employeeId;

    public Teacher(String name, String employeeId) {
        this.name = name; this.employeeId = employeeId;
    }
    public String getUserType() { return "Teacher"; }
    public int getMaxBorrowLimit() { return 5; }

    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            System.out.println(name + " (Teacher) borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available");
        }
    }

    public void returnMedia(Media media) {
        media.returnItem();
    }
}

class Librarian implements LibraryUser {
    private String name, employeeId;

    public Librarian(String name, String employeeId) {
        this.name = name; this.employeeId = employeeId;
    }
    public String getUserType() { return "Librarian"; }
    public int getMaxBorrowLimit() { return 10; }

    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            System.out.println(name + " (Librarian) borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available");
        }
    }

    public void returnMedia(Media media) {
        media.returnItem();
    }
}
