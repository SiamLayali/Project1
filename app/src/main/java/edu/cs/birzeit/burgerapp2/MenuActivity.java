package edu.cs.birzeit.burgerapp2;

import androidx.appcompat.app.AppCompatActivity;
import edu.cs.birzeit.burgerapp2.model.FoodItem;
import edu.cs.birzeit.burgerapp2.model.IItemsData;
import edu.cs.birzeit.burgerapp2.model.ItemsData;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class MenuActivity extends AppCompatActivity {
    private Spinner spn;
    private ListView lst;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        spn = findViewById(R.id.spnCats);
        lst = findViewById(R.id.lstItems);
        btn = findViewById(R.id.btnShow);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        IItemsData data = new ItemsData();
        List<String> cats = data.getCategories();
        ArrayAdapter<String> adapterCats = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, cats);
        spn.setAdapter(adapterCats);


        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String selectedCategory = parent.getItemAtPosition(position).toString();

//  if (parent.getItemAtPosition(position).equals("Burgers")) {
                lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//  Toast.makeText(getApplicationContext(), "You Selected : " + selectedCategory + " " +position, Toast.LENGTH_SHORT).show();
                        if (selectedCategory == "Burgers") {
                            switch (position) {
                                case 0:
                                    startActivity(new Intent(MenuActivity.this, DetailsClassicBurger.class));
                                    break;
                                case 1:
                                    startActivity(new Intent(MenuActivity.this, DetailsZingerBurger.class));
                                    break;

                                case 2:
                                    startActivity(new Intent(MenuActivity.this, DetailsDoubleBurger.class));
                                    break;

                                case 3:
                                    startActivity(new Intent(MenuActivity.this, DetailsClassicTower.class));
                                    break;

                                case 4:
                                    startActivity(new Intent(MenuActivity.this, DetailsMiniBurger.class));
                                    break;

                            }

                        } else if (selectedCategory == "Chickens") {
                            switch (position) {
                                case 0:
                                    startActivity(new Intent(MenuActivity.this, SpicyWings.class));
                                    break;
                                case 1:
                                    startActivity(new Intent(MenuActivity.this, DetailsStrips.class));
                                    break;

                                case 2:
                                    startActivity(new Intent(MenuActivity.this, ChickenBonePieces.class));
                                    break;


                            }

                        } else if (selectedCategory == "Drinks") {
                            switch (position) {
                                case 0:
                                    startActivity(new Intent(MenuActivity.this, DietCola.class));
                                    break;
                                case 1:
                                    startActivity(new Intent(MenuActivity.this, ClassicCocaCola.class));
                                    break;

                                case 2:
                                    startActivity(new Intent(MenuActivity.this, Sprite.class));
                                    break;

                                case 3:
                                    startActivity(new Intent(MenuActivity.this, XL.class));
                                    break;


                            }

                        }
                        else if (selectedCategory == "Bucket Meals") {
                            switch (position) {
                                case 0:
                                    startActivity(new Intent(MenuActivity.this,DetailsDoubleBucket.class));
                                    break;
                                case 1:
                                    startActivity(new Intent(MenuActivity.this,DetailsColonelBucket .class));
                                    break;

                                case 2:
                                    startActivity(new Intent(MenuActivity.this, StarBucket.class));
                                    break;

                                case 3:
                                    startActivity(new Intent(MenuActivity.this, SoloBucket.class));
                                    break;

                                case 4:
                                    startActivity(new Intent(MenuActivity.this, FamilyStrips.class));
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


               /* if (parent.getItemAtPosition(position).equals("Burgers")) {

                    lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                            if (position == 0) {
                                // click classic
                                startActivity(new Intent(MenuActivity.this, DetailsClassicBurger.class));
                            } else if (position == 1) {
                                // click Zinger Burger
                                startActivity(new Intent(MenuActivity.this, DetailsZingerBurger.class));
                            } else if (position == 2) {
                                startActivity(new Intent(MenuActivity.this, DetailsDoubleBurger.class));

                            } else if (position == 3) {
                                startActivity(new Intent(MenuActivity.this, DetailsClassicTower.class));

                            } else if (position == 4) {
                                startActivity(new Intent(MenuActivity.this, DetailsMiniBurger.class));

                            }
                        }
                    });

                } else if (parent.getItemAtPosition(position).equals("Chickens")) {

                    //String newItem=spn.getSelectedItem().toString();

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

*/


      /*  lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    // TODO
                    // click classic
                    startActivity(new Intent(MenuActivity.this,DetailsClassicBurger.class));
                } else if (position == 1) {
                    // click Zinger Burger
                    startActivity(new Intent(MenuActivity.this, DetailsZingerBurger.class));
                } else if (position == 2) {
                    startActivity(new Intent(MenuActivity.this, DetailsDoubleBurger.class));

                } else if (position == 3) {
                    startActivity(new Intent(MenuActivity.this, DetailsClassicTower.class));

                } else if (position == 4) {
                    startActivity(new Intent(MenuActivity.this, DetailsMiniBurger.class));

                }
            }
        });*/


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = spn.getSelectedItem().toString();
                List<FoodItem> result = data.getItemsByCat(str);
                ArrayAdapter<FoodItem> adapterItems = new ArrayAdapter<FoodItem>(MenuActivity.this,
                        android.R.layout.simple_list_item_1, result);
                lst.setAdapter(adapterItems);
            }
        });
    }
    }






