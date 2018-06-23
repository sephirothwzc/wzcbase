package com.sephiroth.wzcbase.utilscommon;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 模拟数据生成
 */
public class MockVO {

    /**
     * list生成
     * @param clazz
     * @param rowCount
     * @param <T>
     * @return
     */
    public static <T> List<T> mockList(Class<T> clazz,Integer rowCount) {
        ArrayList<T> result = new ArrayList();
        for(int i=0;i<rowCount;i++) {
            T t = TClass.defaultT(clazz);
            String it = String.valueOf(i);
            Arrays.stream(clazz.getDeclaredFields()).forEach(p-> {
                // 获取set
                String setMethodName="set"+p.getName().substring(0,1).toUpperCase()+p.getName().substring(1);
                // 调用副本对象的set方法把属性值复制过来
                Method setMethod= null;
                try {
                    setMethod = clazz.getDeclaredMethod(setMethodName, new Class[]{p.getType()});
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
                try {
                    setMethod.invoke(t, new Object[]{p.getName()+ it});
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            });
            result.add(t);
        }
        return result;
    }
}
