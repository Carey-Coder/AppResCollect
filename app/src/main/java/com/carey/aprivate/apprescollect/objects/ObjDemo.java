package com.carey.aprivate.apprescollect.objects;

import android.content.Context;

import com.carey.aprivate.apprescollect.utils.PrintfUT;
import com.carey.aprivate.apprescollect.utils.ShapreUT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 万能对象类模板，因为枚举值不能再外部动态初始化，所以该类无法被继承。使用时只需要修改对象的枚举键内容即可。<br>
 * Created by LiuJie on 2015年12月10日18:02:36.
 */
public class ObjDemo {
    public enum enumKeys { // <--这里输入对象类的属性Key值。
        objId, objName
    }

    private boolean isCache = false;
    private List<String> ObjectKeys = new ArrayList<String>();
    private Map<String, Object> ObjectValues = new HashMap<String, Object>();

    /**
     * 初始化用户对象,成功初始化后默认值为当前对象类的类名。
     *
     * @param context 上下文
     * @param isCache 是否缓存在Shapre
     */
    public ObjDemo(Context context, boolean isCache) {
        this.isCache = isCache;
        for (enumKeys key : enumKeys.values()) {
            ObjectKeys.add(String.valueOf(key));
        }
        if (isCache) {
            for (String key : ObjectKeys) {
                ShapreUT.put(context, key, getClass().getSimpleName());
            }
            for (String key : ObjectKeys) {
                String value = (String) ShapreUT.get(context, key, "");
                if (value != null && !value.equals("")) {
                    ObjectValues.put(key, value);
                }
            }
        } else {
            for (String key : ObjectKeys) {
                ObjectValues.put(key, getClass().getSimpleName());
            }
        }
    }

    /**
     * 获取用户单一属性值
     *
     * @param context
     * @param key     属性的对应键值
     * @return
     */
    public String getValue(Context context, String key) {
        boolean ishas = false;
        String value = "";
        for (String aObjectKey : ObjectKeys) {
            if (key.equals(aObjectKey)) {
                ishas = true;
                break;
            }
        }
        if (ishas) {
            if (isCache) {
                value = (String) ShapreUT.get(context, key, "");
                if (value != null) {
                    if (!value.equals("")) {
                        PrintfUT.LogD(context, "数据获取成功，获取值：" + value);
                        return value;
                    } else {
                        PrintfUT.LogE(context, "Shapre缓存数据读取失败，请核对Key值");
                    }
                } else {
                    PrintfUT.LogE(context, "Shapre缓存数据读取异常，请确认ShaPre初始化正常");
                }
            } else {
                PrintfUT.LogD(context, "数据获取成功，获取值：" + value);
                return (String) ObjectValues.get(key);
            }
        } else {
            PrintfUT.LogE(context, "key值未注册，请核对对象的Key值属性");
        }
        return "数据获取失败";
    }

    /**
     * 写入用户单一属性值
     *
     * @param context
     * @param key     属性对应键值
     * @param value   属性值
     * @return
     */
    public boolean setValue(Context context, String key, String value) {
        boolean ishas = false;
        for (String aObjectKey : ObjectKeys) {
            if (key.equals(aObjectKey)) {
                ishas = true;
                break;
            }
        }
        if (ishas) {
            if (isCache) {
                ShapreUT.put(context, key, value);
                String result = getValue(context, key);
                if (result.equals(value)) {
                    ObjectValues.put(key, value);
                    PrintfUT.LogD(context, "数据写入成功，写入值：" + value + "，缓存值：" + result);
                    return true;
                } else {
                    PrintfUT.LogE(context, "数据写入失败，写入值：" + value + "，缓存值：" + result);
                    return false;
                }
            } else {
                String result = (String) ObjectValues.get(key);
                if (result.equals(value)) {
                    ObjectValues.put(key, value);
                    PrintfUT.LogD(context, "数据写入成功，写入值：" + value + "，缓存值：" + result);
                    return true;
                } else {
                    PrintfUT.LogE(context, "数据写入失败，写入值：" + value + "，缓存值：" + result);
                    return false;
                }
            }
        } else {
            PrintfUT.LogE(context, "key值未注册，请核对对象的Key值属性");
        }
        return false;
    }

    /**
     * 获取全部的Object-Key
     *
     * @return
     */
    public List<String> getObjectKeys() {
        return ObjectKeys;
    }

    /**
     * 获取全部的Object-Value
     *
     * @return
     */
    public Map<String, Object> getObjectValues() {
        return ObjectValues;
    }
}
