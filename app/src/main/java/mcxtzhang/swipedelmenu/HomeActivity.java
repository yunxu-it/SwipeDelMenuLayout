package mcxtzhang.swipedelmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import mcxtzhang.listswipemenudemo.R;
import mcxtzhang.swipedelmenu.demo.LinearLayoutDeleteActivity;
import mcxtzhang.swipedelmenu.demo.ListViewDeleteActivity;
import mcxtzhang.swipedelmenu.demo.recyclerview.RecyclerViewDeleteActivity;
import mcxtzhang.swipedelmenu.demo.viewpager.ViewPagerActivity;

public class HomeActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);

    findViewById(R.id.rv).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivity(new Intent(v.getContext(), RecyclerViewDeleteActivity.class));
      }
    });

    findViewById(R.id.lv).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivity(new Intent(v.getContext(), ListViewDeleteActivity.class));
      }
    });

    findViewById(R.id.ll).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivity(new Intent(v.getContext(), LinearLayoutDeleteActivity.class));
      }
    });

    findViewById(R.id.viewPager).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        startActivity(new Intent(HomeActivity.this, ViewPagerActivity.class));
      }
    });
  }
}
