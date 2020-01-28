public class Pet{
	
	private String name;

	private boolean fed;
	private boolean walked;
	private boolean petted;

	public Pet(String name){
		this.name = name;
	}

	public void feed(){
		this.fed = true;
	}

	public void walk(){
		this.walked = true;
	}

	public void pet(){
		this.petted = true;
	}

	public boolean getFed(){
		return fed;
	}

	public boolean getWalked(){
		return walked;
	}

	public boolean getPetted(){
		return petted;
	}

	// public boolean isHappy(){
	// 	return fed && walked && petted;
	// }

	public static void main(String args[])
	{
		System.out.println(fed);
		System.out.println(walked);
		System.out.println(petted);
	}

}