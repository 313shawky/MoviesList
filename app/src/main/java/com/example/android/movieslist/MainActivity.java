package com.example.android.movieslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView lv;
    ImageView imgV;
    TextView txtV;
    ArrayList<Data> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.myLV);

        data = new ArrayList<>();
        data.add(new Data("The Shawshank Redemption", R.drawable.theshawshankredemptionsmall));
        data.add(new Data("The Godfather", R.drawable.thegodfathersmall));
        data.add(new Data("The Godfather: Part II", R.drawable.thegodfatherpart2small));
        data.add(new Data("The Dark Knight", R.drawable.thedarkknightsmall));
        data.add(new Data("12 Angry Men", R.drawable.twelveangrymensmall));
        data.add(new Data("Schindler's List", R.drawable.schindlerslistsmall));
        data.add(new Data("The Lord of the Rings: The Return of the King", R.drawable.thelordoftheringsthereturnofthekingsmall));
        data.add(new Data("Pulp Fiction", R.drawable.plupfictionsmall));
        data.add(new Data("The Good, the Bad and the Ugly", R.drawable.thegoodthebadandtheuglysmall));
        data.add(new Data("Fight Club", R.drawable.fightclubsmall));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if (position == 0)
                {
                    Intent intent = new Intent(MainActivity.this, Movie1.class);
                    startActivity(intent);
                }

                if (position == 1)
                {
                    Intent intent = new Intent(MainActivity.this, Movie2.class);
                    startActivity(intent);
                }

                if (position == 2)
                {
                    Intent intent = new Intent(MainActivity.this, Movie3.class);
                    startActivity(intent);
                }

                if (position == 3)
                {
                    Intent intent = new Intent(MainActivity.this, Movie4.class);
                    startActivity(intent);
                }

                if (position == 4)
                {
                    Intent intent = new Intent(MainActivity.this, Movie5.class);
                    startActivity(intent);
                }

                if (position == 5)
                {
                    Intent intent = new Intent(MainActivity.this, Movie6.class);
                    startActivity(intent);
                }

                if (position == 6)
                {
                    Intent intent = new Intent(MainActivity.this, Movie7.class);
                    startActivity(intent);
                }

                if (position == 7)
                {
                    Intent intent = new Intent(MainActivity.this, Movie8.class);
                    startActivity(intent);
                }

                if (position == 8)
                {
                    Intent intent = new Intent(MainActivity.this, Movie9.class);
                    startActivity(intent);
                }

                if (position == 9)
                {
                    Intent intent = new Intent(MainActivity.this, Movie10.class);
                    startActivity(intent);
                }
            }
        });

        lv.setAdapter(new MyAdapter());
    }

    public class MyAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int position) {
            return data.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, final ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.list_items, null);

            imgV = view.findViewById(R.id.myImg);
            txtV = view.findViewById(R.id.myTxt);
            imgV.setImageResource(data.get(position).id);
            txtV.setText(data.get(position).name);

            return view;
        }
    }
}
