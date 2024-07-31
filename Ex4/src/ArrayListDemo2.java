import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<StudentGrade> std = new ArrayList<StudentGrade>();

        std.add(new StudentGrade("001", "Paniti"));
        std.add(new StudentGrade("002", "Paniti", 80, "A"));
        std.add(new StudentGrade());
        std.set(2, new StudentGrade("003", "Paniti", 65, "C+"));

        StudentGrade s = new StudentGrade();
        s.setId("004");
        s.setName("Paniti");
        s.setScore(45, 45);
        std.add(s);

        for (int i = 0; i < std.size(); i++) {
            System.out.println("\n✦ ------------- ⋆⋅☆⋅⋆ ------------- ✦\n");
            std.get(i).getInfo();
        }
    }
}
