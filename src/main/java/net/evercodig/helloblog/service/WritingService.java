package net.evercodig.helloblog.service;

import net.evercodig.helloblog.pojo.Writing;
import net.evercodig.helloblog.pojo.WritingVO;

import java.util.List;
import java.util.Map;

public interface WritingService {
    Writing selectWritingById(Integer id);

    List<Writing> selectWritingByAuthorAndHeading(String heading, String author);

    void insertWriting(WritingVO writingVO);

    void updateWriting(WritingVO writingVO);
}
