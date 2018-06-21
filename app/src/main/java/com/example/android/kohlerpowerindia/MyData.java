package com.example.android.kohlerpowerindia;

public class MyData {

 static String[] ir_one_name = {"KKN04-II, 50 Hz","KKN05-II, 50 Hz", "KK08-II, 50 Hz","KK10-II, 50 Hz","KK12.5-II, 50 Hz"};
 static String[] ir_two_name = {"KE15-II, 50 Hz","KE20-II, 50 Hz", "KE25-II, 50 Hz","KE30-II, 50 Hz"};
 static String[] ir_three_name = {"KT40-II, 50 Hz ","KT50-II, 50 Hz ", "KT63-II, 50 Hz "};
 static String[] ir_four_name = {"KM83-II, 50 Hz ","KM100-II, 50 Hz ", "KM125-II, 50 Hz","KM160-II, 50 Hz ","KM180-II, 50 Hz","KM200-II, 50 Hz "};
 static String[] ir_five_name = {"KVS320-II, 50 Hz ","KVS380-II, 50 Hz ", "KVS500-II, 50 Hz","KVS600-II, 50 Hz","KVS650-II, 50 Hz"};
 static String[] pr_one_name = {"1250REOZM, 50 Hz","1500REOZM, 50 Hz ", "1600REOZM, 50 Hz","1800REOZM, 50 Hz ","2000REOZM, 50 Hz ","2250REOZM, 50 Hz"};
 static String[] pr_two_name = {"1250KD, 50 Hz","1500KD, 50 Hz ", "1600KD, 50 Hz","1750KD, 50 Hz ","2250KD, 50 Hz ","2800KD, 50 Hz"};
 static String[] eng_one_name = {"KD440, 50 Hz","KDW702, 50 Hz ", "KDW1003, 50 Hz"};



 static String[] ir_one_rating = {"3.5kVA","5kVA","7.5kVA","10kVA","12.5kVA"};
 static String[] ir_two_rating = {"15kVA","20kVA","25kVA","30kVA"};
 static String[] ir_three_rating = {"40kVA","50kVA","62.5kVA"};
 static String[] ir_four_rating = {"82.5kVA","100kVA","125kVA","160kVA","180kVA","200kVA"};
 static String[] ir_five_rating = {"320kVA","380kVA","500kVA","600kVA","650kVA"};
 static String[] pr_one_rating = {"1270kVA","1505kVA","1600kVA","1810kVA","2055kVA","2250kVA"};
 static String[] pr_two_rating = {"1250kVA","1500kVA","1600kVA","1750kVA","2250kVA","2800kVA"};
 static String[] eng_one_rating = {"440kVA","702kVA","1003kVA"};

 static String[] ga_one_draw = {"ga3","ga5","ga8","ga10","ga12"};
 static String[] ga_two_draw = {"ga15","ga20","ga25","ga30"};
 static String[] ga_three_draw = {"ga40","ga50","ga63"};
 static String[] ga_four_draw = {"ga83","ga100","ga125","ga160","ga180","ga200"};
 static String[] ga_five_draw = {"ga320","ga380","ga500","ga600","ga650"};
 static String[] ga_reo_draw = {"reo1250","reo1500","reo1600","reo1600","reo2000","reo2000"};
 static String[] ga_kd_draw = {"ga1250","ga1500","ga1600","ga1750","ga2250","ga2800"};
 static String[] ga_eng_draw = {"","",""};


 static String[] ss_one_draw = {"spec3","spec5","spec8","spec10","spec12"};
 static String[] ss_two_draw = {"spec15","spec20","spec25","spec30"};
 static String[] ss_three_draw = {"spec40","spec50","spec63"};
 static String[] ss_four_draw = {"spec83","spec100","spec125","spec160","spec180","spec200"};
 static String[] ss_five_draw = {"spec320","spec380","spec500","spec600","spec650"};
 static String[] ss_reo_draw = {"ssreo1250","ssreo1500","ssreo1600","ssreo1800","ssreo2000","ssreo2250"};
 static String[] ss_kd_draw = {"skd1250","skd1500","skd1600","skd1750","skd2250","skd2800"};
 static String[] ss_eng_draw = {"kdw440","kdw702hs","kdw1003hs"};

 static String[] wc_cert = {"wc1","wc2","wc3","wc4","wc5","wc6"};

 static String[] pp_one = {"pp3","pp5","pp8","pp10","pp12"};
 static String[] pp_two = {"pp15","pp20","pp25","pp30"};
 static String[] pp_three = {"pp40","pp50","pp63"};
 static String[] pp_four = {"pp83","pp100","pp125","pp160","pp180","pp200"};
 static String[] pp_five = {"pp320","pp380","pp500","pp600","pp650"};
 static String[] pp_pr = {"ppreo","ppkd"};
 static String[] pp_eng = {"ppkden"};

 static Integer[] ir_one_pic = {R.drawable.threekv,
  R.drawable.fivekv,
  R.drawable.sevenkv,
  R.drawable.tenkv,
  R.drawable.twelvekv
  };
 static Integer[] ir_two_pic = {R.drawable.fifteenkv,
  R.drawable.twentykv,
  R.drawable.twentyfive,
  R.drawable.thirtykv
 };
  static Integer[] ir_three_pic = {R.drawable.fortykv,
  R.drawable.fiftykv,
  R.drawable.sixtythree
 };
 static Integer[] ir_four_pic = {R.drawable.eightythree,
  R.drawable.hundredkv,
  R.drawable.onetwofivekv,
  R.drawable.osixzerokv,
  R.drawable.oeightykv,
  R.drawable.twozerozero
 };
 static Integer[] ir_five_pic = {R.drawable.threetwentykv,
  R.drawable.threeeightykv,
  R.drawable.fivehundredkv,
  R.drawable.sixhundred,
  R.drawable.sixhundred
 };
 static Integer[] pr_one_pic = {R.drawable.reo1250,
  R.drawable.reo1500,
  R.drawable.reo1600,
  R.drawable.reo1800,
  R.drawable.reo2000,
  R.drawable.reo2250
 };
 static Integer[] pr_two_pic = {
  R.drawable.kd800,
  R.drawable.kd900,
  R.drawable.kd1000,
  R.drawable.kd1250,
  R.drawable.kd1500,
  R.drawable.kd1600,
  R.drawable.kd1750,
  R.drawable.kd2250f,
  R.drawable.kd2800f
 };
 static Integer[] eng_one_pic = {
  R.drawable.kd440,
  R.drawable.kd702,
  R.drawable.kd1003,
 };

 static Integer[] id_ = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
}