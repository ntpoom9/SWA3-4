
public class Car {

	private String colour;

    private int maxi_Speed;

    public void carDetails(){

        System.out.println("Car Colour = "+colour + ", Maximum Speed ="  + maxi_Speed);

    }
    //colour
    public void setColour(String colour) {

        this.colour = colour;

    }
  //speed
    public void setMaxiSpeed(int maxi_Speed) {

        this.maxi_Speed = maxi_Speed;

    }
}
