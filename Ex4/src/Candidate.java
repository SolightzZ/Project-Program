/*
        ✨ นายปณิธิ จ่าเหม
        📂 66040233122
 */
public class Candidate {
    private String id;
    private String name;
    private String major;

    public Candidate() {
        this.id = "";
        this.name = "";
        this.major = "";
    }
    public Candidate(String id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public void displayCandidate() {
        System.out.println("    ID    : " + id);
        System.out.println("    Name  : " + name);
        System.out.println("    Major : " + major);
    }
}
