package com.example.android.kohlerpowerindia;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ContactsActivity extends AppCompatActivity{

 private RecyclerView recyclerView;
 private DrawerLayout mDrawerLayout;
 private NavigationView navigationView;
 private ActionBar actionbar;
 private Button btn;
 private Toolbar toolbar;
 Intent intent;


 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_contacts);
  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
  //setSupportActionBar(toolbar);

  //recyclerView = (RecyclerView) findViewById(R.id.rview);


  toolbar = findViewById(R.id.toolbar);
  mDrawerLayout = findViewById(R.id.drawer_layout);
  //setSupportActionBar(toolbar);
  actionbar = getSupportActionBar();
  actionbar.setDisplayHomeAsUpEnabled(true);
  actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);
  navigationView = findViewById(R.id.nav_view);
  navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
   @Override
   public boolean onNavigationItemSelected(MenuItem menuItem) {

    navigate(ContactsActivity.this,menuItem);

    // set item as selected to persist highlight
    // close drawer when item is tapped
    mDrawerLayout.closeDrawers();

    Toast.makeText(ContactsActivity.this, "You clicked" + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
    // Add code here to update the UI based on the item selected
    // For example, swap UI fragments here

    return true;
   }
  });




 }


 public void navigate(final Context context, MenuItem menuItem) {

  menuItem.setChecked(true);

  switch (menuItem.getItemId())
  {
   case R.id.products :
   {
    Intent intent=new Intent(context,ProductsActivity.class);
    //Toast.makeText(HomePage.this, "Procucts", Toast.LENGTH_SHORT).show();
    startActivity(intent);
    break;
   }
   case R.id.policy :
   {
    Intent intent=new Intent(context,PolicyActivity.class);
    //Toast.makeText(HomePage.this, "Policy", Toast.LENGTH_SHORT).show();
    startActivity(intent);
    break;
   }
   case R.id.library :
   {

    Intent intent=new Intent(context,LibraryActivity.class);
    //Toast.makeText(HomePage.this, "Library", Toast.LENGTH_SHORT).show();
    startActivity(intent);
    break;
   }
   case R.id.about_us :
   {
    Intent intent=new Intent(context,HomePage.class);
    //Toast.makeText(HomePage.this, "Library", Toast.LENGTH_SHORT).show();
    startActivity(intent);

    break;
   }
   case R.id.contact_us :
   {

    Intent intent=new Intent(context,ContactsActivity.class);
    //Toast.makeText(HomePage.this, "Contact_us", Toast.LENGTH_SHORT).show();
    startActivity(intent);
    break;
   }

  }
 }
 public boolean onOptionsItemSelected(MenuItem item) {
  switch (item.getItemId()) {
   case android.R.id.home:
    mDrawerLayout.openDrawer(GravityCompat.START);
    return true;
  }
  return super.onOptionsItemSelected(item);
 }

 public void onCall(View view) {
  switch (view.getId()){
   case R.id.hq_call :

     intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.hq_phone)));
    startActivity(intent);
    break;

   case R.id.plant_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.plant_phone)));
    startActivity(intent);
    break;
   }
   case R.id.north_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.north_phone)));
    startActivity(intent);
    break;
   }
   case R.id.south_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.south_phone)));
    startActivity(intent);
    break;
   }
   case R.id.east_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.east)));
    startActivity(intent);
    break;
   }
   case R.id.west_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.hq_phone)));
    startActivity(intent);
    break;
   }
   case R.id.amit_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.north_amit)));
    startActivity(intent);
    break;
   }

   case R.id.ravinder_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.north_ravinder)));
    startActivity(intent);
    break;
   }
   case R.id.prabhu_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.south_prabhu)));
    startActivity(intent);
    break;
   }
   case R.id.vishwa_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.south_vishwanatha)));
    startActivity(intent);
    break;
   }
   case R.id.suriya_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.south_suriya)));
    startActivity(intent);
    break;
   }
   case R.id.prakash_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.south_prakash)));
    startActivity(intent);
    break;
   }
   case R.id.tanmoy_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.east_tanmoy)));
    startActivity(intent);
    break;
   }
   case R.id.surojeet_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.east_surojeet)));
    startActivity(intent);
    break;
   }
   case R.id.joyjeet_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.east_joyjeet)));
    startActivity(intent);
    break;
   }
   case R.id.hari_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.east_hari)));
    startActivity(intent);
    break;
   }
   case R.id.shrikant_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.west_shrikant)));
    startActivity(intent);
    break;
   }
   case R.id.vinod_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.west_vinod)));
    startActivity(intent);
    break;
   }
   case R.id.jitendra_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.west_jitendra)));
    startActivity(intent);
    break;
   }
   case R.id.mangesh_call :
   {
    intent= new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:"+getString(R.string.west_mangesh)));
    startActivity(intent);
    break;
   }
  }

 }
 String address="ayush.frndz@gmail.com";


 public void onMail(View view) {
  switch (view.getId()){
   case R.id.amit_mail :
   {
    intent = new Intent(Intent.ACTION_SENDTO);
    intent.setType("text/plain");
    intent.setData(Uri.parse("mailto:"+getString(R.string.north_amit_email)));
    intent.putExtra(Intent.EXTRA_EMAIL, address);
    if (intent.resolveActivity(getPackageManager()) != null) {
     startActivity(intent);
    }
    break;
   }

   case R.id.ravinder_mail :
   {
    intent = new Intent(Intent.ACTION_SENDTO);
    intent.setType("text/plain");
    intent.setData(Uri.parse("mailto:"+getString(R.string.north_ravinder_email)));
    intent.putExtra(Intent.EXTRA_EMAIL, address);
    if (intent.resolveActivity(getPackageManager()) != null) {
     startActivity(intent);
    }
    break;
   }
   case R.id.prabhu_mail :
   {
    intent = new Intent(Intent.ACTION_SENDTO);
    intent.setType("text/plain");
    intent.setData(Uri.parse("mailto:"+getString(R.string.south_prabhu_email)));
    intent.putExtra(Intent.EXTRA_EMAIL, address);
    if (intent.resolveActivity(getPackageManager()) != null) {
     startActivity(intent);
    }
    break;
   }
   case R.id.vishwa_mail :
   {
    intent = new Intent(Intent.ACTION_SENDTO);
    intent.setType("text/plain");
    intent.setData(Uri.parse("mailto:"+getString(R.string.south_vishwanatha_email)));
    intent.putExtra(Intent.EXTRA_EMAIL, address);
    if (intent.resolveActivity(getPackageManager()) != null) {
     startActivity(intent);
    }
    break;
   }
   case R.id.suriya_mail :
   {
    intent = new Intent(Intent.ACTION_SENDTO);
    intent.setType("text/plain");
    intent.setData(Uri.parse("mailto:"+getString(R.string.south_suriya_email)));
    intent.putExtra(Intent.EXTRA_EMAIL, address);
    if (intent.resolveActivity(getPackageManager()) != null) {
     startActivity(intent);
    }
    break;
   }
   case R.id.prakash_mail :
   {
    intent = new Intent(Intent.ACTION_SENDTO);
    intent.setType("text/plain");
    intent.setData(Uri.parse("mailto:"+getString(R.string.south_prakash_email)));
    intent.putExtra(Intent.EXTRA_EMAIL, address);
    if (intent.resolveActivity(getPackageManager()) != null) {
     startActivity(intent);
    }
    break;
   }
   case R.id.tanmoy_mail :
   {
    intent = new Intent(Intent.ACTION_SENDTO);
    intent.setType("text/plain");
    intent.setData(Uri.parse("mailto:"+getString(R.string.east_tanmoy_mail)));
    intent.putExtra(Intent.EXTRA_EMAIL, address);
    if (intent.resolveActivity(getPackageManager()) != null) {
     startActivity(intent);
    }
    break;
   }
   case R.id.surojeet_mail :
   {
    intent = new Intent(Intent.ACTION_SENDTO);
    intent.setType("text/plain");
    intent.setData(Uri.parse("mailto:"+getString(R.string.east_surojeet_mail)));
    intent.putExtra(Intent.EXTRA_EMAIL, address);
    if (intent.resolveActivity(getPackageManager()) != null) {
     startActivity(intent);
    }
    break;
   }
   case R.id.joyjeet_mail :
   {
    intent = new Intent(Intent.ACTION_SENDTO);
    intent.setType("text/plain");
    intent.setData(Uri.parse("mailto:"+getString(R.string.east_joyjeet_mail)));
    intent.putExtra(Intent.EXTRA_EMAIL, address);
    if (intent.resolveActivity(getPackageManager()) != null) {
     startActivity(intent);
    }
    break;
   }
   case R.id.hari_mail :
   {
    intent = new Intent(Intent.ACTION_SENDTO);
    intent.setType("text/plain");
    intent.setData(Uri.parse("mailto:"+getString(R.string.east_hari_mail)));
    intent.putExtra(Intent.EXTRA_EMAIL, address);
    if (intent.resolveActivity(getPackageManager()) != null) {
     startActivity(intent);
    }
    break;
   }
   case R.id.shrikant_mail :
   {
    intent = new Intent(Intent.ACTION_SENDTO);
    intent.setType("text/plain");
    intent.setData(Uri.parse("mailto:"+getString(R.string.west_shrikant_email)));
    intent.putExtra(Intent.EXTRA_EMAIL, address);
    if (intent.resolveActivity(getPackageManager()) != null) {
     startActivity(intent);
    }
    break;
   }
   case R.id.vinod_mail :
   {
    intent = new Intent(Intent.ACTION_SENDTO);
    intent.setType("text/plain");
    intent.setData(Uri.parse("mailto:"+getString(R.string.west_vinod_email)));
    intent.putExtra(Intent.EXTRA_EMAIL, address);
    if (intent.resolveActivity(getPackageManager()) != null) {
     startActivity(intent);
    }
    break;
   }
   case R.id.jitendra_mail :
   {
    intent = new Intent(Intent.ACTION_SENDTO);
    intent.setType("text/plain");
    intent.setData(Uri.parse("mailto:"+getString(R.string.west_jitendra_email)));
    intent.putExtra(Intent.EXTRA_EMAIL, address);
    if (intent.resolveActivity(getPackageManager()) != null) {
     startActivity(intent);
    }
    break;
   }
   case R.id.mangesh_mail :
   {
    intent = new Intent(Intent.ACTION_SENDTO);
    intent.setType("text/plain");
    intent.setData(Uri.parse("mailto:"+getString(R.string.west_mangesh_email)));
    intent.putExtra(Intent.EXTRA_EMAIL, address);
    if (intent.resolveActivity(getPackageManager()) != null) {
     startActivity(intent);
    }
    break;
   }
  }
 }
 public void onBackPressed() {
  super.onBackPressed();
  Intent intent = new Intent(this,HomePage.class);
  startActivity(intent);
 }
}