package com.dimandco.srvs.core.model;

public record HuaIdValidationResult(
        boolean valid,
        PersonType type) {

    public static HuaIdValidationResult success(PersonType type) {
        return new HuaIdValidationResult(true, type);
    }

    public static HuaIdValidationResult fail() {
        return new HuaIdValidationResult(false, null);
    }
}
