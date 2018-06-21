package com.example.android.kohlerpowerindia;

import android.content.Context;
import android.content.Intent;
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

public class PRProductsActivity extends AppCompatActivity {

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

Context context=PRProductsActivity.this;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_prproducts);
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

    navigate(PRProductsActivity.this,menuItem);

    // set item as selected to persist highlight
    // close drawer when item is tapped
    mDrawerLayout.closeDrawers();

    Toast.makeText(PRProductsActivity.this, "You clicked" + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
    // Add code here to update the UI based on the item selected
    // For example, swap UI fragments here

    return true;
   }
  });



 }

 private void selectProduct() {
  data = new ArrayList<DataModel>();
  for (int i = 0; i < MyData.pr_one_name.length; i++) {
   data.add(new DataModel(
    MyData.pr_one_name[i],
    MyData.pr_one_rating[i],
    MyData.id_[i],
    MyData.pr_one_pic[i],
    MyData.ga_reo_draw[i],
    MyData.ss_reo_draw[i],
    MyData.wc_cert[3],
    MyData.pp_pr[0]
   ));
  }
  adapter = new CustomAdapter(data,context);
  recyclerView.setAdapter(adapter);

 }


 public void navigate(final Context context, MenuItem menuItem) {

  menuItem.setChecked(true);

  switch (menuItem.getItemId())
  {
   case R.id.type_home :
   {
    Intent intent = new Intent(PRProductsActivity.this,ProductsActivity.class);
    startActivity(intent);
    break;
   }
   case R.id.type1 :
   {
selectProduct();
    break;
   }
   case R.id.type2 :
   {
    data = new ArrayList<DataModel>();
    for (int i = 0; i < MyData.pr_two_name.length; i++) {
     data.add(new DataModel(
      MyData.pr_two_name[i],
      MyData.pr_two_rating[i],
      MyData.id_[i],
      MyData.pr_two_pic[i],
      MyData.ga_kd_draw[i],
      MyData.ss_kd_draw[i],
      MyData.wc_cert[4],
      MyData.pp_pr[1]
     ));
    }
    adapter = new CustomAdapter(data,context);
    recyclerView.setAdapter(adapter);

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


