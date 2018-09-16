package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {


	public int countWords(String words){
		String[] seperateWords = StringUtils.split(words, ' ');
		return (seperateWords==null)?0:seperateWords.length;

			}


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
	int cnt = app.countWords("I must have five words");
	System.out.println("Word count : "+ cnt);
    }
}
