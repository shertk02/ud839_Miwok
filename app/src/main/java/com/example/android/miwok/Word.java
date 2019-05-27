package com.example.android.miwok;

import android.content.res.Resources;

/**
 *{@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that worg
 */
public class Word {

    /** Miwok translation for the word */
    private String mMiwokTranslation;
    /** Default translation for the word */
    private String mDefaultTranslation;
    /** Resource ID of the associated image */
    private int mImageId = NO_IMAGE_PROVIDED;
    /** control for available image */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a Word object containing both translations
     * @param miwokTranslation Miwok translation
     * @param defaultTranslation default translation
     */
    public Word(String defaultTranslation,String miwokTranslation) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
    }

    /**
     * Create a Word object containing both translations
     * @param miwokTranslation Miwok translation
     * @param defaultTranslation default translation
     * @param image image resource
     */
    public Word(String defaultTranslation,String miwokTranslation, int image ) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageId = image;
     }

    /**
     * Get Miwok translation
     * @return Miwok translation
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get default translation
     * @return get the default translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId(){
        return mImageId;
    }

    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }
}
