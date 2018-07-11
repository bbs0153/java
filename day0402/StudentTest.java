class Student
{
	protected String name;
	protected String number;
	protected String dep;
	protected int lev;
	protected int cre;

	public Student(String name, String number, String dep, int lev, int cre)
	{
		this.name = name;
		this.number = number;
		this.dep = dep;
		this.lev = lev;
		this.cre = cre;
	}
	
	public String getName()
	{
		return name;
	}
	public String getNumber()
	{
		return number;
	}
	public String getDep()
	{
		return dep;
	}
	public int getLev()
	{
		return lev;
	}
	public int getCre()
	{
		return cre;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public void setNumber(String number)
	{
		this.number = number;
	}
	public void setDep(String dep)
	{
		this.dep = dep;
	}
	public void setLev(int lev)
	{
		this.lev = lev;
	}
	public void setCre(int cre)
	{
		this.cre = cre;
	}

	public String toString()
	{
		return "�̸�: "+name+", �й�: "+number+", �а�: "+dep+", �г�: "+lev+", ����: "+cre; 
	}

}

class Student2 extends Student
{
	protected String club;
	
	public Student2(String name, String number, String dep, int lev, int cre, String club)
	{
		super(name,number,dep,lev,cre);
		this.club = club;
	}

	public String getClub()
	{
		return club;
	}
	public void setClub(String club)
	{
		this.club = club;
	}

	public String toString()
	{
		return super.toString()+club;
	}

}

class Student3 extends Student
{
	protected boolean tara;
	protected double a; 

	public Student3(String name, String number, String dep, int lev, int cre, boolean tara, double a)
	{
		super(name,number,dep,lev,cre);
		this.a = a;
		this.tara = tara;
	}

	public double getA()
	{
		return a;
	}
	public void setA(double a)
	{
		this.a = a;
	}
	public boolean getTara()
	{
		return tara;
	}
	public void setTara(boolean tara)
	{
		this.tara = tara;
	}
	public String toString()
	{
		return super.toString()+", ��������: "+getAr()+", ���б� ����: "+a;
	}
	public String getAr()
	{
		if (tara==true)
		{
			return "��������";
		}
		else
			return "��������";
	}

}



class StudentTest 
{
	public static void main(String[] args) 
	{
		 Student a1 = new Student("������","201243218","ȣ�ڰ�����",1,100);
		Student2 a2 = new Student2("������","20143218","ȣ�ڰ�����",1,100,"�����Ƹ�");
		Student3 a3 = new Student3("������","201243218","ȣ�ڰ�����",1,100,true,1);

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}
