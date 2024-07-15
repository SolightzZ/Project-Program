/*
    รหัสนักศึกษา : ุ66040233122
    ชื่อ - สกุล : นายปณฺิธิ จ่าเหม

 */
public class Dog {
    private   String dogName ;
    private   String breed ;
    private   int age ;
    private   String color ;

    public void setName(String name){
        dogName = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getDogName(){ return  dogName; }
    public String getBreed(){ return  breed; }
    public int getAge(){ return age; }
    public String getColor(){ return  color; }

    public void showDogInfo() {
        System.out.println("\n+++++ Dog Information +++++");
        System.out.println("Dog name : " + getDogName());
        System.out.println("Breed : " + getBreed());
        System.out.println("Age(yr.) : " + getAge());
        System.out.println("Color : " + getColor());
        System.out.println("----------------------------------");
    }
}

