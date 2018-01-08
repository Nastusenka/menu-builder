package com.klab.menubuilder.services;

import com.klab.menubuilder.models.Tag;
import com.klab.menubuilder.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {

    private TagRepository tagRepository;

    @Autowired
    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public List<Tag> getAll() {
        return tagRepository.findAll();
    }

    public Tag getById(Long id) {
        return tagRepository.findOne(id);
    }

    public Tag create(Tag tag) {
        return tagRepository.saveAndFlush(tag);
    }
}
