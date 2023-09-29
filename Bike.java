package Abstract.com;

abstract class Bike {
	abstract void run();

}
class Honda extends Bike
{
	void run()
	{
		System.out.print("running safely");
	}
}
class Bike1
{
	public static void main(String args[])
	{
		Honda h=new Honda();
		h.run();
	}
	
}
