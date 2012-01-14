import org.junit.Test
import jp.osima.hello.gradle.*

class GreeterTest {

	@Test
	public void test1(){
		assert new Greeter().sayHello('GradleTan') == 'Hello GradleTan !'
	}
}
