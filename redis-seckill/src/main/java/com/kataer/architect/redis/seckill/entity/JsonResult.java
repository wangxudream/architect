package com.kataer.architect.redis.seckill.entity;


/**
 * @ClassName JsonResult
 * @Description: TODO
 * @Author kataer
 * @Date 2020/10/28 19:23
 * @Version V1.0
 **/


/**
 * 返回结果对象
 */
public class JsonResult<T> {
    private static final long serialVersionUID = 1L;
    private Integer code;
    private String msg;
    private T[] data;

    private JsonResult() {
    }

    /**
     * 返回成功
     */
    public static JsonResult ok() {
        return ok("操作成功");
    }

    /**
     * 返回成功
     */
    public static JsonResult ok(String message) {
        return ok(200, message);
    }

    /**
     * 返回成功
     */
    public static JsonResult ok(int code, String msg) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(code);
        jsonResult.setMsg(msg);
        return jsonResult;
    }

    /**
     * 返回失败
     */
    public static JsonResult error() {
        return error("操作失败");
    }

    /**
     * 返回失败
     */
    public static JsonResult error(String msg) {
        return error(500, msg);
    }

    /**
     * 返回失败
     */
    public static JsonResult error(int code, String msg) {
        return ok(code, msg);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }
}
