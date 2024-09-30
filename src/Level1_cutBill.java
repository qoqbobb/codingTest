import java.util.Arrays;

public class Level1_cutBill {
    public int solution() {
        int answer = 0;

        int[] wallet = new int[2];
        int[] bill = new int[2];
        wallet[0] = 50;
        wallet[1] = 50;
        bill[0] = 100;
        bill[1] = 241;

        while(true){
            if(wallet[0] >= bill[0] && wallet[1] >= bill[1]){
                return answer;
            }else if(wallet[1] >= bill[0] && wallet[0] >= bill[1]){
                return answer;
            }else{
                if(bill[0] > bill[1]){
                    bill[0] = bill[0]/2;
                }else{
                    bill[1] = bill[1]/2;
                }
                System.out.println("bill = " + Arrays.toString(bill));
                answer += 1;

            }
        }

    }
}

