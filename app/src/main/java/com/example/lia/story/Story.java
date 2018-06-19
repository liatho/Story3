package com.example.lia.story;
/**
 * Created by Lia on 2018.06.17..
 */
/**
 * An {@link Story} object contains information related to a single earthquake.
 */
public class Story {
    /** Section name of the story */
    private String mSectionName;
    /** WebTitle of the story */
    private String mWebTitle;
    /** WebPublicationDate of the story */
    private String mWebPublicationDate;

    /** Website URL of the story */
    private String mUrl;
    /**
     * Constructs a new {@link Story} object.
     *
     * @param sectionName is the name of the section of the story
     * @param webTitle is the title of the story
     * @param webPublicationDate is the time when teh story was published
     * @param url is the website URL to find more details about the story
     */
    public Story(String sectionName, String webTitle, String webPublicationDate, String url) {
        mSectionName = sectionName;
        mWebTitle = webTitle;
        mWebPublicationDate = webPublicationDate;
        mUrl = url;
    }
    /**
     * Returns the sectionName of the story.
     */
    public String getSectionName() {
        return mSectionName;
    }
    /**
     * Returns the webTitle of the story.
     */
    public String getWebTitle() {
        return mWebTitle;
    }
    /**
     * Returns the publication date of the story.
     */
    public String getWebPublicationDate() {
        return mWebPublicationDate;
    }
    /**
     * Returns the website URL to find more information about the story.
     */
    public String getUrl() {
        return mUrl;
    }
}

