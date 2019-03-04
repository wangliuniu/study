package niit.soft.dao.impl;

import niit.soft.domain.Emp;
import org.junit.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ASUS on 2018/10/26.
 */
public class EmpDaoImplTest {
    @Test
    public void findAll() throws Exception {
        List<Emp> all = new ArrayList<>();  //定义all用来存放查询信息
        all = new EmpDaoImpl().findAll();
        Iterator<Emp> iter = all.iterator();
        Emp emp = null;
        while (iter.hasNext()) {
            emp = iter.next();
            System.out.println(emp);
        }

    }
    public void testInsert() throws SQLException {
        Date hiredate=new Date();
        Emp emp=new Emp("aaa","worker",hiredate,1000,20000);
        int result=new EmpDaoImpl().insert(emp);
        if(result>0){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }


    }

}