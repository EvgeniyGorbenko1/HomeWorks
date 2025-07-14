package Lesson8;

public class Dog extends Animal{


    @Override
    public void voice() {
        super.voice();
        System.out.println("ГАВ!!!");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        switch (food){
            case "Corn", "Water","Meat" -> System.out.println("Dog likes it!");
            case "Grass" -> System.out.println("Dog hate this food!");
            default -> System.out.println("Dog doesn't eat!");
        }
    }
}
