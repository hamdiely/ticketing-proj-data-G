package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.TaskDTO;
import com.cydeo.dto.UserDTO;

import com.cydeo.enums.Status;

import java.util.List;

public interface TaskService {

     void save(TaskDTO dto);

    List<TaskDTO> listAllTasks();
    void update(TaskDTO dto);
    void delete(Long id);
    TaskDTO findById(Long id);
    int totalCompletedTasks(String projectCode);
    int totalNonCompletedTasks(String projectCode);

    void deleteByProject(ProjectDTO projectDTO);

    void completeByProject(ProjectDTO projectDTO);

    List<TaskDTO> listAllTasksByStatusIsNot(Status status);
    List<TaskDTO> listAllTasksByStatus(Status status);

    List<TaskDTO> listAllNonCompletedByAssignedEmployee(UserDTO assignedEmployee);

}
