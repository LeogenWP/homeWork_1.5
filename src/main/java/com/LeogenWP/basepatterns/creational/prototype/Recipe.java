package com.LeogenWP.basepatterns.creational.prototype;

public class Recipe implements Copyable{
    private int id;
    private String ingredients;

    public Recipe(int id, String ingredients) {
        this.id = id;
        this.ingredients = ingredients;
    }

    public int getId() {
        return id;
    }

    public Recipe setId(int id) {
        this.id = id;
        return this;
    }

    public String getIngredients() {
        return ingredients;
    }

    public Recipe setIngredients(String ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    @Override
    public Object copy() {
        Recipe recipe = new Recipe (id,ingredients);
        return recipe;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
