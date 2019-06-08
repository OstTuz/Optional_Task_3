import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of month from 1 to 12");
        int number;
        do
        {
            number = scanner.nextInt();
            if (number < 1 || number > 12)
            {
                System.out.println("Error, input number from 1 to 12 !!!");
            }else {
                break;
            }
        }while (true);

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM");

        Calendar date = new GregorianCalendar();
        date.set(Calendar.MONTH, --number);
        System.out.println(dateFormat.format(date.getTime()));
    }
}
