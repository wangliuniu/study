package niit.soft.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by lenovo on 2018/10/29.
 */
public class TimeStamp {
    private SimpleDateFormat sdf=null;
    public String getTimeStamp(){
        this.sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return this.sdf.format(new Date());
    }
    public String getTimeStampRand(){
        StringBuffer buf=new StringBuffer();
        buf.append(this.getTimeStamp());
        Random rd=new Random();
        for(int i=0;i<4;i++){
            buf.append(rd.nextInt(10));
        }
        return buf.toString();
    }
}
