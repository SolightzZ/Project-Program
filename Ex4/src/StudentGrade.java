/*
    ✨ นายปณิธิ จ่าเหม
    📂 66040233122
 */
public class StudentGrade {
    private String id;
    private String name;
    private int score;
    private String grade;

    public StudentGrade() {
        this.id = "";
        this.name = "";
        this.score = 0;
        this.grade = "";
    }

    public StudentGrade(String id, String name) {
        this.id = id;
        this.name = name;
        this.score = 0;
        this.grade = "";
    }

    public StudentGrade(String id, String name, int score, String grade) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getGrade() {
        return grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int midterm, int finalExam) {
        this.score = midterm + finalExam;
        setGrade();
    }

    private void setGrade() {
        if (score >= 80) {
            grade = "A";
        } else if (score >= 75) {
            grade = "B+";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 65) {
            grade = "C+";
        } else if (score >= 60) {
            grade = "C";
        } else if (score >= 55) {
            grade = "D+";
        } else if (score >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    public void getInfo() {
        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Score   : " + score);
        System.out.println("Grade   : " + grade);
    }
}
