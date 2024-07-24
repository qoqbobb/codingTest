import java.util.Arrays;
import java.util.HashMap;

public class Level1_memoryScore {
    public int[] solution(){
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may"},{"kein", "deny", "may"}, {"kon", "coni"}};




        int count;
        int[] result = new int[photo.length];
        HashMap<String,Integer> score = new HashMap<>();
        //이름과 추억점수 매핑
        for(int i= 0; i<name.length;i++){
            score.put(name[i] ,yearning[i]);    
        }
        //값계산
        for(int i = 0 ; i<photo.length; i++){
            count = 0;
            for(int j = 0; j<photo[i].length; j++){
                if(score.containsKey(photo[i][j])){
                   count += score.get(photo[i][j]);
                }

                result[i] = count;


            }
        }
        
        return result;
    }
}
