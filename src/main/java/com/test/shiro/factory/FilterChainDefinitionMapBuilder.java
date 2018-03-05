/*
 * <p>Copyright: Copyright(C) 2017-2018</p >
 * <p> 公司：北京新媒传信科技有限公司</p >
 * FileName: ${FILE_NAME}
 * Description: xxxxx
 * History:
 * 版本号     作者       日期    操作
 *  1.0     liupenggc  2018/3/5   x
 * ...
 */

package com.test.shiro.factory;

import java.util.LinkedHashMap;

/**
 * @author liupenggc
 * @version 1.0
 * @date 2018/3/5 12:49
 */
public class FilterChainDefinitionMapBuilder {
    /**
     * 此 map映射关系可以修改为从数据库中动态获取
     * @return
     */
    public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
//                /=authc
//                /index=authc
//                /user/login=authc       &lt;!&ndash; 使用authc &ndash;&gt;
//                /logout=logout
//                /static/**=anon&lt;!&ndash; 静态资源文件访问 &ndash;&gt;
//                /**=user
        map.put("/", "authc");
        map.put("/index", "authc");
        map.put("/user/login","authc");
        map.put("/logout", "logout");
        map.put("/static/**", "anon");
        map.put("/**", "user");
        return map;
    }

}