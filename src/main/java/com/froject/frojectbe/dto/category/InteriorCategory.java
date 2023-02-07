package com.froject.frojectbe.dto.category;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import utils.EnumMapperType;

@RequiredArgsConstructor
@Getter
public enum InteriorCategory implements EnumMapperType {
    INTERIOR("인테리어");

    private final String value;

}
