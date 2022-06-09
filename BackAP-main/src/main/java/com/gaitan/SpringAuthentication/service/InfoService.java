package com.gaitan.SpringAuthentication.service;

import com.gaitan.SpringAuthentication.domain.Info;
import com.gaitan.SpringAuthentication.exception.UserNotFoundException;
import com.gaitan.SpringAuthentication.repository.InfoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InfoService {

    private final InfoRepository infoRepository;

    public InfoService(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public Info addInfo(Info info){
        return infoRepository.save(info);
    }
    public Info updateInfo(Info info){
        return infoRepository.save(info);
    }
    public Info findInfoById(Long id){
        return (Info) infoRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }
}