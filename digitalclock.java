
public class saathesaplama {
    public static void main(String[] args) {

        long millis = System.currentTimeMillis();

        long total_seconds = millis / 1000;
        long current_second = total_seconds % 60;

        long total_minutes = total_seconds / 60;
        long current_minute = total_minutes % 60;

        long total_hours = total_minutes / 60;
        long current_hour = (total_hours % 24) + 3;

        System.out.println(current_hour + ":" + current_minute + ":" + current_second);

        

    }
}
