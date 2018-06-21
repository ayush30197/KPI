package com.example.android.kohlerpowerindia;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LibraryActivity extends AppCompatActivity {
 String act="LibraryActivity";
 private DrawerLayout mDrawerLayout;
 private NavigationView navigationView;
 private ActionBar actionbar;
 private Button btn;
 private Toolbar toolbar;
ExpandableListView listView;
 private SimpleExpandableListAdapter mAdapter;
 private String groupItems[] = {"Corporate", "Industrial  Range","Project Range","Industry Specific Brochure"};
 private String[][] childItems = {{"Corporate Presentation", "Plant Presentation","Company Profile"},
                                  {"3.5-5 kVA brochure", "3.5-62.5 kVA brochure","82.5-200 kVA Brochure","320-650 kVA brochure"
                                   ,"Major installation industrial","Kohler DG Population"},
                                  {"REOZM range brochure","KD series brochure","REOZM series presentation",
                                   "KD series presentation","Major installation project "},
                                   {"Data center brochure","Hospitality brochure"}};
 private static final String NAME = "NAME";
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_library);
  toolbar = findViewById(R.id.toolbar);
  mDrawerLayout = findViewById(R.id.drawer_layout);
  listView=(ExpandableListView)findViewById(R.id.listView);
  //setSupportActionBar(toolbar);

  actionbar = getSupportActionBar();
  actionbar.setDisplayHomeAsUpEnabled(true);
  actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);
  navigationView = findViewById(R.id.nav_view);
  navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
   @Override
   public boolean onNavigationItemSelected(MenuItem menuItem) {
    navigate(LibraryActivity.this,menuItem);

    // set item as selected to persist highlight
    // close drawer when item is tapped
    mDrawerLayout.closeDrawers();

    Toast.makeText(LibraryActivity.this, "You clicked" + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
    // Add code here to update the UI based on the item selected
    // For example, swap UI fragments here

    return true;
   }
  });
  List<Map<String, String>> groupData = new ArrayList<Map<String, String>>();
  List<List<Map<String, String>>> childData = new ArrayList<List<Map<String, String>>>();
  // add data in group and child list
  for (int i = 0; i < groupItems.length; i++) {
   Map<String, String> curGroupMap = new HashMap<String, String>();
   groupData.add(curGroupMap);
   curGroupMap.put(NAME, groupItems[i]);

   List<Map<String, String>> children = new ArrayList<Map<String, String>>();
   for (int j = 0; j < childItems[i].length; j++) {
    Map<String, String> curChildMap = new HashMap<String, String>();
    children.add(curChildMap);
    curChildMap.put(NAME, childItems[i][j]);
   }
   childData.add(children);
  }
  // define arrays for displaying data in Expandable list view
  String groupFrom[] = {NAME};
  int groupTo[] = {R.id.heading};
  String childFrom[] = {NAME};
  int childTo[] = {R.id.childItem};


  // Set up the adapter
  mAdapter = new SimpleExpandableListAdapter(this, groupData,
   R.layout.group_items,
   groupFrom, groupTo,
   childData, R.layout.child_items,
   childFrom, childTo);
  listView.setAdapter(mAdapter);

  // perform set on group click listener event
  listView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
   @Override
   public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {

    // display a toast with group name whenever a user clicks on a group item
    Toast.makeText(getApplicationContext(), "Group Name Is :" + groupItems[groupPosition], Toast.LENGTH_LONG).show();

    return false;
   }
  });
  // perform set on child click listener event
  listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
   @Override
   public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
    String pdf_name="lib"+String.valueOf(groupPosition+""+childPosition);
    Intent intent=new Intent(LibraryActivity.this,PdfViewActivity.class);
    intent.putExtra("name",pdf_name);
    intent.putExtra("context",act);
    startActivity(intent);
    // display a toast with child name whenever a user clicks on a child item
    Toast.makeText(getApplicationContext(), "Child Name Is :" + pdf_name, Toast.LENGTH_LONG).show();
    return false;
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
 public void onBackPressed() {
  super.onBackPressed();
  Intent intent = new Intent(this,HomePage.class);
  startActivity(intent);
  this.finish();
 }
}
