#Autor:adilek.26@gmail.com

Feature: Language Qualifications

Background:
Given user is logged with valid admin credentials
Given user navigate to employee listpage
And click on the table id "14354" element
And user navigate to qualifications
@inProgress2
Scenario Outline:
And add any available languages
And user  enter employees "<Language>", "<Fluency>", "<Competency>" and "<Comments>" 
Then user see language speciality

Examples:
| Language | Fluency | Competency |Comments |
|Turkce | Speaking | Good | She talks as native speaker |