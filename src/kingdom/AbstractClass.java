package kingdom;

public abstract class AbstractClass{
	private int maxId;
	private  int id;
	private String name;
	private int year;
	// default contructor  - every animal will need name and year discoverd
	public AbstractClass(String name, int year){
		maxId++;
    	id = maxId;
    	this.name = name;
    	this.year = year;
	}
	String food()
	{
		return "food";
	}
	int getId()
	{
		return id;
	}
	// idk if we need you - maybe set you up as an abstract one IDKK
	String getName()
	{
		return name;
	}
	int getYear()
	{
		return year;
	}

	public String toString() {
        return "Name: " + name + "Year Discovered: " + year + "\n";
	}
	
	// abstract one for the aminmals
	abstract String move();
	abstract String breath();
	abstract String birth();
}