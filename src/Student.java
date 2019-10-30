class Student {
    private String name;
    private String studentNumber;

    Student(String name, String studentNumber){
        this.name = name;
        this.studentNumber = studentNumber;

    }

    String getName(){
        return this.name;
    }

    String getStudentNumber(){
        return this.studentNumber;
    }


    public String toString() {
        return this.name + " (" + this.studentNumber + ")";
    }
}
