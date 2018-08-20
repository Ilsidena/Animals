package ru.suai.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.suai.Rest;

@FeignClient("client")
interface Api {
    @RequestMapping("/feed")
    Rest getResponse(@PathVariable("name")String name,
                     @PathVariable("food")String food,
                     @PathVariable("count")int count);
}