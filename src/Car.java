
public class Car {

	
	
	private String colour;

    private int maxi_Speed;

    public void carDetails(){

        System.out.println("Car Colour = "+colour + ", Maximum Speed ="  + maxi_Speed);

    }

    //Setting colour of the car

    public void setColour(String colour) {

        this.colour = colour;

    }

    //Setting maximum car Speed

    public void setMaxiSpeed(int maxi_Speed) {

        this.maxi_Speed = maxi_Speed;

    }
}
