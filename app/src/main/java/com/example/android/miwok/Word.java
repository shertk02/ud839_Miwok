package com.example.android.miwok;

/**
 *{@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that worg
 */
public class Word {

    /** Miwok translation for the word */
    private String mMiwokTranslation;
    /** Default translation for the word */
    private String mDefaultTranslation;

    /**
     * Create a Word object containing both translations
     * @param miwokTranslation Miwok translation
     * @param defaultTranslation default translation
     */
    public Word(String defaultTranslation,String miwokTranslation ) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get Miwok translation
     * @return Miwok translation
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Set the Miwok translation
     * @param miwokTranslation Miwok translation
     */
    public void setMiwokTranslation(String miwokTranslation) {
        this.mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get default translation
     * @return get the default translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Set the default translation
     * @param defaultTranslation default translation
     */
    public void setDefaultTranslation(String defaultTranslation) {
        this.mDefaultTranslation = defaultTranslation;
    }

    /**
     * Get a String[] with both translations in the order [Miwok, Default]
     * @return [0]Miwok, [1]Default
     */
    public String[] getBothTranslations() {
        String[] bothTranslations = new String[2];
        bothTranslations[0]=mMiwokTranslation;
        bothTranslations[1]=mDefaultTranslation;
        return bothTranslations;
    }

    /**
     * Change both translations
     * @param miwokTranslation miwok translation
     * @param defaultTranslation default translation
     */
    public void setBothTranslations(String miwokTranslation,String defaultTranslation){
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
    }

}
