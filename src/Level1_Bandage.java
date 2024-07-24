import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Level1_Bandage {
    public int solution(){
        int[] bandage = {1, 1, 1};
        int health = 5;
        int[][] attacks = {{1, 2}, {3, 2}};
        List<Integer> attackTime = new ArrayList<>();
        HashMap<Integer,Integer> attackMap = new HashMap<>();
        int maxhealth = health;
        int maxTime = 0; //마지막 공격시간
        int continueTime = 0; //연속성공시간
        int ps = 0;

        //마지막 공격시간 구하기
        for (int i = 0; i < attacks.length; i++) {
            if (attacks[i][0] > maxTime) {
                maxTime = attacks[i][0];
            }
            attackTime.add(attacks[i][0]);
            attackMap.put(attacks[i][0],attacks[i][1]);
        }

        for (int i = 0; i < maxTime + 1; i++) {
            ps = 0;
            if (attackTime.contains(i)) {
                ps =1;
                health = health-attackMap.get(i);
                continueTime = 0;
                System.out.println("i = " + i + "    attack : "+attackMap.get(i)+" heart= " + health);
            }

            if(health <= 0 ){
                return -1;
            }else if(health < maxhealth){
                health = health + bandage[1];
            }


            if(continueTime == bandage[0]){
                health += bandage[2];
                continueTime = 0;
            };

            if(health >= maxhealth) {health = maxhealth;}
            System.out.println(i +" health = " +health);

            if( ps == 0) continueTime++;
        }
        return health;
    }
}
