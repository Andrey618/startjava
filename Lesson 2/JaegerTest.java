public class JaegerTest {

	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger("Bracer Phoenix", "Mark-5", "USA", 70.7f, 2128f, 9);	
		Jaeger jaegerTwo = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.850f, 9);		

		System.out.println("\njaegerOne");
		System.out.println("modelName = " + jaegerOne.getModelName());
		System.out.println("mark = " + jaegerOne.getMark());
		System.out.println("origin = " + jaegerOne.getOrigin());
		System.out.println("height = " + jaegerOne.getHeight());
		System.out.println("weight = " + jaegerOne.getWeight());
		System.out.println("armour = " + jaegerOne.getArmour());
		System.out.println("jaegerOne, " + jaegerOne.run());
		System.out.println("jaegerOne, " + jaegerOne.drift());
		jaegerOne.move();
		System.out.println("jaegerOne, " + jaegerOne.scanKiju());

		System.out.println("\njaegerTwo");
		System.out.println("modelName = " + jaegerTwo.getModelName());
		System.out.println("mark = " + jaegerTwo.getMark());
		System.out.println("origin = " + jaegerTwo.getOrigin());
		System.out.println("height = " + jaegerTwo.getHeight());
		System.out.println("weight = " + jaegerTwo.getWeight());
		System.out.println("armour = " + jaegerTwo.getArmour());
		System.out.println("jaegerTwo, " + jaegerTwo.run());
		System.out.println("jaegerTwo, " + jaegerTwo.drift());
		jaegerTwo.move();
		System.out.println("jaegerTwo, " + jaegerTwo.scanKiju());
	}
}