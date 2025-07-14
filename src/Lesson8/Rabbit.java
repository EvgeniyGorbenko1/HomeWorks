package Lesson8;

public class Rabbit extends Animal{
    @Override
    public void voice() {
        super.voice();
        System.out.println("Я Зайка!");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        switch (food){
            case "Grass", "Water" -> System.out.println("Rabbit likes it!");
            case "Meat" -> System.out.println("Rabbit hate this food!");
            default -> System.out.println("Rabbit doesn't eat!");
        }
    }
}
