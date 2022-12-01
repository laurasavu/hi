package Lectia12.Fire.Timer;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer=new Timer();
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                System.out.println("task");
            }
        };
        timer.schedule(timerTask, Date.from(LocalDate.of(2022,8,22)
                .atStartOfDay().toInstant(ZoneOffset.UTC)));

    }

}
