package com.froject.frojectbe.dto;

import com.froject.frojectbe.dto.category.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import utils.EnumMapperType;

import java.util.Arrays;
import java.util.List;

@Getter
@RequiredArgsConstructor
public enum BigCategory implements EnumMapperType {
/*    DESIGN("디자인", Arrays.asList(DesignCategory.values())),
    DEVELOP("개발", Arrays.asList(DevelopCategory.values())),
    PHOTO("사진·영상", Arrays.asList(PhotoCategory.values())),
    TRANSLATION("번역·통역", Arrays.asList(TranslateCategory.values())),
    PLAN("기획", Arrays.asList(PlanCategory.values())),
    INTERIOR("인테리어", Arrays.asList(InteriorCategory.values())),
    ACTIVITY("대외활동", Arrays.asList(ActivityCategory.values()));*/

    DESIGN("디자인", DesignCategory.class),
    DEVELOP("개발", DevelopCategory.class),
    PHOTO("사진·영상", PhotoCategory.class),
    TRANSLATION("번역·통역", TranslateCategory.class),
    PLAN("기획", PlanCategory.class),
    INTERIOR("인테리어", InteriorCategory.class),
    ACTIVITY("대외활동", ActivityCategory.class);

    private final String value;
//    private final List<EnumMapperType> secondaryCategoryList;
    private final Class<? extends EnumMapperType> enumClass;

//    public static BigCategory findByValue(String value) {
//
//    }
}
