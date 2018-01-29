package com.example.android.miwok;

/**
 * Created by Pulkit on 10/21/2017.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private Integer mImageResourceId = No_Image_Provided;

    private Integer mAudioId ;

    public static int No_Image_Provided = -1;

    public Word(String MiwokTranslation, String DefaultTranslation){
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
    }

    public Word(String MiwokTranslation, String DefaultTranslation, Integer AudioId){
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mAudioId = AudioId;
    }

    public Word(String MiwokTranslation, String DefaultTranslation, Integer ImageResourceId, Integer AudioId){
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mImageResourceId=ImageResourceId;
        mAudioId = AudioId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public Integer getImageResourceId() { return mImageResourceId; }

    public Integer getAudioId() { return mAudioId; }

    public Boolean hasImage() { return mImageResourceId != No_Image_Provided; }
}
