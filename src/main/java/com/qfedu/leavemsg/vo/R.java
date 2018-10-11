package com.qfedu.leavemsg.vo;

/**
 *@Author feri
 *@Date Created in 2018/10/11 14:54
 */
public class R {
    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public R(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public R() {
    }

    public static R setOK(){
        return new R(200,"OK",null);
    }
    public static R setERROR(){
        return new R(400,"ERROR",null);
    }

}
