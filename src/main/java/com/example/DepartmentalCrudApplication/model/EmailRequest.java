package com.example.DepartmentalCrudApplication.model;

public class EmailRequest {
    private String toEmail;
    private String body;
    private String subject;

    public EmailRequest(String toEmail, String body, String subject){
        this.toEmail = toEmail;
        this.body = body;
        this.subject = subject;
    }
}
