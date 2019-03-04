package niit.soft.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by lenovo on 2018/10/29.
 */
public class IpTimeStamp {
    private SimpleDateFormat sdf=null;//用来做时间戳的
    private String ip=null; //ip地址

    public IpTimeStamp(){

    }

    public IpTimeStamp(String ip){
        this.ip=ip;
    }

    public String getIpTimeStampRand(){
        StringBuffer buf=new StringBuffer();
        if(this.ip!=null){
            String[] s=this.ip.split("\\.");
            for(int i=0;i<s.length;i++){
                buf.append(addZero(s[i],3));
            }
        }
//        将时间戳和随机数追加到ip地址后面
        buf.append(this.getTimeStampRand());
//        返回ip+时间戳+四位数
        return buf.toString();
    }





    /**
     * 补0操作
     */
    private String addZero(String str,int len){
        StringBuffer buf=new StringBuffer();
        buf.append(str);
        while (buf.length()<len){
            buf.insert(0,"0");
        }
        return buf.toString();
    }
    /*
    * 生成字符串格式的时间戳
    */
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

    public static void main(String[] args){
        IpTimeStamp ts=new IpTimeStamp("192.168.43.99");
        System.out.println(ts.getIpTimeStampRand());
    }
}
