package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {


	public void greet(){
		List<String> greeetings = new ArrayList<>();
		greeetings.add("Hello");

		for (String s: greeetings)
		{
			System.out.println("Greeeting "+ s);
		}
	}
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.greet();
    }
}
