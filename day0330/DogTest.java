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
		return "이름 : "+name+"\n종류 : "+breed+"\n나이 : "+age;
	}
}

class  DogTest
{
	public static void main(String[] args) 
	{
		Dog d = new Dog("똥개","도베르만",1);
		Dog o = new Dog("막뚱",2);

		System.out.println(d);
		System.out.println(o);

	}
}
