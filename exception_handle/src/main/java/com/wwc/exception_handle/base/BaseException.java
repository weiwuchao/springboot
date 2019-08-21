package com.wwc.exception_handle.base;

import com.wwc.exception_handle.entity.ApiResult;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice(annotations = RestController.class)
@ResponseBody
public class BaseException {

    @ExceptionHandler
    @ResponseStatus
    public ApiResult runtimeExceptionHandle(Exception e){

        return ApiResultGenerator.errorResult(e.getMessage(),e);
    }
}
