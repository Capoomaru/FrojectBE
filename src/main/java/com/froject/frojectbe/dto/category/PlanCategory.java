package com.froject.frojectbe.dto.category;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import utils.EnumMapperType;

@RequiredArgsConstructor
@Getter
public enum PlanCategory implements EnumMapperType {
    PLAN("기획");

    private final String value;

}
