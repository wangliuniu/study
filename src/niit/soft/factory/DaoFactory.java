package niit.soft.factory;

import niit.soft.dao.EmpDao;
import niit.soft.dao.impl.EmpDaoImpl;

/**
 * Created by lenovo on 2018/10/15.
 */
public class DaoFactory {
    public static EmpDao getEmpDaoInstance(){
        return new EmpDaoImpl();
    }
}
