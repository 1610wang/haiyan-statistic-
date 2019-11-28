package com.gome.statistic.domain.constant;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wenjie
 * @Date: 2019/9/23 4:21 PM
 */
@AllArgsConstructor
@NoArgsConstructor
public enum EndDateConstant {

    Q3W1("2019-03-29 00:00:00"),

    Q3W2("2019-04-05 00:00:00");

    private static final Map<String, String> valueMap = new HashMap<String, String>();
    static {
        for (EndDateConstant startDateConstant : values()) {
            valueMap.put(startDateConstant.toString(), startDateConstant.getValue());
        }
    }

    private String value;

    public String getValue() {
        return value;
    }

    public EndDateConstant setValue(String value) {
        this.value = value;
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
