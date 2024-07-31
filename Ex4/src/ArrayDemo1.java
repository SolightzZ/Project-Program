/*
    ✨ นายปณิธิ จ่าเหม
    📂 66040233122
*/
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] anArray = new int[100];

        for (int i = 0; i < 100; i++) {
            anArray[i] = (i + 1) * 10;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("index " + i + ": " + anArray[i]);
        }
    }
}
