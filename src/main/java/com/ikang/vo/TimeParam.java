package com.ikang.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * @author xuyang
 */
@Data
public class TimeParam {

    /**
     * 起始时间
     */
    @NotNull(message = "起始时间不能为空！")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;

    /**
     * 终止时间
     */
    @NotNull(message = "终止时间不能为空！")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;
}
