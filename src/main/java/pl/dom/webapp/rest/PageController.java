package pl.dom.webapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.dom.webapp.PageInfo;

@RestController
@RequestMapping("page")
public class PageController
{
    @GetMapping
    public PageInfo pageInfo(@RequestParam String pageNumber)
    {
        return new PageInfo().setTitle("Page " + pageNumber);
    }
}