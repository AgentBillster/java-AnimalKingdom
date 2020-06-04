package kingdom;

public class Fish extends AbstractClass {

    public Fish(String name, int year) {
        super(name, year);
    }

    // get abstract methods from AbstractClass
    @Override
	public String move()
	{
		return "Swim";
	}

    @Override
	public String breath()
	{
		return "Gills";
	}

    @Override
	public String birth()
	{
		return "Eggs";
	}

}