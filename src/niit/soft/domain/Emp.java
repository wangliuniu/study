package niit.soft.domain;

import java.util.Date;

public class Emp {
	private int empno;// 工号
	private String ename;// 姓名
	private String job;// 工作
	private Date hiredate;// 雇佣日期
	private int sal;// 工资
	private int comm;// 奖金

	public Emp() {

	}

	public Emp(String ename, String job, Date hiredate) {
		super();
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.sal = 2000;
		this.comm = 1000;
	}

	public Emp(String ename, String job, Date hiredate, int sal, int comm) {
		super();
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
	}

	public Emp(int empno, String ename, String job, Date hiredate, int sal,
			int comm) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
	}



	@Override
	public String toString() {
		return empno + "\t" + ename + "\t" + job + "\t" + hiredate + "\t" + sal + "\t" + comm;
	}
	

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

}
