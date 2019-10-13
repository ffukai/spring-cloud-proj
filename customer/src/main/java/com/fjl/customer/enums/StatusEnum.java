package com.fjl.customer.enums;


import java.util.HashMap;
import java.util.Map;

public enum  StatusEnum implements BaseEnum<StatusEnum,Integer>{

    NORMAL(0 ,"正常"),
    DELETE(1, "删除");

    private final Integer value;

    private final String desc;


    StatusEnum(Integer value , String desc){
        this.value = value;
        this.desc = desc;
    }

    public static StatusEnum getByValue(Integer value){
        StatusEnum statusEnums[] = StatusEnum.values();
        for(StatusEnum  statusEnum: StatusEnum.values() ){
            if(statusEnum.getValue().equals(value)){
                return statusEnum;
            }
        }
        return null;
    }




    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String getDisplayName() {
        return desc;
    }


}
