package alexander.j.paul.fusion;

import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fusion {

	public static void simulateChangeUI(int iterations, long millis,
			List<Consumer<ThreadLocalRandom>> randomChange, 
			Consumer<Map<? extends Reactive<?>, JLabel>> action, Reactive<?>... reactives) {

		JFrame frame = new JFrame("Fusion API");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		frame.setVisible(true);
		
		Map<Reactive<?>, JLabel> labels = new HashMap<>();
		for (Reactive<?> reactive : reactives) {
			labels.put(reactive, new JLabel(reactive.toString()));
			frame.add(labels.get(reactive));
		}
		
		frame.pack();
		
		ThreadLocalRandom r = ThreadLocalRandom.current();

		for(; iterations > 0; iterations--) {
			randomChange.get(r.nextInt(randomChange.size())).accept(r);
			frame.pack();
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {}
		}
	}

	
	
}
