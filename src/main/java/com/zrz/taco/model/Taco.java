package com.zrz.taco.model;

import lombok.Data;

@Data
public class Taco {
    private String name;
    private Ingredient[] ingredients;
}
