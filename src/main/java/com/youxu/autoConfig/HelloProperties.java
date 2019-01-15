package com.youxu.autoConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 该注解可以完成将application.properties配置文件内的有规则的配置参数映射到实体内的field内，不过需要提供setter方法
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {
    //消息内容
    private String msg = "youxu";
    //是否显示消息内容
    private boolean show = true;

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public boolean isShow() {
        return show;
    }
    public void setShow(boolean show) {
        this.show = show;
    }
}
