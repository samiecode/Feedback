package com.samiecode.feedback;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FeedbackService {
    private final FeedbackRepository feedbackRepository;

    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }

    public ResponseEntity<?> saveFeedback(Feedback feedback){
        feedbackRepository.save(feedback);
        return new ResponseEntity<>("Save Successfully!", HttpStatus.CREATED);
    }
}
