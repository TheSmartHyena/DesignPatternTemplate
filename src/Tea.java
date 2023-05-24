// ConcreteClass
public class Tea extends Beverage {
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    public void boilWater() {
        System.out.println("Boiling water at 70");
    }
}
