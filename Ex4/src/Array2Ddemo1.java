public class Array2Ddemo1 {
    public static void main(String[] args) {
    int number[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
    };
    String person[][] = {
            {"Rawadee", "Kunawut"},
            {"Phanupan","Khwnachai"},
            {"Nutthawn","Treerat"}
    };
        System.out.println("\n");
    for(int i = 0; i < person.length; i++){
         for (int j = 0; j< person[i].length; j++){
             System.out.printf("%s \t", person[i][j]);
         }
         System.out.println("\n----------------------");
    }

        System.out.println("\n✦ ------------- ⋆⋅☆⋅⋆ ------------- ✦\n");

    for(int i = 0; i < number.length; i++){
            for (int j = 0; j< number[i].length; j++){
                System.out.printf("%s \t", number[i][j]);
            }
            System.out.println("\n---------------------");
        }

        System.out.println("\n✦ ------------- ⋆⋅☆⋅⋆ ------------- ✦\n");

    for (int[] row : number) {
        for (int val : row){
            System.out.printf("%5d", val);
            }
            System.out.println("\n-----------------------");
        }
    }
}



