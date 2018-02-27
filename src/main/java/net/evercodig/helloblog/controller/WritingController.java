package net.evercodig.helloblog.controller;

import net.evercodig.helloblog.pojo.Writing;
import net.evercodig.helloblog.service.WritingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("writing")
public class WritingController {

    @Autowired
    WritingService writingService;


    @RequestMapping(value = "/findwriting/{id:\\d+}", method = RequestMethod.GET)
    public Writing findWriting(@PathVariable("id") Integer id) {
        Writing writing = writingService.selectWritingById(id);
        return writing;
    }


    @RequestMapping(value = "/findwritingby/{author}/{heading}")
    public List<Writing> findWrintingByAuthorAndHeading(@PathVariable String author, @PathVariable String heading) {
        List<Writing> writings = writingService.selectWritingByAuthorAndHeading(author,heading);
        return writings;
    }


    @RequestMapping("/insert/{id}/{heading}/{content}/{author}")
    public void insertWriting(@PathVariable String heading, @PathVariable String content, @PathVariable String author) {
        writingService.insertWriting(heading, content, author);
    }

    @RequestMapping("/update/{id}/{heading}/{content}/{author}")
    public void updateWriting(@PathVariable Integer id,@PathVariable String heading, @PathVariable String content, @PathVariable String author){
        writingService.updateWriting(id,heading, content, author);
    }
}
