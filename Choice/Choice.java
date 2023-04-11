public class Choice{
    public static void main(String[] args) {
        
        int key[] = {4,2,4,3,3,4,1,5,1,4};

        int[][] stdAns = {
            {1,2,1,3,3,4,5,5,1,4},
            {4,2,1,2,3,1,5,5,1,4},
            {5,4,4,1,3,2,5,5,1,4},
            {3,2,1,5,4,3,5,5,1,4},
            {1,2,4,3,3,4,5,5,1,4},
            {2,2,5,3,3,4,5,5,1,4},
            {2,2,1,3,3,4,5,5,1,4},
            {5,2,5,3,3,4,5,5,1,4}     
        };

        int[] score = new int[8];

        for(int i=0; i<stdAns.length; i++){
            for(int j=0; j<key.length; j++){
                if(key[j] == stdAns[i][j]){
                    score[i]++;
                }
            }
        }

        for(int i=0; i<8; i++){
            System.out.println("Student " + i + " score is " + score[i]);
        }


    }
}
