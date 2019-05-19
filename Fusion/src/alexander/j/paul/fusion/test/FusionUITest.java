package alexander.j.paul.fusion.test;

import java.util.Arrays;

import alexander.j.paul.fusion.Catalyst;
import alexander.j.paul.fusion.FloatCatalyst;
import alexander.j.paul.fusion.FloatReactor;
import alexander.j.paul.fusion.Fusions;
import alexander.j.paul.fusion.Fusion;

public class FusionUITest {

	public static void main(String[] args) {
		
		final Catalyst temp = new FloatCatalyst("Temp", 10f);
		final Catalyst ratio = new FloatCatalyst("Ratio", 5f);
		final Catalyst pa = new FloatCatalyst("PA", 2);
						
		final Fusion equation = ratio.add(temp).multiply(temp.divideBy(pa)).subtractBy(pa.add(ratio));
			
		final Catalyst result = new FloatReactor("Result");
		
		
		result.formatWithFusion("%s: %s = %.2f")
			  .formattedTo("%s: %.2f")
			  .fuse(equation);

		
		Fusions.simulateChangeUI(10, 1000, Arrays.asList(
				(r)->temp.setValue((float)r.nextDouble(-32, 72)), 
				(r)->ratio.setValue((float)r.nextDouble(0, 1)), 
				(r)->pa.setValue((float)r.nextDouble(0, 2000))), 
				(map) -> result.onChangeRun(() -> {
				map.get(result).setText(result.toString());
				}), result);
				
	}

}
