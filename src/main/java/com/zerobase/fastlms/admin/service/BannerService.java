package com.zerobase.fastlms.admin.service;

import com.zerobase.fastlms.admin.dto.BannerDto;
import com.zerobase.fastlms.admin.dto.CategoryDto;
import com.zerobase.fastlms.admin.model.BannerInput;
import com.zerobase.fastlms.admin.model.BannerParam;
import com.zerobase.fastlms.admin.model.CategoryInput;
import com.zerobase.fastlms.course.model.ServiceResult;

import java.util.List;

public interface BannerService {

    /**
     * 배너 등록
     */
    boolean add(BannerInput bannerInput);

    /**
     * 배너 목록
     */
    List<BannerDto> list(BannerParam parameter);

    /**
     * 배너 상세 정보
     */
    BannerDto getById(long bannerId);

    /**
     * 배너 정보 수정
     */
    boolean set(BannerInput parameter);


    /**
     * 선택한 배너들 삭제
     */
    boolean del(String idList);

    /**
     * 메인화면 배너 목록
     */
    List<BannerDto> getFrontBanner();
}
