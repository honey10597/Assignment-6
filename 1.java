public class instance_method {

	public static void main(String[] args) {
		base.display();
	}
}
class base
{
	static void display()
	{
		System.out.println("we can invoke the method of parent class by making its method static");
	}
}