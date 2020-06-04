package kingdom;

public class Birds extends AbstractClass {

    public Birds(String name, int year) {
        super(name, year);
    }

    // get abstract methods from AbstractClass
    @Override
	public String move()
	{
		return "Fly";
	}

    @Override
	public String breath()
	{
		return "Lungs";
	}

    @Override
	public String birth()
	{
		return "Eggs";
	}

}