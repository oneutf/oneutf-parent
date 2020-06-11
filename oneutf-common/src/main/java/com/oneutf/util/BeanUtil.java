package com.oneutf.util;

import com.github.pagehelper.Page;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oneutf
 * @description: 封裝bean
 */
public class BeanUtil {

    /**
     * 根据 class 创建一个实例
     *
     * @param source 源
     * @param target 目标class
     * @param <T>    实例类型
     * @return 目标实例
     */
    public static <T> T copyProperties(Object source, Class<T> target) {
        T targetObject = null;
        if (null == source) {
            return null;
        } else {
            try {
                targetObject = target.newInstance();
            } catch (IllegalAccessException | InstantiationException var4) {
                var4.printStackTrace();
            }

            copyProperties(source, targetObject);
            return targetObject;
        }
    }

    /**
     * 封装 BeanUtils
     *
     * @param source 源
     * @param target 目标
     */
    public static void copyProperties(Object source, Object target) {
        BeanUtils.copyProperties(source, target);
    }

    /**
     * 封装 list 复制
     *
     * @param list  list
     * @param clazz 目标 class
     * @param <M>   目标类型
     * @return 目标 list
     */
    public static <M> List<M> transfer(List<?> list, Class<M> clazz) {
        List<M> mList = new ArrayList<>();
        list.forEach((o) -> {
            mList.add(copyProperties(o, clazz));
        });
        return mList;
    }

    public static <M> List<M> voTransfer(List<?> list, Class<M> clazz) {
        Page page = (Page) list;
        Page<M> mPage = new Page<>();
        page.forEach(p -> {
            mPage.add(copyProperties(p, clazz));
        });

        mPage.setPageNum(page.getPageNum());
        mPage.setPageSize(page.getPageSize());
        mPage.setPages(page.getPages());
        return mPage;
    }


}
