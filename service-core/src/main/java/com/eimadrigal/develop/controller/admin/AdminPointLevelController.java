package com.eimadrigal.develop.controller.admin;

import com.eimadrigal.develop.entity.PointLevel;
import com.eimadrigal.develop.service.PointLevelService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pointLevel")
public class AdminPointLevelController {

    @Resource
    private PointLevelService pointLevelService;

    @GetMapping("/getAllPointLevels")
    public List<PointLevel> getAllPointLevels() {
        return pointLevelService.list();
    }

    @DeleteMapping("/remove/{id}")
    public boolean removeById(@PathVariable Long id) {
        return pointLevelService.removeById(id);
    }
}
