package com.example.android.kohlerpowerindia;

import android.content.Context;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class EngineActivity extends AppCompatActivity {

 private static RecyclerView.Adapter adapter;
 private RecyclerView.LayoutManager layoutManager;
 private static RecyclerView recyclerView;
 private static ArrayList<DataModel> data;
 static View.OnClickListener myOnClickListener;
 private static ArrayList<Integer> removedItems;
 private DrawerLayout mDrawerLayout;
 private NavigationView navigationView;
 private ActionBar actionbar;
 private Button btn;
 private Toolbar toolbar;

 Context context=EngineActivity.this;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_engine);
  recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
  recyclerView.setHasFixedSize(true);
  layoutManager = new LinearLayoutManager(this);
  recyclerView.setLayoutManager(layoutManager);
  recyclerView.setItemAnimator(new DefaultItemAnimator());
  toolbar = findViewById(R.id.toolbar);
  mDrawerLayout = findViewById(R.id.drawer_layout);
  //setSupportActionBar(toolbar);
  actionbar = getSupportActionBar();
  actionbar.setDisplayHomeAsUpEnabled(true);
  actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);
  selectProduct();
  navigationView = findViewById(R.id.nav_view);
  navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
   @Override
   public boolean onNavigationItemSelected(MenuItem menuItem) {

    navigate(EngineActivity.this,menuItem);

    // set item as selected to persist highlight
    // close drawer when item is tapped
    mDrawerLayout.closeDrawers();

    Toast.makeText(EngineActivity.this, "You clicked" + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
    // Add code here to update the UI based on the item selected
    // For example, swap UI fragments here

    return true;
   }
  });



 }

 private void selectProduct() {
  data = new ArrayList<DataModel>();
  for (int i = 0; i < MyData.eng_one_name.length; i++) {
   data.add(new DataModel(
    MyData.eng_one_name[i],
    MyData.eng_one_rating[i],
    MyData.id_[i],
    MyData.eng_one_pic[i],
    MyData.ga_eng_draw[i],
    MyData.ss_eng_draw[i],
    MyData.wc_cert[5],
    MyData.pp_eng[0]
   ));
  }
  adapter = new CustomAdapter(data,context);
  recyclerView.setAdapter(adapter);

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
 public void onBackPressed() {
  super.onBackPressed();
  Intent intent = new Intent(this,ProductsActivity.class);
  startActivity(intent);
 }
}


