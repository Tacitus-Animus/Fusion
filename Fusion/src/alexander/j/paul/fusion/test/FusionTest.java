package alexander.j.paul.fusion.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import alexander.j.paul.fusion.Catalyst;
import alexander.j.paul.fusion.FloatCatalyst;
import alexander.j.paul.fusion.FloatReactor;
import alexander.j.paul.fusion.Fusion;

public class FusionTest {

	@Test
	public void test() {
		
		final Catalyst temp = new FloatCatalyst("Temp", 10f);
		final Catalyst ratio = new FloatCatalyst("Ratio", 5f);
		final Catalyst pa = new FloatCatalyst("PA", 2);
						
		final Fusion equation = ratio.add(temp).multiply(temp.divideBy(pa)).subtractBy(pa.add(ratio));
			
		final Catalyst result = new FloatReactor("Result");
		
		assertTrue(!result.isFused());
		
		result.formattedWithFusion("%s: %s = %.2f")
			  .formattedTo("%s: %.2f")
			  .onChangeConsume(System.out::println)
			  .fuse(equation);

		assertTrue(result.isFused());
		assertTrue(result.getValue() == 68f);
			
		result.diffuse();
		
		assertTrue(!result.isFused());
		
	}
}
