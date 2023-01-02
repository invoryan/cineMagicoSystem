package com.unamba.cinemagicoabancay.body;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

public class dateToday extends Thread {
    JLabel jLabel;
    public dateToday(JLabel jlabel) {
        this.jLabel=jlabel;
    }
    
    @Override
    public void run(){
        try {
            for(;;){
                Calendar date=new GregorianCalendar();
                String dayString="",day,month,year,currentDate,hour,minute,second,format="",currentTime,TotalDate;
                int dayWeek;

                dayWeek=date.get(Calendar.DAY_OF_WEEK);
                switch (dayWeek) {
                    case 1:  dayString="Domingo";            
                        break;
                    case 2:  dayString="Lunes";            
                        break;
                    case 3:  dayString="Martes";            
                        break;
                    case 4:  dayString="Miercoles";            
                        break;
                    case 5:  dayString="Jueves";            
                        break;
                    case 6:  dayString="Viernes";            
                        break;
                    case 7:  dayString="Sabado";            
                        break;
                }
                day=Integer.toString(date.get(Calendar.DATE));
                month=Integer.toString(date.get(Calendar.MONTH)+1);
                year=Integer.toString(date.get(Calendar.YEAR));
                currentDate=day+"/"+month+"/"+year;

                hour=Integer.toString(date.get(Calendar.HOUR));
                minute=Integer.toString(date.get(Calendar.MINUTE));
                second=Integer.toString(date.get(Calendar.SECOND));
                if(date.get(Calendar.AM_PM)==1){
                    format="PM";
                }
                if(date.get(Calendar.AM_PM)==0){
                    format="AM";
                }
                currentTime=hour+":"+minute+":"+second+" "+format;
                TotalDate=dayString+" "+currentDate+" Hora "+currentTime;
                jLabel.setText(TotalDate);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
               
    }

    
}
