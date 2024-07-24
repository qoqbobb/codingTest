public class Level1_analyze {
    public int[][] solution(){
        int[][] data ={{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        int[][] answer = new int[data.length][(data[0].length)-1];

        answer = data;

        for(int i = 0 ; i< answer.length; i++){
            System.out.println("answer[i][0] = " + answer[i][0]);
            System.out.println("answer[i][1] = " + answer[i][1]);
            System.out.println("answer[i][2] = " + answer[i][2]);
            System.out.println("answer[i][3] = " + answer[i][3]);

        }



        return answer;

    }
}
