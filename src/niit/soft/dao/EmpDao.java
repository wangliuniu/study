package niit.soft.dao;

import niit.soft.domain.Emp;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by lenovo on 2018/10/15.
 */
public interface EmpDao {
    public int insert(Emp emp)throws SQLException;//插入操作

    public int deleteById(int empno) throws SQLException;//根据id删除

    public int modify(Emp emp) throws SQLException;//修改

    public List<Emp> findByName(String keyward) throws SQLException;//根据姓名修改

    public List<Emp> findById(int id) throws SQLException;//根据id修改

    public List<Emp> findAll() throws SQLException;//查询所有信息

    public int updateEmp(int id, Emp emp) throws SQLException;//修改指定工号的员工信息
}
