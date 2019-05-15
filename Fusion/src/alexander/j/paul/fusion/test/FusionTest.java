package alexander.j.paul.fusion.test;

import java.util.Arrays;

import alexander.j.paul.fusion.Catalyst;
import alexander.j.paul.fusion.Fusion;
import alexander.j.paul.fusion.Reaction;
import alexander.j.paul.fusion.Reactor;

public class FusionTest {

	public static void main(String[] args) {
		
		final Catalyst temp = new Catalyst("Temp", 10f);
		final Catalyst ratio = new Catalyst("Ratio", 5f);
		final Catalyst pa = new Catalyst("PA", 2);
						
		final Reaction equation = ratio.add(temp).multiply(temp.divideBy(pa)).subtractBy(pa.add(ratio));
			
		final Reactor result = new Reactor("Result");
		
		result.formattedTo(() -> "%s: " + equation + " -= %.2f")
			  .fuse(equation);
		
		Fusion.simulateChangeUI(10, 1000, Arrays.asList(
				(r)->temp.setValue((float)r.nextDouble(-32, 72)), 
				(r)->ratio.setValue((float)r.nextDouble(0, 1)), 
				(r)->pa.setValue((float)r.nextDouble(0, 2000))), 
				(map) -> result.onChangeRun(() -> map.get(result).setText(result.toString())), result);
	}
}
