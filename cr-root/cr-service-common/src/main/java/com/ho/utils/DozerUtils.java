package com.ho.utils;

import org.dozer.DozerBeanMapper;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Ho
 * 对象转换工具
 * 单例
 */
public class DozerUtils {
    private static DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

    private DozerUtils() {
    }

    public static <T> T ObjectTransfor(Object org, Class<T> target) {
        if (ObjectUtils.isEmpty(org) || ObjectUtils.isEmpty(target)) {
            return null;
        }
        return dozerBeanMapper.map(org, target);
    }

    public static <T> List<T> ObjectListTransfor(Collection<?> org, Class<T> target) {
        if (ObjectUtils.isEmpty(org) || ObjectUtils.isEmpty(target)) {
            return null;
        }
        ArrayList<T> targetList = new ArrayList<>();
        org.forEach(obj -> targetList.add(ObjectTransfor(obj,target)));
        return targetList;
    }
}
