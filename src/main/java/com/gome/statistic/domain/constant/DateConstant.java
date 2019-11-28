package com.gome.statistic.domain.constant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

/**
 * @Author: wenjie
 * @Date: 2019/9/23 4:21 PM
 */
@AllArgsConstructor
@NoArgsConstructor
public enum DateConstant {

    Q3W1("2019-03-29 00:00:00","2019-04-05 00:00:00"),

    Q3W2("2019-04-05 00:00:00","2019-04-12 00:00:00");

    private static final Map<String, String> valueMap = new HashMap<String, String>();
    //private static final Map<String, String> endDateMap = new HashMap<String, String>();
    static {
        for (DateConstant dateConstant : values()) {
            valueMap.put(dateConstant.toString(), dateConstant.getValue());
        }
    }

    private String value;

    private String text;

    public String getValue() {
        return value;
    }

    public DateConstant setValue(String value) {
        this.value = value;
        return this;
    }

    public String getText() {
        return text;
    }

    public DateConstant setText(String text) {
        this.text = text;
        return this;
    }

    public static String getByConstant(String constant) {
        return valueMap.get(constant);
    }

    public static String getByValue(String value){
        List<String> keyList = new ArrayList<>();
        for(String key: valueMap.keySet()){
            if(valueMap.get(key).equals(value)){
                keyList.add(key);
            }
        }
        if(keyList.size() > 0) {
            return keyList.get(0);
        }
        return "";
    }
}
