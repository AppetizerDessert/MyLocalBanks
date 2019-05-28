package c346.rp.edu.mylocalbanks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.security.cert.Extension;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);

        registerForContextMenu(btn1);
        registerForContextMenu(btn2);
        registerForContextMenu(btn3);
        
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0,"Website");
        menu.add(0,1,1,"Contact the bank");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int menuID = item.getItemId();
        id = v.getId();

        if (id == R.id.button1) {

            if (menuID == 0) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("https://www.dbs.com.sg"));
                startActivity(intentCall);
                return true;

            }else if (menuID == 1) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"1800"+"1111111"));
                startActivity(intentCall);
                return true;
            }

        } else if (id == R.id.button2) {

            if (menuID == 0) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("https://www.ocbc.com"));
                startActivity(intentCall);
                return true;

            }else if (menuID == 1) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"1800" + "3633333"));
                startActivity(intentCall);
                return true;
            }

        } else if (id == R.id.button3) {

            if (menuID == 0) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("https://www.uob.com.sg"));
                startActivity(intentCall);
                return true;

            }else if (menuID == 1) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"1800"+"2222121"));
                startActivity(intentCall);
                return true;
            }

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            btn1.setText("DBS");
            btn2.setText("OCBC");
            btn3.setText("UOB");
            return true;
        }else if (id == R.id.ChineseSelection) {
            btn1.setText("星展银行");
            btn2.setText("华侨银行");
            btn3.setText("大华银行");
            return true;
        }else  {
            btn1.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);
    }










}
