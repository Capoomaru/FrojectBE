package com.froject.frojectbe.dto.category;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import utils.EnumMapperType;

@RequiredArgsConstructor
@Getter
public enum PhotoCategory implements EnumMapperType {
    DOCUMENTARY("다큐"),
    PORTRAIT("초상"),
    LANDSCAPE("풍경"),
    COMMERCIAL("상업"), //텔레비젼, 라디오 등의 광고 방송
    SNAPSHOT("스냅"),
    ADVERTISEMENT("광고"), //신문, 잡지 등의 지면 광고
    FASHION("패션"),
    MUSIC_VIDEO("뮤직비디오"),
    VOICE_ACTOR("성우"),
    MODEL("모델"),
    VIDEO_EDITING("영상편집"),
    MOTION_GRAPHIC("모션그래픽");

    private final String value;

}
