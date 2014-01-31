package com.trafficmon;
import java.util.Calendar;

public abstract class ZoneBoundaryCrossing {

    private final Vehicle vehicle;
    private final long time;
    private final long year;
    private final long month;
    private final long dayOfMonth;


    /* sa 240114
     private final long newdate;
   //  private Calendar newdate;
 */
    public ZoneBoundaryCrossing(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.time = System.currentTimeMillis();

        Calendar now = Calendar.getInstance();
        this.year = now.get(Calendar.YEAR);
        this.month = now.get(Calendar. MONTH);
        this.dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
        System.out.println("Time is " + this.time);
        System.out.println("Year is " + this.year);
        System.out.println("Month is " + this.month);
        System.out.println("Day of Month is " + this.dayOfMonth);
        // Insert call datestamp here for vwhicle

/*
        Calendar date = Calendar.getInstance();
      //  Calendar currentcal = Calendar.getInstance();

        newdate = date.set(date.get(Calendar.YEAR),date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH));

       // this.date = System.nanoTime();
//System.out.println("Time Date is " + this.date);
*/

/*
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);

        System.out.println("Calendar YEAR " + year);
        System.out.println("Calendar MONTH " + month);
        System.out.println("Calendar DAY " + day);

        // sa

        Calendar cal1 = Calendar.getInstance();
        Calendar currentcal = Calendar.getInstance();

        cal1.set(cal1.get(Calendar.YEAR),cal1.get(Calendar.MONTH), cal1.get(Calendar.DAY_OF_MONTH));
     // currentcal.set(currentcal.get(Calendar.YEAR),currentcal.get(Calendar.MONTH), currentcal.get(Calendar.DAY_OF_MONTH));
        currentcal.set(currentcal.get(Calendar.YEAR),currentcal.get(Calendar.MONTH), currentcal.get(Calendar.DAY_OF_MONTH));



        if(cal1.before(currentcal))
            System.out.println("Current date(" + new SimpleDateFormat("dd/MM/yyyy").
                    format(currentcal.getTime()) + ") is greater than the given date " + new
                    SimpleDateFormat("dd/MM/yyyy").format(cal1.getTime()));
        else if(cal1.after(currentcal))
            System.out.println("Current date(" + new SimpleDateFormat("dd/MM/yyyy").
                    format(currentcal.getTime()) + ") is less than the given date " + new
                    SimpleDateFormat("dd/MM/yyyy").format(cal1.getTime()));
        else
            System.out.println("Both date are equal.");
    }



        // sa


       // cal.set(2000, Calendar.JUNE, 29);
    //    currentcal.set(currentcal.get(Calendar.YEAR),
     //           currentcal.get(Calendar.MONTH), currentcal.get(Calendar.DAY_OF_MONTH));

      //  DATEDIFF('d',NOW(),exdate)
  //  }
  */

    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public long timestamp() {
        return time;
    }

    public long yearstamp() {
        return year;
    }

    public long monthstamp() {
        return month;
    }

    public long datofmonthstamp() {
        return dayOfMonth;
    }


}

