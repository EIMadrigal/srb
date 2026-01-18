package com.eimadrigal.develop.controller.admin;

import com.eimadrigal.develop.result.Result;
import com.eimadrigal.develop.service.PointLevelService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/pointLevel")
public class AdminPointLevelController {

    @Resource
    private PointLevelService pointLevelService;

    @GetMapping("/getAllPointLevels")
    public Result getAllPointLevels() {
        return Result.ok(pointLevelService.list());
    }

    @DeleteMapping("/remove/{id}")
    public Result removeById(@PathVariable Long id) {
        boolean removeRes = pointLevelService.removeById(id);
        return removeRes ? Result.ok() : Result.error();
    }
}
