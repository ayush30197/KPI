package com.example.android.kohlerpowerindia;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class HomePage extends AppCompatActivity {
ImageView imgView;
 private DrawerLayout mDrawerLayout;
private NavigationView navigationView;
private ActionBar actionbar;
 private Button btn;
 private Toolbar toolbar;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_home_page);
  imgView=(ImageView)findViewById(R.id.imgView);

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
    navigate(HomePage.this,menuItem);

    // set item as selected to persist highlight
    // close drawer when item is tapped
    mDrawerLayout.closeDrawers();

    Toast.makeText(HomePage.this, "You clicked" + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
    // Add code here to update the UI based on the item selected
    // For example, swap UI fragments here

    return true;
   }
  });


 }

 public void navigate(final Context context,MenuItem menuItem) {

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

 @Override
 public boolean onOptionsItemSelected(MenuItem item) {
  switch (item.getItemId()) {
   case android.R.id.home:
    mDrawerLayout.openDrawer(GravityCompat.START);
    return true;
  }
  return super.onOptionsItemSelected(item);
 }

 @Override
 public void onBackPressed() {
  Intent a = new Intent(Intent.ACTION_MAIN);
  a.addCategory(Intent.CATEGORY_HOME);
  a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
  startActivity(a);



 }
}
