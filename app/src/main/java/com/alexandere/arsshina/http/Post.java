package com.alexandere.arsshina.http;

import com.alexandere.arsshina.Config;

public class Post {

    private String constring;
    public Post()
    {
        constring = Config.getString();
    }

    public String getString(){
        return constring;
    }

}
