package com.example.android.kohlerpowerindia;

public class Contacts {
 private String title, genre, year,contact;

 public Contacts() {
 }

 public Contacts(String title, String genre, String year, String contact) {
  this.title = title;
  this.genre = genre;
  this.year = year;
  this.contact=contact;
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String name) {
  this.title = name;
 }

 public String getYear() {
  return year;
 }

 public void setYear(String year) {
  this.year = year;
 }

 public String getGenre() {
  return genre;
 }

 public void setGenre(String genre) {
  this.genre = genre;
 }

 public String getContact() {
  return contact;
 }

 public void setContact(String contact) {
  this.contact = contact;
 }
}