package com.kodilla.patterns.builder.bigmac;

public class Roll {
    public static final String SESAME = "SESAME";
    public static final String NO_SESAME = "NO_SESAME";
    private final String rollType;

    public Roll(String rollType) {
        if (rollType.equals(SESAME) || rollType.equals(NO_SESAME)){
            this.rollType = rollType;
        } else {
            throw new IllegalStateException("Choose SESAME or NO SESAME");
        }
    }

    public String getRollType() {
        return rollType;
    }
}
