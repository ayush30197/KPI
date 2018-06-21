package com.example.android.kohlerpowerindia;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PdfViewActivity extends AppCompatActivity {
 String act;
 int rcode;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_pdf_view);
Intent intent=getIntent();
//if(intent.hasExtra("name"))
{
String name=intent.getStringExtra("name")+".pdf";
act=intent.getStringExtra("context");
if(act.equals("ProductsActivity"))
{
 rcode=0;
}
 else if(act.equals("IRProducts"))
 {
  rcode=1;
 }
else  if(act.equals("PRProductsActivity"))
 {
  rcode=2;
 }

else if(act.equals("EngineActivity"))
  {
  rcode=3;
 }

//Toast.makeText(this,context,Toast.LENGTH_SHORT).show();
 CopyReadAssets(name,rcode);

}


 }

 private void CopyReadAssets(String name,int rcode) {
  AssetManager assetManager = getAssets();

  InputStream in = null;
  OutputStream out = null;
  File file = new File(getFilesDir(), name);
  try
  {
   in = assetManager.open(name);
   out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

   copyFile(in, out);
   in.close();
   in = null;
   out.flush();
   out.close();
   out = null;
  } catch (Exception e)
  {
   Log.e("tag", e.getMessage());
  }

  Intent intent = new Intent(Intent.ACTION_VIEW);
  intent.setDataAndType(
   Uri.parse("file://" + getFilesDir() + "/"+name),
   "application/pdf");
  if (intent.resolveActivity(getPackageManager()) != null) {
   startActivityForResult(Intent.createChooser(intent,"Select Chooser"),rcode);
  }
  else
  {
   Toast.makeText(this, "No such app ", Toast.LENGTH_SHORT).show();
  }


//startActivity(intent);
 }

 private void copyFile(InputStream in, OutputStream out) throws IOException {
  byte[] buffer = new byte[1024];
  int read;
  while ((read = in.read(buffer)) != -1)
  {
   out.write(buffer, 0, read);
  }
 }

 @Override
 protected void onActivityResult(int requestCode, int resultCode, Intent data) {
  super.onActivityResult(requestCode, resultCode, data);
  if(requestCode==1)
  {
   Intent intent=new Intent(PdfViewActivity.this,IRProducts.class);
   startActivity(intent);
  }
  else if( requestCode ==2)
  {
   Intent intent=new Intent(PdfViewActivity.this,PRProductsActivity.class);
   startActivity(intent);
  }
  else if(requestCode==3)
  {
   Intent intent=new Intent(PdfViewActivity.this,EngineActivity.class);
   startActivity(intent);
  }
 else if(requestCode==0)
  {
   Intent intent=new Intent(PdfViewActivity.this,ProductsActivity.class);
   startActivity(intent);
  }

 }
}

