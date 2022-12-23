package edu.cs.birzeit.burgerapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

import edu.cs.birzeit.burgerapp2.model.FoodItem;
import edu.cs.birzeit.burgerapp2.model.FoodItemStar;
import edu.cs.birzeit.burgerapp2.model.IItemsData;
import edu.cs.birzeit.burgerapp2.model.IItemsDataStar;
import edu.cs.birzeit.burgerapp2.model.ItemsData;
import edu.cs.birzeit.burgerapp2.model.ItemsDataStar;

public class MenuActivity2 extends AppCompatActivity {

    private Spinner spn2;
    private ListView lst2;
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
          spn2=findViewById(R.id.spnCats2);
           lst2=findViewById(R.id.lstItems2);
           btn2=findViewById(R.id.btnShow2);

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);

            IItemsDataStar data = new ItemsDataStar();
            List<String> cats2 = data.getCategories2();
            ArrayAdapter<String> adapterCats2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_dropdown_item, cats2);
            spn2.setAdapter(adapterCats2);

        spn2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String selectedCategory = parent.getItemAtPosition(position).toString();

//  if (parent.getItemAtPosition(position).equals("Burgers")) {
                lst2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//  Toast.makeText(getApplicationContext(), "You Selected : " + selectedCategory + " " +position, Toast.LENGTH_SHORT).show();
                        if (selectedCategory == "Hot Drinks") {
                            switch (position) {
                                case 0:
                                    startActivity(new Intent(MenuActivity2.this, HotChocolate.class));
                                    break;
                                case 1:
                                    startActivity(new Intent(MenuActivity2.this, WhiteChocolate.class));
                                    break;

                                case 2:
                                    startActivity(new Intent(MenuActivity2.this, PumpkinSpiceCreme.class));
                                    break;

                                case 3:
                                    startActivity(new Intent(MenuActivity2.this, CaramelBruleeCreme.class));
                                    break;

                                case 4:
                                    startActivity(new Intent(MenuActivity2.this, VanillaCreme.class));
                                    break;

                            }

                        } else if (selectedCategory == "Cold Drinks") {
                            switch (position) {
                                case 0:
                                    startActivity(new Intent(MenuActivity2.this, DragonDrink.class));
                                    break;
                                case 1:
                                    startActivity(new Intent(MenuActivity2.this, ParadiseDrink.class));
                                    break;

                                case 2:
                                    startActivity(new Intent(MenuActivity2.this, StrawberryAcai.class));
                                    break;

                                case 3:
                                    startActivity(new Intent(MenuActivity2.this, PineapplePassionfruit.class));
                                    break;


                            }

                        } else if (selectedCategory == "Cold Coffee") {
                            switch (position) {
                                case 0:
                                    startActivity(new Intent(MenuActivity2.this, Brew.class));
                                    break;

                                case 1:
                                    startActivity(new Intent(MenuActivity2.this, Irish.class));
                                    break;

                                case 2:
                                    startActivity(new Intent(MenuActivity2.this, VanillaSweetCream.class));
                                    break;
                            }

                        }
                    }

                });
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = spn2.getSelectedItem().toString();
                    List<FoodItemStar> results = data.getItemsByCat2(str);
                    ArrayAdapter<FoodItemStar> adapterItems = new ArrayAdapter<FoodItemStar>(MenuActivity2.this,
                            android.R.layout.simple_list_item_1, results);
                    lst2.setAdapter(adapterItems);
                }
            });

    }
}