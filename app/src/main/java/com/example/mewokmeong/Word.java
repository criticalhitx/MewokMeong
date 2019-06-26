package com.example.mewokmeong;

public class Word {

    /*Default translation for the word */
    private String mDefaultTranslation;

    /*Miwok translation for the word */
    private String mMiwokTranslation;


    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }

    //Return String
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
