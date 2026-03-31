package com.example.demo.springcomposelab.controller;

import com.example.demo.springcomposelab.dto.MenuResponse;
import com.example.demo.springcomposelab.entity.Menu;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/menus")
    public List<MenuResponse> getMenus() {
        List<Menu> menus = entityManager
                .createQuery("select m from Menu m order by m.id", Menu.class)
                .getResultList();

        return menus.stream()
                .map(menu -> new MenuResponse(
                        menu.getId(),
                        menu.getName(),
                        menu.getPrice()
                ))
                .toList();
    }
}
