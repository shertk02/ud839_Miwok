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
    private int mImageId = NO_SOURCE_PROVIDED;
    /** control for available image */
    private static final int NO_SOURCE_PROVIDED = -1;

    private int mAudioId;


    /**
     * Create a Word object containing both translations
     * @param miwokTranslation Miwok translation
     * @param defaultTranslation default translation
     * @param audioId audio resource
     */
    public Word(String defaultTranslation,String miwokTranslation, int audioId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioId = audioId;
     }

    public Word(String defaultTranslation,String miwokTranslation, int image, int audioId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageId = image;
        this.mAudioId = audioId;
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

    public int getAudioResourceId() { return mAudioId; }

    public boolean hasImage() {
        return mImageId != NO_SOURCE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageId=" + mImageId +
                ", mAudioId=" + mAudioId +
                '}';
    }
}
