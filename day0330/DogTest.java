class Dog
{
	private String name;
	private String breed;
	private int age;

	public Dog(String name, String breed, int age)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public Dog(String name, int age)
	{
		this(name,null,age);
	}
	
	
	public String toString()
	{
		return "�̸� : "+name+"\n���� : "+breed+"\n���� : "+age;
	}
}

class  DogTest
{
	public static void main(String[] args) 
	{
		Dog d = new Dog("�˰�","��������",1);
		Dog o = new Dog("����",2);

		System.out.println(d);
		System.out.println(o);

	}
}
