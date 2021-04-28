package com.LeogenWP.basepatterns.creational.prototype;

public class RecipeFactory {
    Recipe recipe;

    public RecipeFactory(Recipe recipe) {
        this.recipe = recipe;
    }

    public RecipeFactory setRecipe(Recipe recipe) {
        this.recipe = recipe;
        return this;
    }

    Recipe cloneRecipe() {
        return  (Recipe) recipe.copy();
    }
}
