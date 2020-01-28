public class TestPet
{
	public static void main (String[] args)
	{
		Dog d = new Dog("Cayden");
		Cat c = new Cat("Noah");
		Yorkie y = new Yorkie("Pierce");

		Pet[] pets = new Pet[3];
		pets[0] = d;
		pets[1] = c;
		pets[2] = y;

		PetOwner po = new PetOwner("Jackson", pets);

		System.out.println(po.getName() + " is " + po.isHappy());

		System.out.println(d.talk());
		System.out.println(c.talk());
		System.out.println(y.talk());
	}
}