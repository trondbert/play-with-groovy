import org.fest.assertions.Assertions;
import org.junit.Assert;
import org.junit.Test;


class ClosureAsImpl {
	
	interface X
	{ void f(); }
	
	@Test
	public void test() {
		def readable = { it.put("12 34".reverse()); 5 } as Readable
		
		def s = new Scanner(readable)
		Assertions.assertThat(s.nextInt()).isEqualTo(43)
		
		def xvar = { f: { println "Foo" } } as X
		xvar.f()
	}
}
