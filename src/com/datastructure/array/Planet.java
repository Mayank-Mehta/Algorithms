package com.datastructure.array;

public enum Planet {
    ASSOCIATE (10001),
    SENIOR_ASSOCIATE (10002),
    MANAGER (10003),
    SENIOR_MANAGER (10004);
    
    private final int code; // in meters
    Planet(int code ) {
        this.code = code;
    }
    
    public static Planet getEnum(int code) {
    	for(Planet e: Planet.values()) {
    	    if(e.code == code) {
    	      return e;
    	    }
    	  }
    	throw new IllegalArgumentException("Invalid value: " + code);
    }
    
    public static void main(String[] args) {
		System.out.println(getEnum(10001));
	}
   
}