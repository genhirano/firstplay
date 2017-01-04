import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import play.libs.Json;

public class JsonTest {

	@Test
	public void test(){
		System.out.println("test");
		System.out.println("test");
		System.out.println("test");
		System.out.println("test");
		System.out.println("test");

		Json j = new Json();

		System.out.println(j.toString());

		assertThat("1", is("1"));
	}

}
