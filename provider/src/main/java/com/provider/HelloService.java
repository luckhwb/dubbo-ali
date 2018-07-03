package com.provider;

import com.api.Hello;
import org.springframework.stereotype.Service;

/**
 * Created by Hua wb on 2018/7/3.
 */
@Service
public class HelloService implements Hello {

    @Override
    public String say() {
        return "Hello Dubbo ..";
    }
}
