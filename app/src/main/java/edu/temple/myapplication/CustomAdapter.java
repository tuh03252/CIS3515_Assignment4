package edu.temple.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter
{
    private String[] imageNames;
    private int[] imagePhotos;
    private Context context;
    private LayoutInflater layoutInflater;

    public CustomAdapter(String[] imageNames, int[] imagePhotos, Context context)
    {
        this.imageNames=imageNames;
        this.imagePhotos=imagePhotos;
        this.context=context;
        this.layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount()
    {
        return imagePhotos.length;
    }

    @Override
    public Object getItem(int i)
    {
        return null;
    }

    @Override
    public long getItemId(int i)
    {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        if(view == null)
        {
            view = layoutInflater.inflate(R.layout.row_items, viewGroup, false);
        }

        TextView textView = view.findViewById(R.id.textViewName);
        ImageView imageView = view.findViewById(R.id.imageView);

        textView.setText(imageNames[i]);
        imageView.setImageResource(imagePhotos[i]);
        return view;
    }

}
