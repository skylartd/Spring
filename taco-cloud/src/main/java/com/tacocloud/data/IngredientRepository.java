package com.tacocloud.data;

import com.tacocloud.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.sql.SQLException;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {
}
