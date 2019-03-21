class Car
{
	int num;
	String color;
	void run(){
		System.out.println(num+"....."+color);		
	}
}
class  CarDemo
{
	public static void main(String[] args) 
	{
		//Car c = new Car();
		//c.num=4;
		//c.color="red";
		//c.run();
		//Car c = new Car();
		//c.run();
		//new Car().run();

		//Car c1 = new Car();
		//c1.num=4;
		//c1.color="red";
		//c1.run();
		//Car c2 = new Car();
		//c2.num=4;
		//c2.color="red";
		//c2.run();
         Car c1 = new Car();
		 Car c2 = new Car();
         show(c1);
		 show(c2);
	}
		public static void show(Car c)
		{
           c.num=3;
		   c.color="black";
		   System.out.println(c.num+"......."+c.color);
		   
		}
}
