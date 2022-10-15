package com.zerobase.fastlms.admin.dto;

import com.zerobase.fastlms.admin.entity.Banner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BannerDto {

    private long id;
    private String bannerName;
    private String bannerUrl;
    private String window;
    private String sortOrder;
    private boolean showFront;
    private LocalDateTime regDt;

    // 첨부파일
    private String fileName;
    private String urlFilename;

    //추가컬럼
    long totalCount;
    long seq;

    public static BannerDto of(Banner banner) {
        return BannerDto.builder()
                .id(banner.getId())
                .bannerName(banner.getBannerName())
                .bannerUrl(banner.getBannerUrl())
                .window(banner.getWindow())
                .sortOrder(banner.getSortOrder())
                .showFront(banner.isShowFront())
                .regDt(banner.getRegDt())
                .fileName(banner.getFilename())
                .urlFilename(banner.getUrlFilename())
                .build();
    }

    public static List<BannerDto> of (List<Banner> banners) {
        if (banners != null) {
            List<BannerDto> bannerDtoList = new ArrayList<>();
            for(Banner x : banners) {
                bannerDtoList.add(of(x));
            }
            return bannerDtoList;
        }

        return null;
    }

    public String getRegDtText() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        return regDt != null ? regDt.format(formatter) : "";

    }
}
