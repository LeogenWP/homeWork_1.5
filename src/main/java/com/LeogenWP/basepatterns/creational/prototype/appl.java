package com.LeogenWP.basepatterns.creational.prototype;

public class appl {
    public static void main(String[] args) {
        Recipe CakeRecipe = new Recipe(1, "Milk,Chocolate, a bit of love");
        System.out.println(CakeRecipe.toString());
        System.out.println("=============");
        RecipeFactory factory = new RecipeFactory(CakeRecipe);
        Recipe anotherRecipe  = factory.cloneRecipe();
        System.out.println(anotherRecipe);
    }
}
