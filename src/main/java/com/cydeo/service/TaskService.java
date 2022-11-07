package com.cydeo.service;

import com.cydeo.dto.TaskDTO;

import java.util.List;

public interface TaskService {

     void save(TaskDTO dto);

    List<TaskDTO> listAllTasks();
    void update(TaskDTO dto);
    void delete(Long id);
    TaskDTO findById(Long id);
    int totalCompletedTasks(String projectCode);
    int totalNonCompletedTasks(String projectCode);


}
