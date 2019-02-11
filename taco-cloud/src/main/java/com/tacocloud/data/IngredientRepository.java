package com.tacocloud.data;

import com.tacocloud.Ingredient;

import java.sql.SQLException;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
