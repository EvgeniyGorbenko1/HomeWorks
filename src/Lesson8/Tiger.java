package Lesson8;

public class Tiger extends Animal{
    @Override
    public void voice() {
        super.voice();
        System.out.println("РРРРРР");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        switch (food){
            case "Meat", "Water" -> System.out.println("Tiger likes it!");
            case "Grass" -> System.out.println("Tiger hate this food!");
            default -> System.out.println("Tiger doesn't eat!");
        }
    }
}
