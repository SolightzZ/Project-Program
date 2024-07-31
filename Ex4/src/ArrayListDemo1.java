import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Carrot");

        System.out.println(fruits);
        System.out.println(fruits.get(1));
        fruits.add("Orange");
        fruits.add("Coconut");
        System.out.println(fruits);
        fruits.set(2, "Deian");
        System.out.println(fruits);
        fruits.remove(3);
        System.out.println(fruits);
        System.out.println("\n✦ ------------- ⋆⋅☆⋅⋆ ------------- ✦\n");
        for (int i=0; i< fruits.size(); i++){
            System.out.println(fruits.get(i));
        }
        System.out.println("\n✦ ------------- ⋆⋅☆⋅⋆ ------------- ✦\n");
        fruits.forEach((f) -> System.out.println(f)); // ใข้ได้แค่ 1 งานเท่านั้น
    }
}
