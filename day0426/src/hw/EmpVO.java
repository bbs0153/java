package hw;

public class EmpVO {

	private int eno;
	private String ename;
	private int sal;
	private int comm;
	private String hiredate;
	private String jumin;
	private int dno;
	private String position;
	private String addr;

	public EmpVO(int eno, String ename, int sal, int comm, String hiredate, String jumin, int dno, String position,
			String addr) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.comm = comm;
		this.hiredate = hiredate;
		this.jumin = jumin;
		this.dno = dno;
		this.position = position;
		this.addr = addr;
	}

	public EmpVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
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

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
