package com.taskznx;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.Toast;


public class MainActivity extends TabActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpec;

        tabSpec = tabHost.newTabSpec("tag1");
        tabSpec.setIndicator("List", getResources().getDrawable(android.R.drawable.ic_menu_sort_by_size));
        tabSpec.setContent(new Intent(this, ListActivity.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setIndicator("Scalling", getResources().getDrawable(android.R.drawable.ic_menu_gallery));
        tabSpec.setContent(new Intent(this, ScalingActivity.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag3");
        tabSpec.setIndicator("Service", getResources().getDrawable(android.R.drawable.ic_menu_view));
        tabSpec.setContent(new Intent(this, ServiceActivity.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag4");
        tabSpec.setIndicator("Map", getResources().getDrawable(android.R.drawable.ic_menu_mapmode));
        tabSpec.setContent(new Intent(this, MyMap.class));
        tabHost.addTab(tabSpec);

        // вторая вкладка будет выбрана по умолчанию
        tabHost.setCurrentTabByTag("tag1");

        // обработчик переключения вкладок
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            public void onTabChanged(String tabId) {


                // TODO отрисовать в фотошопе иконки и текст вкладок для API > 16
                /*if("tag1".equals(tabId)) {
                    //
                    TabWidget tw = (TabWidget)findViewById(android.R.id.tabs);
                    View tabView = tw.getChildTabViewAt(0);
                    TextView tv = (TextView)findViewById(android.R.id.title);
                    tv.setTextColor(getResources().getColor(android.R.color.holo_blue_light));
                    tabView.setBackground(getResources().getDrawable(android.R.drawable.btn_plus));

                    tabView = tw.getChildTabViewAt(1);
                    tv = (TextView)tabView.findViewById(android.R.id.title);
                    tv.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));

                    tabView.setBackgroundDrawable(getResources().getDrawable(android.R.drawable.btn_minus));
                }
                if("tag2".equals(tabId)) {
                    //
                    TabWidget tw = (TabWidget)findViewById(android.R.id.tabs);
                    View tabView = tw.getChildTabViewAt(0);
                    TextView tv = (TextView)tabView.findViewById(android.R.id.title);
                    tv.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
                    tabView.setBackground(getResources().getDrawable(android.R.drawable.btn_minus));


                    tabView = tw.getChildTabViewAt(1);
                    tv = (TextView)tabView.findViewById(android.R.id.title);
                    tv.setTextColor(getResources().getColor(android.R.color.holo_blue_light));
                    tabView.setBackgroundDrawable(getResources().getDrawable(android.R.drawable.btn_plus));

                }*/



                Toast.makeText(getBaseContext(), "tabId = " + tabId, Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
