package com.ho.controller;


import com.ho.pojo.dto.PositionDTO;
import com.ho.pojo.vo.ListPositionInfoVO;
import com.ho.result.ResultApi;
import com.ho.service.impl.PositionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 * 岗位表 前端控制器
 * </p>
 *
 * @author Ho
 * @since 2021-11-13
 */
@RestController
@RequestMapping("/position")
public class PositionController {
    @Autowired
    private PositionServiceImpl positionService;

    @GetMapping
    public ResultApi<ListPositionInfoVO> listPositionInfo() {
        ListPositionInfoVO info = positionService.listPositionInfo();
        return ResultApi.success(info);
    }

    @PostMapping
    public ResultApi savePosition(@RequestBody @Validated PositionDTO positionDTO, BindingResult bindingResult) {
        if (ObjectUtils.isEmpty(positionDTO) || bindingResult.hasErrors()) {
            return ResultApi.error("请按规范填写岗位信息!");
        }
        boolean isSuccess = positionService.savePosition(positionDTO);
        if (isSuccess) {
            return ResultApi.success("岗位添加成功!");
        }
        return ResultApi.error("岗位添加失败，请稍后重试！");
    }
}

