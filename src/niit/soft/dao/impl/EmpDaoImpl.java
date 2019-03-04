package niit.soft.dao.impl;

import niit.soft.dao.EmpDao;
import niit.soft.domain.Emp;
import niit.soft.util.JDBCUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmpDaoImpl implements EmpDao {
	JDBCUtil jdbcUtil = JDBCUtil.getInitJDBCUtil();

	@Override
	public int insert(Emp emp) throws SQLException {
		int result=0;
		String sql="insert into emp values(null,?,?,?,?,?)";
		result=jdbcUtil.executeUpdate(sql,new Object[]{emp.getEname(),emp.getJob(),emp.getHiredate(),emp.getSal(),emp.getComm()});

		return result;
	}

	@Override
	public int deleteById(int id) throws SQLException {
		int result=0;
		String sql="delete from emp where empno=?";
		result=jdbcUtil.executeUpdate(sql,new Object[]{id});

		return result;
	}

	@Override
	public int modify(Emp emp) throws SQLException {
		return 0;
	}

	@Override
	public List<Emp> findByName(String keyward) throws SQLException {
		List<Emp> all=new ArrayList<>();
		String sql="select * from emp where ename=?";
		return all;
	}

	@Override
	public List<Emp> findById(int id) throws SQLException {
		Emp emp=new Emp();
		return null;
	}

	@Override
	public List<Emp> findAll() throws SQLException {
		List<Emp> all = new ArrayList<>();
		String sql = "select * from emp";
		List<Object> list = jdbcUtil.executeQuery(sql, null);
		int size = list.size();
		for (int i = 0; i < size; i++) {
			Object obj = list.get(i);
			@SuppressWarnings("unchecked")
			Map<String, Object> map = (Map<String, Object>) obj;
			Emp emp = new Emp();
			emp.setEmpno((Integer) map.get("empno"));
			emp.setEname(map.get("ename").toString());
			emp.setJob(map.get("job").toString());
			emp.setHiredate((java.util.Date) map.get("hiredate"));
			emp.setSal((Integer) map.get("sal"));
			emp.setComm((Integer) map.get("comm"));

			all.add(emp);
		}
		return all;

	}

	@Override
	public int updateEmp(int id, Emp emp) throws SQLException {
		int result=0;
		String sql="update emp set ename=?,job=?,hiredate=?,sal=?,comm=? where empno=?";

		return result;
	}

}