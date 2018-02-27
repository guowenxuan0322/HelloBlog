package net.evercodig.helloblog.service.impl;

import net.evercodig.helloblog.dao.WritingDao;
import net.evercodig.helloblog.pojo.Writing;
import net.evercodig.helloblog.service.WritingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class WritingServiceImpl implements WritingService {
    @Autowired
    WritingDao writingDao;


    @Override
    public Writing selectWritingById(Integer id) {
        Writing writing = writingDao.selectByPrimaryKey(id);
        return writing;
    }

    @Override
    public List<Writing> selectWritingByAuthorAndHeading(String author, String heading) {
        Map<String, String> findMap = new HashMap<String, String>();
        findMap.put("author", author);
        findMap.put("heading", heading);
        System.out.println(findMap);
        List<Writing> writings = writingDao.selectByAuthorAndHeading(findMap);
        return writings;
    }

    @Override
    public void insertWriting(String heading, String content, String author) {
        Writing writing = new Writing();
        writing.setHeading(heading);
        writing.setContent(content);
        writing.setAuthor(author);
        writing.setInittime(System.currentTimeMillis());
        writing.setChangetime(System.currentTimeMillis());

        int i = writingDao.insert(writing);
        System.out.println(i);
    }

    @Override
    public void updateWriting(Integer id, String heading, String content, String author) {
        Writing writing = new Writing();
        writing.setId(id);
        writing.setHeading(heading);
        writing.setContent(content);
        writing.setAuthor(author);
        writing.setChangetime(System.currentTimeMillis());
        int i = writingDao.updateByPrimaryKeySelective(writing);
        System.out.println(i);
    }


}
