public class Yorkie extends Pet
{
	private int petNumber;

	public Yorkie(String name)
	{
		super(name);
	}

	public void pets(){
		this.petNumber = 10;
	}

	public int howManyPets(){
		return petNumber;
	}

	public boolean isHappy(){
		if (petNumber >= 10){
			return true;
		}
		return false;
	}

	public String talk(){
		return isHappy() ? "WOOF!" : "woof";
	}
}