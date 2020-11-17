package First;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class KycDate {
    public static long getDifferenceDays(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    public static void main(String args[]) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String input = br.readLine();
            String dates[] = input.trim().split("\\s+");
            DateFormat d = new SimpleDateFormat("dd-MM-yyyy");
            Date signupDate = d.parse(dates[0]);
            Date kycDate = d.parse(dates[1]);
            Calendar c1 = Calendar.getInstance();
            c1.setTime(signupDate);
            Calendar c2 = Calendar.getInstance();
            c2.setTime(kycDate);

            int diff = c2.get(Calendar.YEAR)-c1.get(Calendar.YEAR);
            long dayDiff = getDifferenceDays(c1.getTime(),c2.getTime());

            String res1="";String res2="";
            if(diff<1 || dayDiff<335){
                System.out.println("No Range");
            }
            else{
                c1.add(Calendar.YEAR,diff);
                //System.out.println(c1.getTime().after(kycDate));
                if(c1.getTime().before(kycDate)){
                    long days  = getDifferenceDays(c1.getTime(),c2.getTime());
                    c1.add(Calendar.DATE,-30);
                    res1 = d.format(c1.getTime());
                    if(days<=30){
                        res2=d.format(kycDate);
                    }
                    else
                    {
                        c1.add(Calendar.DATE,60);
                        res2 = d.format(c1.getTime());
                    }


                }
                else if(c1.getTime().after(kycDate))
                {

                    long days  = getDifferenceDays(kycDate,c1.getTime());


                    if(days<=30){
                        c1.add(Calendar.DATE,-30);
                        res1 = d.format(c1.getTime());
                        res2=d.format(kycDate);
                    }
                    else
                    {
                        c1.add(Calendar.DATE,-30);
                        res1 = d.format(c1.getTime());
                        c1.add(Calendar.DATE,60);
                        res2 = d.format(c1.getTime());

                    }

                }
                else{
                    c1.add(Calendar.DATE,-30);
                    res1 = d.format(c1.getTime());
                    c1.add(Calendar.DATE,60);
                    res2 = d.format(c1.getTime());
                }
            }
            System.out.println(res1+" "+res2);

        }
    }

}
