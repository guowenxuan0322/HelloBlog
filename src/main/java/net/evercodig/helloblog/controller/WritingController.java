package net.evercodig.helloblog.controller;

import net.evercodig.helloblog.pojo.Writing;
import net.evercodig.helloblog.pojo.WritingVO;
import net.evercodig.helloblog.service.WritingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/writing")
public class WritingController {

    @Autowired
    WritingService writingService;

    @RequestMapping(value = "/writings/{id:\\d+}", method = RequestMethod.GET)
    public Writing findWriting(@PathVariable("id") Integer id) {
        Writing writing = writingService.selectWritingById(id);
        return writing;
    }

    @RequestMapping(value = "/writings/{heading}/{author}", method = RequestMethod.GET)
    public List<Writing> findWrintingByAuthorAndHeading (@PathVariable String heading,@PathVariable String author) {
        List<Writing> writings = writingService.selectWritingByAuthorAndHeading(heading,author);
        return writings;
    }

    @RequestMapping(value = "/writings/id" ,method = RequestMethod.POST)
    public void  insertWriting (@RequestBody WritingVO writingVO) {
        writingService.insertWriting(writingVO);
    }

    @RequestMapping(value = "/writings/id",method = RequestMethod.PUT)
    public void updateWriting(@RequestBody WritingVO writingVO){
        writingService.updateWriting(writingVO);
    }
}
