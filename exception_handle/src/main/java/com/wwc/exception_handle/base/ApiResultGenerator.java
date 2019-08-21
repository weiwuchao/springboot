package com.wwc.exception_handle.base;

import com.wwc.exception_handle.entity.ApiResult;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class ApiResultGenerator {

    public static ApiResult result(boolean flag, String msg, Object result, String jumpUrl, int rows, Throwable throwable)
    {
        //创建返回对象
        ApiResult apiResult = ApiResult.getInstance();
        apiResult.setFlag(flag);
        apiResult.setMsg(msg == "" ? "执行成功" : msg);
        apiResult.setResult(result);
        apiResult.setJumpUrl(jumpUrl);
        apiResult.setTime(System.currentTimeMillis());
        apiResult.setRows(rows);
        return apiResult;
    }

    /**
     * 返回执行成功视图方法
     * @param result 执行成功后的返回内容
     * @return
     */
    public static ApiResult successResult(Object result)
    {
        //rows默认为0
        int rows = 0;
        //如果是集合
        if(result instanceof List)
        {
            //获取总数量
            rows = ((List)result).size();
        }
        return result(true,"",result,"",rows,null);
    }

    /**
     * 成功没有内容方法
     * @return
     */
    public static ApiResult successResult(HttpServletRequest request){
        return successResult("");
    }

    /**
     * 执行失败后返回视图方法
     * @param msg 执行失败后的错误消息内容
     * @return
     */
    public static ApiResult errorResult(String msg, Throwable throwable)
    {
        return result(false,msg,"","",0,throwable);
    }
}
