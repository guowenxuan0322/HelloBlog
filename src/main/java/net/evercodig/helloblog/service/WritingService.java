package net.evercodig.helloblog.service;

import net.evercodig.helloblog.pojo.Writing;

import java.util.List;
import java.util.Map;

public interface WritingService {
    Writing selectWritingById(Integer id);

    List<Writing> selectWritingByAuthorAndHeading(String author, String heading);

    void insertWriting(String heading, String content, String author);

    void updateWriting(Integer id, String heading, String content, String author);
}
