package factory;

import java.util.Calendar;
import java.util.Locale;

public class FactoryEverydayDemo {
    public static void main(String[] args) {
//        Calendar cal = Calendar.getInstance();
        Calendar cal = Calendar.getInstance(Locale.US);
        System.out.println(cal); // this is to get the actual concrete implementation used
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
