package alive.startother;

        import android.app.Activity;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MotionEvent;
        import android.view.View;
        import android.view.View.OnTouchListener;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnTouchListener{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            TextView tv = (TextView) findViewById(R.id.HelloWorld);
            tv.setOnTouchListener(this);
        }

        /**/
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }


        @Override
        public boolean onTouch(View v, MotionEvent event) {
            Intent intent = new Intent(this, ThirdActivity.class);
            intent.putExtra("message", "20175223");
            startActivity(intent);
            return true;
        }
}


