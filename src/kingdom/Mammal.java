package kingdom;

public class Mammal extends AbstractClass {

    public Mammal(String name, int year) {
        super(name, year);
    }

    // get abstract methods from AbstractClass
    @Override
	public String move()
	{
		return "Walk";
	}

    @Override
	public String breath()
	{
		return "Lungs";
	}

    @Override
	public String birth()
	{
		return "Live";
	}

}