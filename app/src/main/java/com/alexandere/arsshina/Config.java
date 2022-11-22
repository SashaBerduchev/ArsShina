package com.alexandere.arsshina;

public class Config {
    private static String connstring;
    public static Boolean DEBUG_MODE = false;
    public static String getString()
    {
        if (DEBUG_MODE == true)
        {
            connstring = "https://localhost:44314/";
        }
        else
        {
            connstring = "http://arsshina.com/";
        }
        return connstring;
    }
}
