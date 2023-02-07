package com.froject.frojectbe.dto.category;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import utils.EnumMapperType;

@RequiredArgsConstructor
@Getter
public enum ActivityCategory implements EnumMapperType {
    DESIGN("디자인"),
    DEVELOP("개발"),
    PHOTO("사진·영상"),
    TRANSLATION("번역·통역"),
    PLAN("기획"),
    INTERIOR("인테리어"),
    VOLUNTEER("봉사활동");

    private final String value;

}
