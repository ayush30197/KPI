package com.example.android.kohlerpowerindia;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

 private ArrayList<DataModel> dataSet;
 Context context;
 String act;
public String ga,specs,wcer,pp;
 public static class MyViewHolder extends RecyclerView.ViewHolder {

  TextView textViewName;
  TextView textViewVersion;
  ImageView imageViewIcon;
  TextView gadraw;
  TextView spec;
  TextView wcert;
  TextView prodpres;
  public MyViewHolder(View itemView) {
   super(itemView);
   this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
   this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
   this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
   this.gadraw=(TextView)itemView.findViewById(R.id.gadraw);
   this.spec=(TextView)itemView.findViewById(R.id.spec);
   this.wcert=(TextView)itemView.findViewById(R.id.wcert);
   this.prodpres=(TextView)itemView.findViewById(R.id.prodpres);
  }
 }

 public CustomAdapter(ArrayList<DataModel> data,Context context) {
  this.dataSet = data;this.context=context;
 }

 @Override
 public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                        int viewType) {
  View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
  String con=parent.getContext().toString();
  if(con.contains("IRProducts"))
  {
   act="IRProducts";
   Toast.makeText(parent.getContext(),"1",Toast.LENGTH_LONG).show();
   view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
  }
  else if(con.contains("PRProductsActivity"))
  {
   act="PRProductsActivity";
   Toast.makeText(parent.getContext(),"2",Toast.LENGTH_LONG).show();
   view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout_pr, parent, false);
  }
  else if(con.contains("EngineActivity"))
  {
   act="EngineActivity";
   Toast.makeText(parent.getContext(),"3",Toast.LENGTH_LONG).show();
   view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout_eng, parent, false);
  }





  view.setOnClickListener(IRProducts.myOnClickListener);

  MyViewHolder myViewHolder = new MyViewHolder(view);
  return myViewHolder;

 }

 @Override
 public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

  TextView textViewName = holder.textViewName;
  TextView textViewVersion = holder.textViewVersion;
  ImageView imageView = holder.imageViewIcon;
  final TextView gadraw=holder.gadraw;
  TextView spec=holder.spec;
  final TextView wcert=holder.wcert;
TextView prodpres=holder.prodpres;

  textViewName.setText(dataSet.get(listPosition).getName());
  textViewVersion.setText(dataSet.get(listPosition).getVersion());
  imageView.setImageResource(dataSet.get(listPosition).getImage());
  gadraw.setOnClickListener(new View.OnClickListener() {
   @Override
   public void onClick(View v) {
    ga=dataSet.get(listPosition).getPdf();
//gadraw.setText(dataSet.get(listPosition).getPdf());
 Intent intent = new Intent(context,PdfViewActivity.class);
 intent.putExtra("name",ga);
 intent.putExtra("context",act);
 context.startActivity(intent);
   }
  });
spec.setOnClickListener(new View.OnClickListener() {

 @Override
 public void onClick(View v) {
  specs=dataSet.get(listPosition).getSpec_pdf();
  Intent intent = new Intent(context,PdfViewActivity.class);
  intent.putExtra("name",specs);
  intent.putExtra("context",act);
  context.startActivity(intent);

 }
});
wcert.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
  wcer=dataSet.get(listPosition).getWc();
  Intent intent = new Intent(context,PdfViewActivity.class);
  intent.putExtra("name",wcer);
  intent.putExtra("context",act);
  context.startActivity(intent);

 }
});
prodpres.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
  pp=dataSet.get(listPosition).getPp();
  Intent intent = new Intent(context,PdfViewActivity.class);
  intent.putExtra("name",pp);
  intent.putExtra("context",act);
  context.startActivity(intent);

 }
});
 }

 @Override
 public int getItemCount()
 {
  return dataSet.size();
 }
}

