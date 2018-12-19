package com.nttdata.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.nttdata.app.exception.FileStorageException;
import com.nttdata.app.model.Idea;
import com.nttdata.app.repository.ValueCreationIdeaRepository;

@Service
public class DBFileStorageService {

    @Autowired
    private ValueCreationIdeaRepository valueCreationIdeaRepository;

    public Idea storeFile(MultipartFile file) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            Idea idea = new Idea("Mahant Idea", "classification", "account", "hardwareReq", "softwareReq", "problem", "solution", "benefit", "detailedDesc", "userId", "status", file.getBytes(), "ideaFor", "accSpecific", "location", "theme", "yes");

            return valueCreationIdeaRepository.save(idea);
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    public List<Idea> getFile(String fileId) {
        return valueCreationIdeaRepository.findByUserId(fileId);
    }
}
