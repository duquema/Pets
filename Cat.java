public class Cat extends Pet
{
	public Cat(String name)
	{
		super(name);
	}

	public String talk(){
		return isHappy() ? "meow" : "hiss";
	}
}
