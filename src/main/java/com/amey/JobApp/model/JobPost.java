package com.amey.JobApp.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data // HENCE NO NEED TO CREATE GETTERS AND SETTERS
@NoArgsConstructor // NO NEED TO CREATE CONSTRUCTOR
@AllArgsConstructor
@Component
public class JobPost {
    private int postId;
    private int reqExperience;
    private String postProfile;
    private String postDesc;
    private List<String> postTechStack;

    public <E> JobPost(int i, String javaDeveloper, String s, int i1, List<E> es) {
    }
}
