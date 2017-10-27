package cn.tac.test.spring.boot.banner.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author tac
 * @since 27/10/2017
 */
public abstract class StartupUtils {
    public static String[] specifyEnv(String[] args, String env){
        List<String> ls = new ArrayList<>();
        Collections.addAll(ls, args);
        ls.add("--spring.profiles.active=" + env);
        String[] arr = new String[ls.size()];
        return ls.toArray(arr);
    }
}
