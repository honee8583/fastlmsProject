package com.zerobase.fastlms.admin.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
public class Banner implements BannerWindow{
//    배너 이미지 파일, 배너 Alter텍스트(대체 텍스트), 배너 링크 했을때 이동하는 URL정보, 클릭시Target정보(새
//    창인지, 현재창 이동인지), 정렬순서, 프론트 표시 여부

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String bannerName;
    private String bannerUrl;
    private String window;
    private String sortOrder;
    private boolean showFront;
    private LocalDateTime regDt;

    // 첨부파일
    private String filename;
    private String urlFilename;
}
