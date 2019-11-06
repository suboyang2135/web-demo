package com.ikang.controller;

import com.ikang.vo.ReturnTimeVo;
import com.ikang.vo.TimeParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuyang
 */
@Slf4j
@RestController
public class TimeController {

    @GetMapping(value = "/get")
    public ReturnTimeVo testTimeParam(@Validated TimeParam timeParam) {
        // return JSON.toJSONString(timeParam);
        return ReturnTimeVo.builder().startTime(timeParam.getStartTime()).endTime(timeParam.getEndTime()).build();
    }
}
