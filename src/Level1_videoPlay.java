import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Level1_videoPlay {

    public static String solution() {
        String video_len = "10:55";
        String pos = "00:05";
        String op_start = "00:15";
        String op_end = "06:55";
        String[] commands = {"prev", "next", "next"};

        int pos_time = Integer.parseInt(pos.split(":")[0])*60 + Integer.parseInt(pos.split(":")[1]);
        int video_time = Integer.parseInt(video_len.split(":")[0])*60 + Integer.parseInt(video_len.split(":")[1]);
        int op_start_time = Integer.parseInt(op_start.split(":")[0])*60 + Integer.parseInt(op_start.split(":")[1]);
        int op_end_time = Integer.parseInt(op_end.split(":")[0])*60 + Integer.parseInt(op_end.split(":")[1]);


        if(op_start_time <= pos_time && pos_time <= op_end_time){
            pos_time = op_end_time;
        }

        for (String command : commands) {
            switch (command) {
                case "next":
                    pos_time += 10;
                    pos_time = pos_time > video_time ? video_time : pos_time;
                    if(op_start_time <= pos_time && pos_time <= op_end_time){
                        pos_time = op_end_time;
                    }

                    break;
                case "prev":
                    pos_time -= 10;
                    pos_time = pos_time < 0 ? 0 : pos_time;
                    if(op_start_time <= pos_time && pos_time <= op_end_time){
                        pos_time = op_end_time;
                    }

                    break;
            }
        }
        String answer = "";
        answer = String.format("%02d", pos_time/60) + ":" + String.format("%02d", pos_time%60);

        return answer;
    }




}
