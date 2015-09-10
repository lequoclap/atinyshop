package atinyshop.hacorp.laplq.atinyshop;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.rey.material.widget.FloatingActionButton;
import com.rey.material.widget.RippleManager;

public class LoginActivity extends ActionBarActivity {
    RippleManager mRippleManager;
    private Drawable[] mDrawables = new Drawable[2];
    private int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final FloatingActionButton fab_line = (FloatingActionButton)findViewById(R.id.fab_line);
        fab_line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fab_line.setLineMorphingState((fab_line.getLineMorphingState() + 1) % 2, true);
            }
        });

        final FloatingActionButton fab_image = (FloatingActionButton)findViewById(R.id.fab_image);
        mDrawables[0] = getResources().getDrawable(R.drawable.ic_autorenew_white_24dp);
        mDrawables[1] = getResources().getDrawable(R.drawable.ic_done_white_24dp);

        fab_image.setIcon(mDrawables[index], false);
        fab_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = (index + 1) % 2;
                fab_image.setIcon(mDrawables[index], true);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);



        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    protected RippleManager getRippleManager(){
        if(mRippleManager == null){
            synchronized (RippleManager.class){
                if(mRippleManager == null)
                    mRippleManager = new RippleManager();
            }
        }

        return mRippleManager;
    }
}
