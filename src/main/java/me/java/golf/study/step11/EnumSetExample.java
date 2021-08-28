package me.java.golf.study.step11;

import java.util.EnumSet;

public class EnumSetExample {

    public static void main(String[] args) {
        EnumSet<Rainbow> enumSetAllOf = EnumSet.allOf(Rainbow.class);
        System.out.println("enumSetAllOf = " + enumSetAllOf);
        
        EnumSet<Rainbow> enumSetNoneOf = EnumSet.noneOf(Rainbow.class);
        System.out.println("enumSetNoneOf = " + enumSetNoneOf);
        
        EnumSet<Rainbow> enumSetRange = EnumSet.range(Rainbow.RED, Rainbow.ORANGE);
        System.out.println("enumSetRange = " + enumSetRange);
        
        EnumSet<Rainbow> enumSetComplementOf = EnumSet.complementOf(EnumSet.of(Rainbow.GREEN, Rainbow.YELLOW));
        System.out.println("enumSetComplementOf = " + enumSetComplementOf);
        
        EnumSet<Rainbow> enumSetCopyOf = EnumSet.copyOf(EnumSet.of(Rainbow.BLUE, Rainbow.ORANGE));
        System.out.println("enumSetCopyOf = " + enumSetCopyOf);
    }
}
