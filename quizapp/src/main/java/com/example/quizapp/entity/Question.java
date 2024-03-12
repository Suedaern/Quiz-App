package com.example.quizapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Question
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "question_seq")
    @SequenceGenerator(name = "question_seq",allocationSize = -1)

    private int id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultylevel;
    private String category;

}
