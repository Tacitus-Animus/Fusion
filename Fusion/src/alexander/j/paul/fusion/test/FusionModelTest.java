package alexander.j.paul.fusion.test;

public class FusionModelTest {

	public static void main(String[] args) {

		FusionTabDataTestModel model = FusionTabDataTestModel.get();
		
		System.out.println(model);
		
		model.setFindWeight();
		
		System.out.println(model);
		
	}

}
