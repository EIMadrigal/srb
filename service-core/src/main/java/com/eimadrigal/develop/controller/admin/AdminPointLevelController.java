package com.eimadrigal.develop.controller.admin;

import com.eimadrigal.develop.entity.PointLevel;
import com.eimadrigal.develop.result.Result;
import com.eimadrigal.develop.service.PointLevelService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/save")
    public Result save(@RequestBody PointLevel pointLevel) {
        boolean saveRes = pointLevelService.save(pointLevel);
        return saveRes ? Result.ok() : Result.error();
    }

    @GetMapping("/get/{id}")
    public Result getById(@PathVariable Long id) {
        PointLevel pointLevel = pointLevelService.getById(id);
        if (pointLevel == null) {
            return Result.error();
        }
        return Result.ok(pointLevel);
    }

    @PutMapping("/update")
    public Result updateById(@RequestBody PointLevel pointLevel) {
        boolean updateRes = pointLevelService.updateById(pointLevel);
        return updateRes ? Result.ok() : Result.error();
    }
}
