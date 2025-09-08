package lesson23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
        Date date = new Date(l);
        System.out.println(date);

        int month = date.getMonth();
        System.out.println(month);
        Calendar instance = Calendar.getInstance();
        int i = instance.get(Calendar.MONTH);
        System.out.println(i);


        //  x=1234205235
        //  y=1234234234
        //  -- the same day?


//        + 1000 * 60 * 60 * 24
        // 10 sep

        // begin of 10 sep < date  < end of 10 sep

        date.setTime(123232123154235325L);
        System.out.println(date);

        instance.set(2030, Calendar.JUNE, 22, 19, 33, 45);
        System.out.println(instance.getTime());


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm 'time in Minsk'");
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);


        try {
            Date parse = simpleDateFormat.parse("12 Oct 2026 11:40 time in Minsk");
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}
