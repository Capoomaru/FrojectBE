package utils;

public class EnumMapperValue {
    private String value;

    public EnumMapperValue(EnumMapperType enumMapperType) {
        this.value = enumMapperType.getValue();
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return '{' +
                "value = " + value +
        '}';
    }
}
