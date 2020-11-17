package com.example.NYTimesproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class NewsController {

    //Asking for an ArrayList<Results>
    //Create instance of a Results
    //

    Multimedia multimediaA = new Multimedia("@ol.com", "Top to bottom", 63, 32,"Opinion", "Persuasive", "Holy cow!", "C2004");
    ArrayList<Multimedia> multimediaList = new ArrayList<Multimedia>(Arrays.asList(multimediaA));
    Results abc = new Results("Sports", "Basketball", "NBA Champions", "N/A", "ksl.co", "dan.io", "Lebron's fourth ring!", "nani?", "10-31-20", "10-25-20", "10-28-20", "idk","why",  multimediaList);
    ArrayList<Results> stories = new ArrayList<>(Arrays.asList(abc));









    @GetMapping("/TopStories")
    public News news(){
        return new News("OK","Copyright (c) 2020 the New York Times company"
                ,"Science","2020-11-12T07:48:22-05:00" ,25,stories);
    }
}

