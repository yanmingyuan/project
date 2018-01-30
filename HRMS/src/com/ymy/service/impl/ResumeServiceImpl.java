package com.ymy.service.impl;

import com.ymy.dao.ResumeMapper;
import com.ymy.model.Resume;
import com.ymy.model.User;
import com.ymy.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeMapper resumeMapper;
    @Override
    public List<Resume> queryAll() {
        return resumeMapper.queryAll();
    }

    @Override
    public Resume queryObject(User user) {
        return resumeMapper.queryObject(user);
    }

    @Override
    public boolean addResume(Resume resume) {
        return resumeMapper.addResume(resume);
    }

    @Override
    public boolean deleteResume(Resume resume) {
        return resumeMapper.deleteResume(resume);
    }
}
