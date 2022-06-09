package com.gaitan.SpringAuthentication.service;

import com.gaitan.SpringAuthentication.domain.Project;
import com.gaitan.SpringAuthentication.repository.ProjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project addProject(Project project){
        return projectRepository.save(project);
    }
    public Project updateProject(Project project){
        return projectRepository.save(project);
    }
    public List<Project> findAllProjects(){
        return projectRepository.findAll();
    }
    public void deleteProject(Long id){
        projectRepository.deleteById(id);
    }
}
