package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tasks")
@Where(clause = "is_deleted=false")
public class Task extends BaseEntity{

  private String taskSubject;
  private String taskDetail;

  @Enumerated(EnumType.STRING)
  private Status taskStatus;

  @Column(columnDefinition = "DATE")
  private LocalDate assignedDate;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "assigned_employee_id")
  private User assignedEmployee;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "project_id")
  private Project project;


}
