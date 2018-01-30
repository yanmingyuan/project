package com.ymy.service;

import com.ymy.model.Resume;
import com.ymy.model.User;

import java.util.List;

public interface ResumeService {
    List<Resume> queryAll();
    Resume queryObject(User user);
    boolean addResume(Resume resume);
    boolean deleteResume(Resume resume);
    boolean updateResume(Resume resume);
}
