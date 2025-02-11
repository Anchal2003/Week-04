package com.javagenerics.day01;
//Create an interface MealPlan
interface MealPlan{
    //Create a method mealType
    void mealType();
}

//Create a class VegetarianMeal which implements MealPlan interface
class VegetarianMeal implements MealPlan{
    //Create a method mealType and override it
    public void mealType() {
        System.out.println("Vegetarian Meal");
    }
}

//Create a class VeganMeal which implements MealPlan interface
class VeganMeal implements MealPlan{

    //Create a method mealType and override it
    public void mealType() {
        System.out.println("Vegan Meal");
    }
}

//Create a class KetoMeal which implements MealPlan interface
class KetoMeal implements MealPlan{

    //Create a method mealType and override it
    public void mealType() {
        System.out.println("Keto Meal");
    }
}

//Create a class HighProteinMeal which implements MealPlan interface
class HighProteinMeal implements MealPlan{
    //Create a method mealType and override it
    public void mealType() {
        System.out.println("High Protein Meal");
    }
}

//Create a generic class Meal
class Meal<T extends MealPlan>{
    //Create a variable of T type
    T meal;

    //Parameterized constructor to initialize variable
    public Meal(T meal) {
        this.meal = meal;
    }

    //Create a static generic method to generateMealPlan
    public static <T extends  MealPlan> Meal<T> generateMealPlan(T data){
        return new Meal<>(data);
    }
}
//Create a class PersonalizedMealPlanGenerator
public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        //Create an object of Meal class and pass the Vegetarian class as parameter
        Meal<VegetarianMeal> vegetarianMeal = Meal.generateMealPlan(new VegetarianMeal());
        //Call the method to get the type of meal
        vegetarianMeal.meal.mealType();

        //Create an object of Meal class and pass the VeganMeal class as parameter
        Meal<VeganMeal> veganMeal = Meal.generateMealPlan(new VeganMeal());
        //Call the method to get the type of meal
        veganMeal.meal.mealType();

        //Create an object of Meal class and pass the KetoMeal class as parameter
        Meal<KetoMeal> ketoMeal = Meal.generateMealPlan(new KetoMeal());
        //Call the method to get the type of meal
        ketoMeal.meal.mealType();

        //Create an object of Meal class and pass the HighProteinMeal class as parameter
        Meal<HighProteinMeal> highProteinMeal = Meal.generateMealPlan(new HighProteinMeal());
        //Call the method to get the type of meal
        highProteinMeal.meal.mealType();
    }
}
