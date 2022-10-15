package com.zerobase.fastlms.admin.model;

import lombok.Data;

@Data
public class BannerInput {
    long id;
    String bannerName;
    String bannerUrl;
    String window;
    String sortOrder;
    boolean showFront;

    // for delete
    String idList;

    //ADD
    String filename;
    String urlFilename;
}
