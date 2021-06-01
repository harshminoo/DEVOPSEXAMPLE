package javaSolutions;

 class Car extends Vehicle
{

	public void drvie()
	{
		System.out.println("driving vechicle");
	}



	public void playMusic()
	{
		System.out.println("playing muscic in car11");
	}

}



 class Question4
{
	public static void main(String args[])
	{
		Vehicle v = new Car();
		v.drvie();
		//v.playMusic();
	}
}