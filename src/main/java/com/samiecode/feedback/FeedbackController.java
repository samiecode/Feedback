package com.samiecode.feedback;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/feedback")
@RequiredArgsConstructor
public class FeedbackController {

    private final FeedbackService feedbackService;
    
    @GetMapping
    List<Feedback> getAllFeedback() {
        return feedbackService.getAllFeedback();
    }

    @PostMapping
    ResponseEntity<?> saveFeedback(@RequestBody Feedback feedback){
        return feedbackService.saveFeedback(feedback);
    }
}
