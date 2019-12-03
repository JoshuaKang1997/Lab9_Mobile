package edu.temple.bookcase2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class arrayAdapter extends BaseAdapter {
    Context context;
    ArrayList<Book> bookCollection;

    public ArrayAdapter(ArrayList<Book> bookCollection, Context context){
        this.bookCollection = bookCollection;
        this.context = context;
    }
    Override
    public int getCount() {
        return bookCollection.size();
    }

    @Override
    public Object getItem(int position) {
        return bookCollection.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.my_custom_adapter_layout, null);
        }

        TextView titleTextView = view.findViewById(R.id.titleView);

        public interface ArrayAdapterInterface{
            void playBook(Book theBook);
        }

    }

