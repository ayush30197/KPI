package com.example.android.kohlerpowerindia;

import android.content.Intent;

public class DataModel {

 String name;
 String version;
 int id_;
 int image;
 String pdf_name;
 String spec_pdf,wc,pp;

 public DataModel(String name, String version, int id_, int image,String pdf_name,String spec,String wc,String pp) {
  this.name = name;
  this.version = version;
  this.id_ = id_;
  this.image=image;
  this.pdf_name=pdf_name;
  this.spec_pdf=spec;
  this.wc=wc;
  this.pp=pp;
 }

 public String getName() {
  return name;
 }

 public String getVersion() {
  return version;
 }

 public int getImage() {
  return image;
 }

 public int getId() {
  return id_;
 }

 public String getPdf(){
  return pdf_name;
 }
public String getSpec_pdf()
{
 return spec_pdf;
}
 public int getId_() {
  return id_;
 }
 public String getWc(){
  return wc;
 }
 public String getPp(){
  return pp;
 }
}
